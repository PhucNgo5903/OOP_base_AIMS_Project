package hust.soict.hedspi.aims.screen;

import java.util.ArrayList;
import javax.swing.JDialog;
import hust.soict.hedspi.aims.cart.PhucNH_Cart;
import hust.soict.hedspi.aims.media.PhucNH_Media;
import hust.soict.hedspi.aims.media.PhucNH_Playable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PhucNH_CartScreenController {
	private PhucNH_Cart cart;

	@FXML
	private TableView<PhucNH_Media> tblMedia;
	@FXML
	private TextField tfFilter;
	@FXML
	private TableColumn<PhucNH_Media, Float> colMediaCost;
	@FXML
	private TableColumn<PhucNH_Media, String> colMediaTitle;
	@FXML
	private TableColumn<PhucNH_Media, String> colMediacategory;
	@FXML
	private ToggleGroup filterCategory;
	@FXML
    private Label price;
	@FXML
    private Button btnPlaceOrder;
	@FXML
	private Button btnPlay;
	@FXML
	private Button btnRemove;
	@FXML
	private RadioButton radioBtnFilterId;
	@FXML
	private RadioButton radioBtnFilterTitle;

	public PhucNH_CartScreenController(PhucNH_Cart cart) {
		super();
		this.cart = cart;
	}

	@FXML
	private void initialize() {
		colMediaTitle.setCellValueFactory(new PropertyValueFactory<PhucNH_Media, String>("title"));
		colMediacategory.setCellValueFactory(new PropertyValueFactory<PhucNH_Media, String>("category"));
		colMediaCost.setCellValueFactory(new PropertyValueFactory<PhucNH_Media, Float>("cost"));
		tblMedia.setItems(this.cart.getItemsOrdered());

		btnPlay.setVisible(false);
		btnRemove.setVisible(false);

		tblMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<PhucNH_Media>() {
			@Override
			public void changed(ObservableValue<? extends PhucNH_Media> observable, PhucNH_Media oldValue,
					PhucNH_Media newValue) {
				if (newValue != null)
					updateButtonBar(newValue);
			}
		});

		tfFilter.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (filterCategory.getSelectedToggle() == radioBtnFilterId && !newValue.isEmpty()
						&& !isInteger(newValue)) {
					tfFilter.setText(oldValue);
				} else {
					showFilteredMedia(newValue);
				}
			}
			private boolean isInteger(String newValue) {
				try {
					Integer.parseInt(newValue);
					return true;
				} catch (NumberFormatException e) {
					return false;
				}
			}
		});
		price.setText(" " + Float.toString(cart.totalCost()) + "$");
	}

	protected void showFilteredMedia(String newValue) {
		if (filterCategory.getSelectedToggle() == radioBtnFilterTitle) {
			ArrayList<PhucNH_Media> filterByTitle = new ArrayList<PhucNH_Media>();
			for (PhucNH_Media item : cart.getItemsOrdered()) {
				if (item.getTitle().contains(newValue)) {
					filterByTitle.add(item);
				}
			}
			tblMedia.setItems(FXCollections.observableList(filterByTitle));
		} else if (filterCategory.getSelectedToggle() == radioBtnFilterId) {
			ArrayList<PhucNH_Media> filterByID = new ArrayList<PhucNH_Media>();
			if (!newValue.isEmpty()) {
				int id = Integer.parseInt(newValue);
				for (PhucNH_Media item : cart.getItemsOrdered()) {
					if (item.getId() == id) {
						filterByID.add(item);
					}
				}
				tblMedia.setItems(FXCollections.observableList(filterByID));
			} else {
				tblMedia.setItems(FXCollections.observableList(cart.getItemsOrdered()));
			}
		}
	}

	private void updateButtonBar(PhucNH_Media media) {
		btnRemove.setVisible(true);
		if (media instanceof PhucNH_Playable) {
			btnPlay.setVisible(true);
		} else {
			btnPlay.setVisible(false);
		}
	}

	@FXML
	void btnRemovePressed(ActionEvent event) {
		PhucNH_Media media = tblMedia.getSelectionModel().getSelectedItem();
		cart.removeMedia(media);
		price.setText(" " + Float.toString(cart.totalCost()) + "$");
	}
	@FXML
	void btnPlayPressed(ActionEvent event) {
		JDialog playDialog = PhucNH_MediaStore.createPlayDialog(tblMedia.getSelectionModel().getSelectedItem());
        playDialog.setVisible(true);
        playDialog.setSize(300,200);
        playDialog.pack();
	}


    @FXML
    void placeOrderPressed(ActionEvent event) {
    	createPopUp();
        cart.getItemsOrdered().clear();
        tblMedia.setItems(FXCollections.observableList(cart.getItemsOrdered()));
        price.setText(" 0$");
    }

	private void createPopUp() {
		Stage popupwindow = new Stage();
        popupwindow.initModality(Modality.APPLICATION_MODAL);
        popupwindow.setTitle("Confirmation");

        Label label1 = new Label("Your order has been purchased!");
        label1.setFont(Font.font("Arial", FontWeight.BOLD,14));
        Label label2 = new Label("Your price: " + Float.toString(cart.totalCost()) + "$");
        Button button1= new Button("Accept!");
        label2.setTextFill(Color.RED);
        button1.setOnAction(e -> popupwindow.close());
        VBox layout= new VBox(10);
        layout.getChildren().addAll(label1, label2, button1);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 300, 200);
        popupwindow.setScene(scene);
        popupwindow.show();		
	}
}

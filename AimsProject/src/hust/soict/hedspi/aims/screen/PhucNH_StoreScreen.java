package hust.soict.hedspi.aims.screen;
import javax.swing.*;
import hust.soict.hedspi.aims.cart.PhucNH_Cart;
import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.store.PhucNH_Store;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PhucNH_StoreScreen extends JFrame {
	private static final long serialVersionUID = -3913201726916721062L;
	private PhucNH_Store store;
    private Container cp;
    private PhucNH_Cart cart;
    JPanel PhucNH_createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north,BoxLayout.Y_AXIS));
        north.add(PhucNH_createMenuBar());
        north.add(PhucNH_createHeader());
        return north;
    }

    JMenuBar PhucNH_createMenuBar() {
        JMenu menu = new JMenu("Options");
        JMenu smUpdateStore = new JMenu("Update Store");
        
        JMenuItem addBook = new JMenuItem("Add Book");
        smUpdateStore.add(addBook);
        addBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PhucNH_AddBookStoreScreen(store).setVisible(true);
            }
        });

        JMenuItem addCD = new JMenuItem("Add CD");
        smUpdateStore.add(addCD);
        addCD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PhucNH_AddCDStoreScreen(store).setVisible(true);
            }
        });

        JMenuItem addDVD = new JMenuItem("Add DVD");
        smUpdateStore.add(addDVD);
        addDVD.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                new PhucNH_AddDVDStoreScreen(store).setVisible(true);
            }
        });
        menu.add(smUpdateStore);
        menu.add(new JMenuItem("View store"));
        menu.add(new JMenuItem("View cart"));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);
        return menuBar;
    }

    JPanel PhucNH_createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header,BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(),Font.PLAIN,50));
        title.setForeground(Color.CYAN);

        JButton cart1 = new JButton("View cart");
        cart1.setPreferredSize(new Dimension(100,50));
        cart1.setMaximumSize(new Dimension(100,50));
        cart1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PhucNH_CartScreen(cart).setVisible(true);
            }
        });
        header.add(Box.createRigidArea(new Dimension(10,10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cart1);
        header.add(Box.createRigidArea(new Dimension(10,10)));
        return header;
    }

    JPanel PhucNH_createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3,3,2,2));
        LinkedList<PhucNH_Media> mediaStore = store.getItemsInStore();
        for(PhucNH_Media media : mediaStore) {
        	PhucNH_MediaStore cell = new PhucNH_MediaStore(media, cart);
            center.add(cell);
        }
        return center;
    }

    public PhucNH_StoreScreen(PhucNH_Store store, PhucNH_Cart myCart) {
        this.store  = store;
        this.cart = myCart;
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(PhucNH_createNorth(),BorderLayout.NORTH);
        cp.add(PhucNH_createCenter(),BorderLayout.CENTER);
        setVisible(true);
        setTitle("Store");
        setSize(1024,768);
    }


    private class PhucNH_AddDVDStoreScreen extends JFrame {
		private static final long serialVersionUID = 1L;

		public PhucNH_AddDVDStoreScreen(PhucNH_Store store) {
            this.setLayout(new GridLayout(4, 2, 5, 5));
            this.add(new JLabel("Enter title: "));
            TextField title = new TextField(10);
            this.add(title);
            this.add(new JLabel("Enter category: "));
            TextField category = new TextField(10);
            this.add(category);
            this.add(new JLabel("Enter cost: "));
            TextField cost = new TextField(10);
            this.add(cost);

            this.setTitle("Add DVD");
            this.setSize(300, 100);
            JButton turnInBtn = new JButton("Add");
            this.add(turnInBtn);
            turnInBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	PhucNH_DigitalVideoDisc dvd = new PhucNH_DigitalVideoDisc(2, title.getText(), category.getText(), Float.parseFloat(cost.getText()));
                    store.addMedia(dvd);
                    cp.add(PhucNH_createCenter(), BorderLayout.CENTER);
                    cp.revalidate();
                    title.setText("");
                    category.setText("");
                    cost.setText("");
                }
            });
            this.setVisible(true);
        }
    }

    private class PhucNH_AddCDStoreScreen extends JFrame {
		private static final long serialVersionUID = 1L;

		public PhucNH_AddCDStoreScreen(PhucNH_Store store) {
            this.setLayout(new GridLayout(7, 2, 5, 5));
            this.add(new JLabel("Enter title: "));
            TextField title = new TextField(10);
            this.add(title);
            this.add(new JLabel("Enter category: "));
            TextField category = new TextField(10);
            this.add(category);
            this.add(new JLabel("Enter cost: "));
            TextField cost = new TextField(10);
            this.add(cost);
            this.add(new JLabel("Enter artist: "));
            TextField artist = new TextField(10);
            this.add(artist);
            this.setTitle("Add CD");
            this.add(new JLabel("Number of tracks: "));
            TextField numberOfTracks = new TextField(10);
            this.add(numberOfTracks);
            this.pack();
            JButton turnInBtn = new JButton("Add");
            this.add(turnInBtn);
            turnInBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	PhucNH_CompactDisc dvd = new PhucNH_CompactDisc(2, title.getText(), category.getText(), Float.parseFloat(cost.getText()),artist.getText(),new ArrayList<PhucNH_Track>());
                    store.addMedia(dvd);
                    cp.add(PhucNH_createCenter(), BorderLayout.CENTER);
                    cp.revalidate();
                    title.setText("");
                    category.setText("");
                    cost.setText("");
                }
            });
            this.setVisible(true);
        }
    }
    
    private class PhucNH_AddBookStoreScreen extends JFrame {
		private static final long serialVersionUID = -145726792135069230L;

		public PhucNH_AddBookStoreScreen(PhucNH_Store store) {
            this.setLayout(new GridLayout(7, 2, 5, 5));
            this.add(new JLabel("Enter title: "));
            TextField title = new TextField(10);
            this.add(title);
            this.add(new JLabel("Enter category: "));
            TextField category = new TextField(10);
            this.add(category);
            this.add(new JLabel("Enter cost: "));
            TextField cost = new TextField(10);
            this.add(cost);
            this.add(new JLabel("Enter author (If multiple authors, use commas to fill in): "));
            TextField author = new TextField(10);
            this.add(author);
            this.setTitle("Add Book");
            this.pack();
            JButton turnInBtn = new JButton("Add");
            this.add(turnInBtn);
            turnInBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	String[] authorArray = author.getText().split(",");
                    List<String> authors = new ArrayList<String>();
                    
                    for (String a : authorArray) {
                        authors.add(a.trim());
                    }
            		PhucNH_Book book = new PhucNH_Book(4, title.getText(), category.getText(), Float.parseFloat(cost.getText()), authors);
            		store.addMedia(book);
                    cp.add(PhucNH_createCenter(), BorderLayout.CENTER);
                    cp.revalidate();
                    title.setText("");
                    category.setText("");
                    cost.setText("");
                    author.setText(null);
                }
            });
            this.setVisible(true);
        }
    }
    
    public static void main(String[] args) {
    	PhucNH_DigitalVideoDisc dvd = new PhucNH_DigitalVideoDisc(1, "Jurassic World", "Action", 30.75f,
				"Colin Trevorrow", 124);
    	PhucNH_DigitalVideoDisc dvd0 = new PhucNH_DigitalVideoDisc(2, "The Tomorrow War", "Science Fiction", 30.75f,
				"Chris McKay", 138);

    	ArrayList<PhucNH_Track> tracks = new ArrayList<PhucNH_Track>();
		tracks.add(new PhucNH_Track("Like I'm gonna lose you", 4));
		tracks.add(new PhucNH_Track("Let me down slowly", 3));
		PhucNH_CompactDisc cd = new PhucNH_CompactDisc(2, "Ban nhac buon", "Nhac Au - My", 10f, "Various artists", tracks);

        ArrayList<PhucNH_Track> hsr = new ArrayList<PhucNH_Track>();
        hsr.add(new PhucNH_Track("Hope Is the Thing With Feathers", 4));
        hsr.add(new PhucNH_Track("Sway to My Beat in Cosmos", 3));
        hsr.add(new PhucNH_Track("If I Can Stop One Heart From Breaking", 3));
        hsr.add(new PhucNH_Track("Had I Not Seen the Sun", 2));
        hsr.add(new PhucNH_Track("Sway to My Beat in Cosmos (Instrumental)", 3));
        hsr.add(new PhucNH_Track("If I Can Stop One Heart from Breaking (Instrumental)", 3));
        hsr.add(new PhucNH_Track("Hope is the Thing with Feathers (Instrumental)", 4));
        hsr.add(new PhucNH_Track("Had I Not Seen the Sun (Instrumental)", 2));
        PhucNH_CompactDisc cd2 = new PhucNH_CompactDisc(3, "INSIDE", "Penacony music", 37.25f, "Robin", hsr);

        List<String> authors = new ArrayList<String>();
		authors.add("Fujiko F. Fujio");
		PhucNH_Book book = new PhucNH_Book(4, "Doraemon", "Manga", 0.79f, authors);
		
        List<String> authors2 = new ArrayList<String>();
        authors2.add("Tappei Nagatsuki");
        PhucNH_Book book2 = new PhucNH_Book(5, "Re:Zero kara Hajimeru Isekai Seikatsu", "Light novel", 21.01f, authors2);
        
        PhucNH_Store store = new PhucNH_Store();
        store.addMedia(cd);
        store.addMedia(cd2);
        store.addMedia(dvd);
        store.addMedia(dvd0);
        store.addMedia(book);
        store.addMedia(book2);

        PhucNH_Cart myCart = new PhucNH_Cart();
        new PhucNH_StoreScreen(store,myCart);
    }
}
package hust.soict.hedspi.aims.screen;



import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;



import hust.soict.hedspi.aims.store.Store;
import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.*;


public class StoreScreen extends JFrame {
    private static Store store = new Store();
    private static Cart cart = new Cart();

    public static void initSetup() {

        DigitalVideoDisc dvd1 = new DigitalVideoDisc( "The Lion King", "Animation", "Roger Allers", 87, 19.95f);     
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f); 
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3,"Aladin", "Animation", 18.99f);
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);

    
        Book book = new Book("Edogawa Conan", "Detective", 20.00f);
        Book book1 = new Book("The beauty of human", "Biography", 202.00f);
        Book book2 = new Book("First Day On Mars", "Science", 120.00f);
        store.addMedia(book);
        store.addMedia(book1);
        store.addMedia(book2);


        // Add CDs with Tracks
        CompactDisc cd1 = new CompactDisc(7, "NguaO", "Music", 1500.98f, "Unknown", 864, "Dangrangto");
        cd1.addTrack(new Track("Tim Anh Ghen", 161));
        cd1.addTrack(new Track("GoodBye", 403));
        cd1.addTrack(new Track("Luot Tren Con Song", 300));

        CompactDisc cd2 = new CompactDisc(8, "The Wrxdies", "Music", 2000.22f, "Unknown", 583, "NamHaiPham");
        cd2.addTrack(new Track("Tim Anh Ghen 2", 214));
        cd2.addTrack(new Track("Bang Qua Cau Giay", 210));
        cd2.addTrack(new Track("29", 159));

        CompactDisc cd3 = new CompactDisc(9, "Making My Way", "Music", 1000.98f, "Unknown", 520, "STMTP");
        cd3.addTrack(new Track("The Feeling", 245));
        cd3.addTrack(new Track("No Sense", 275));

        // Add CDs to the store
        store.addMedia(cd1);
        store.addMedia(cd2);
        store.addMedia(cd3);
        

    }
    
    public static void main(String[] args) {
        initSetup();
		new StoreScreen(store);
	}


    public StoreScreen(Store store) {
        StoreScreen.store = store;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);
        
        setTitle("Store");
		setSize(1024, 768);
		setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   

    JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}

    JMenuBar createMenuBar() {

        JMenu menu = new JMenu("Options");

        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem smAddBook = new JMenuItem("Add Book");
        JMenuItem smAddCD = new JMenuItem("Add CD");
        JMenuItem smAddDVD = new JMenuItem("Add DVD");
        smUpdateStore.add(smAddBook);
        smUpdateStore.add(smAddCD);
        smUpdateStore.add(smAddDVD);        

        smAddBook.addActionListener(new btnMenuListener());
        smAddCD.addActionListener(new btnMenuListener());
        smAddDVD.addActionListener(new btnMenuListener());

        menu.add(smUpdateStore);

        JMenuItem viewStoreMenu = new JMenuItem("View store");
        JMenuItem viewCartMenu = new JMenuItem("View cart");
        menu.add(viewStoreMenu);
        menu.add(viewCartMenu);
        viewStoreMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StoreScreen(store);
            }
        });
        viewCartMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CartScreen(cart);
            }
        });

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    private class btnMenuListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if (command.equals("Add Book")) {
				new AddBookToStoreScreen(store);
			} else if (command.equals("Add CD")) {
				new AddCompactDiscToStoreScreen(store);
			} else if (command.equals("Add DVD")) {
				new AddDigitalVideoDiscToStoreScreen(store);
			} 
		}
	}

    JPanel createHeader() {

        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);
    
        JButton cartBtn = new JButton("View cart");
        cartBtn.setPreferredSize(new Dimension(100, 50));
        cartBtn.setMaximumSize(new Dimension(100, 50));
        cartBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CartScreen(cart);
            }
        });
        


        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cartBtn);
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    JPanel createCenter() {

        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));


        ArrayList<Media> mediaInStore = store.getItemsInStorePhucNH();
        for (int i = 0; i < mediaInStore.size(); i++) {
            MediaStore cell = new MediaStore(mediaInStore.get(i), cart);
            center.add(cell);
        }
        
        return center;
    }

}

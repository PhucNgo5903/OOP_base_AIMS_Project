package hust.soict.hedspi.aims;
import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.store.Store;
import java.util.*;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();

    public static void main(String[] args) {
        
        // Init add media to the store
        initSetup();

        boolean exit = false;
        // CLI
        while (!exit) {
            
            showMenu();

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    exit = true;
                    System.out.println("Good bye!");
                    break;
                case 1:
                    clearConsole();
                    storeMenu(scanner);
                    break;
                case 2:
                    clearConsole();
                    updateStoreMenu(scanner);
                    break;
                case 3:
                    clearConsole();
                    cartMenu(scanner);
                    break;
                default:
                    clearConsole(); 
                    System.out.println("Invalid option, please choose again.");
                    break;
            }

        }

    }
    public static void clearConsole() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
        }
    }
    // init store setup 
    public static void initSetup() {

        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", "Roger Allers", 87, 19.95f);     
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"Star War", "Science Fiction", "George Lucas", 87, 24.95f); 
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3,"Aladin", "Animation", 18.99f);
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);

    
        Book book = new Book(4,"Edogawa Conan", "Detective", 20.00f);
        Book book1 = new Book(5,"The beauty of human", "Biography", 202.00f);
        Book book2 = new Book(6,"First Day On Mars", "Science", 120.00f);
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
        
        clearConsole();
    }
    
    // Print method
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store PhucNH");
        System.out.println("2. Update store PhucNH");
        System.out.println("3. See current cart PhucNH");
        System.out.println("0. Exit PhucNH");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3 PhucNH");
    }
    public static void storeMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            store.print();
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media's details PhucNH");
            System.out.println("2. Add a media to cart PhucNH");
            System.out.println("3. Play a media PhucNH");
            System.out.println("4. See current cart PhucNH");
            System.out.println("0. Back PhucNH");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4 PhucNH");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    clearConsole();
                    back = true;
                    break;

                case 1:
                boolean foundDetails = false;
                while (!foundDetails) {
                    System.out.println("Enter the ID of the media (type 0 to stop): PhucNH");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Xử lý newline sau khi nhập số
                    if (id == 0) {
                        clearConsole();
                        break;
                    }
                    Media media = store.findMediaById(id);
                    if (media != null) {
                        clearConsole();
                        System.out.println("Details: PhucNH");
                        System.out.println(media);
                        mediaDetailsMenu(scanner, media);
                        foundDetails = true;
                    } else {
                        System.out.println("***MEDIA NOT FOUND***");
                    }
                }
                break;
                case 2:
                boolean foundToAdd = false;
                while (!foundToAdd) {
                    System.out.println("Enter the ID of the media (type 0 to stop): PhucNH ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Xử lý newline sau khi nhập số
                    if (id == 0) {
                        clearConsole();
                        break;
                    }
                    Media media = store.findMediaById(id);
                    if (media != null) {
                        cart.addMedia(media);
                        foundToAdd = true;
                    } else {
                        System.out.println("***MEDIA NOT FOUND***");
                    }
                }
                break;
                case 3:
                boolean foundToPlay = false;
                while (!foundToPlay) {
                    System.out.println("Enter the ID of the media (type 0 to stop): PhucNH ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    if (id == 0) {
                        clearConsole();
                        break;  
                    }
                    Media media = store.findMediaById(id);
                    if (media != null) {
                        if (media instanceof Disc || media instanceof CompactDisc) {
                            media.play();
                        } else {
                            System.out.println("This type of media is not supported! PhucNH");
                        }
                        foundToPlay = true;
                    } else {
                        System.out.println("***MEDIA NOT FOUND***");
                    }
                }
                break;
                case 4:
                    clearConsole(); 
                    cartMenu(scanner);
                    break;    
                default:
                    clearConsole(); 
                    System.out.println("Invalid option, please choose again. PhucNH");
                    break;
            }
        }
    }
    public static void mediaDetailsMenu(Scanner scanner, Media media) {
        boolean back = false;
        while (!back) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add to cart PhucNH");
            System.out.println("2. Play PhucNH");
            System.out.println("0. Back PhucNH");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2 PhucNH");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    clearConsole(); 
                    back = true;
                    break;
                case 1:
                    cart.addMedia(media);
                    break;
                case 2:
                    if (media instanceof Disc || media instanceof CompactDisc) {
                        media.play();
                    } else {
                        System.out.println("This type of media is not supported! PhucNH");
                    }
                    break;
                default:
                    clearConsole(); 
                    System.out.println("Invalid option, please choose again. PhucNH");
                    break;
            }
        }
    }
    public static void cartMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            cart.print();
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter medias in cart PhucNH");
            System.out.println("2. Sort medias in cart PhucNH");
            System.out.println("3. Remove media from cart PhucNH");
            System.out.println("4. Play a media PhucNH");
            System.out.println("5. Place order PhucNH");
            System.out.println("0. Back PhucNH");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4-5 PhucNH");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    clearConsole(); 
                    back = true;
                    break;
                case 1:
                    System.out.println("Options:");
                    System.out.println("-------------------------------------");
                    System.out.println("1. Filter medias in cart by id PhucNH");
                    System.out.println("2. Filter medias in cart by title PhucNH");
                    System.out.println("-------------------------------------");
                    System.out.println("Please choose a number: 1-2 PhucNH");
                    int filterOption = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    while (!found) {
                        if (filterOption == 1) {
                            System.out.println("Enter the id to filter (type 0 to stop): PhucNH");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            if (id == 0) {
                                clearConsole();
                                break;
                            }
                            cart.searchByID(id);
                            found = true;
                        } else if (filterOption == 2) {
                            System.out.println("Enter the title to filter (type 0 to stop): PhucNH");
                            String title = scanner.nextLine();
                            if (title.equals("0")) {
                                clearConsole();
                                break;
                            }
                            cart.searchByTitle(title);
                            found = true;
                        } else if (filterOption == 0) {
                            clearConsole();
                            break;
                        } else {
                            System.out.println("Invalid option. PhucNH");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Options:");
                    System.out.println("--------------------------------");
                    System.out.println("1. Sort medias in cart by title PhucNH");
                    System.out.println("2. Sort medias in cart by cost PhucNH");
                    System.out.println("--------------------------------");
                    int sortOption = scanner.nextInt();
                    scanner.nextLine();
                    if (sortOption == 1) {
                        cart.sortMediaByTitle();
                    } else if (sortOption == 2) {
                        cart.sortMediaByCost();
                    } else {
                        System.out.println("Invalid option.");
                    }
                    break;
                case 3:
                boolean foundToRemove = false;
                while (!foundToRemove) {
                    System.out.println("Enter the ID of the media (type 0 to stop): PhucNH ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Đọc newline sau khi nhập số
                    if (id == 0) {
                        clearConsole();
                        break;
                    }
                    Media media = cart.searchToRemove(id); // Giả sử searchToRemove nhận ID
                    if (media != null) {
                        clearConsole();
                        cart.removeMedia(media);
                        foundToRemove = true;
                    } else {
                        System.out.println("***MEDIA NOT FOUND***");
                    }
                }
                break;
                case 4:
                boolean foundToPlay = false;
                while (!foundToPlay) {
                    System.out.println("Enter the ID of the media (type 0 to stop): PhucNH ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    if (id == 0) {
                        clearConsole();
                        break;
                    }
                    Media media = store.findMediaById(id); 
                    if (media != null) {
                        if (media instanceof Disc || media instanceof CompactDisc) {
                            media.play();
                        } else {
                            System.out.println("This type of media is not supported! PhucNH");
                        }
                        foundToPlay = true;
                    } else {
                        System.out.println("***MEDIA NOT FOUND***");
                    }
                }
                break; 
                case 5:
                    clearConsole();
                    cart.emptyCartPhucNH();
                    
                    break;
                default:
                    clearConsole(); 
                    System.out.println("Invalid option, please choose again.");
                    break;
            }
        }
    }
    public static void updateStoreMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add a media to the store PhucNH");
            System.out.println("2. Remove a media from the store PhucNH");
            System.out.println("0. Back PhucNH");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2 PhucNH");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    clearConsole();
                    back = true;
                    break;
                
                case 1:
                System.out.println("Enter the category of the media (1) Book, (2) CD, (3) DVD or (0) exit: PhucNH");
                int categoryChoice = scanner.nextInt();
                scanner.nextLine();

                if (categoryChoice == 1) {
                    System.out.println("Enter book ID: PhucNH");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter book title: PhucNH");
                    String bookTitle = scanner.nextLine();
                    System.out.println("Enter book category: PhucNH");
                    String bookCategory = scanner.nextLine();
                    System.out.println("Enter book cost: PhucNH");
                    float bookCost = scanner.nextFloat();
                    scanner.nextLine();

                    Book newBook = new Book(bookId, bookTitle, bookCategory, bookCost);
                    store.addMedia(newBook);
                } else if (categoryChoice == 2) {
                    System.out.println("Enter CD ID: PhucNH");
                    int cdId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter CD title: PhucNH");
                    String cdTitle = scanner.nextLine();
                    System.out.println("Enter CD category: PhucNH");
                    String cdCategory = scanner.nextLine();
                    System.out.println("Enter CD cost: PhucNH");
                    float cdCost = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.println("Enter CD director: PhucNH");
                    String cdDirector = scanner.nextLine();
                    System.out.println("Enter CD artist: PhucNH");
                    String cdArtist = scanner.nextLine();
                    System.out.println("Enter number of tracks: PhucNH");
                    int numTracks = scanner.nextInt();
                    scanner.nextLine();

                    CompactDisc newCD = new CompactDisc(cdId, cdTitle, cdCategory, cdCost, cdDirector, numTracks, cdArtist);
                    
                    System.out.println("Do you want to add tracks to your CD? (1) Yes (0) No: PhucNH");
                    int addTrack = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (addTrack == 1) {
                        for (int i = 0; i < numTracks; i++) {
                            System.out.println("Your " + (i + 1) + " track: PhucNH");
                            System.out.println("Enter track title: PhucNH");
                            String trackTitle = scanner.nextLine();
                            System.out.println("Enter track length: PhucNH");
                            int trackLength = scanner.nextInt();
                            scanner.nextLine();

                            Track newTrack = new Track(trackTitle, trackLength);
                            newCD.addTrack(newTrack);
                        }
                    }
                    store.addMedia(newCD);
                } else if (categoryChoice == 3) {
                    System.out.println("Enter DVD ID: PhucNH");
                    int dvdId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter DVD title: PhucNH");
                    String dvdTitle = scanner.nextLine();
                    System.out.println("Enter DVD category: PhucNH");
                    String dvdCategory = scanner.nextLine();
                    System.out.println("Enter DVD cost: PhucNH");
                    float dvdCost = scanner.nextFloat();
                    scanner.nextLine();

                    DigitalVideoDisc newDVD = new DigitalVideoDisc(dvdId, dvdTitle, dvdCategory, dvdCost);
                    store.addMedia(newDVD);
                } else if (categoryChoice == 0) {
                    clearConsole();
                    break;
                } else {
                    System.out.println("Invalid option.");
                }
                break;
                case 2:
                boolean foundToRemove = false;
                while (!foundToRemove) {
                    System.out.println("Enter the ID of the media (type 0 to stop): PhucNH");
                    int idForRemove = scanner.nextInt();  
                    scanner.nextLine();  
                    if (idForRemove == 0) {
                        clearConsole();
                        break;
                    }
                    Media media = store.findMediaById(idForRemove);  
                    if (media != null) {
                        clearConsole();
                        store.removeMedia(media);  
                        foundToRemove = true;
                    } else {
                        System.out.println("***MEDIA NOT FOUND***");
                    }
                }
                break;
                default:
                    clearConsole();
                    System.out.println("Invalid option, please choose again.");
                    break;
            }
        }
    }
}
        
// package hust.soict.hedspi.aims;
// import hust.soict.hedspi.aims.cart.Cart;
// import hust.soict.hedspi.aims.media.Media;
// import hust.soict.hedspi.aims.media.Book;
// import hust.soict.hedspi.aims.media.DigitalVideoDisc;
// import hust.soict.hedspi.aims.media.CompactDisc;
// import java.util.ArrayList;
// import java.util.List;


// public class Aims {
//     public static void main(String[] args) {
        
//         List<Media> mediaPhucNH = new ArrayList<>();

//         CompactDisc cdPhucNH = new CompactDisc(1, "CD1", "Fantasy", 13F, "Lucas", 123, "John");

//         DigitalVideoDisc dvdPhucNH = new DigitalVideoDisc(2, "DVD Title 1", "Action", "Director 1", 120, 15.99f);

//         Book bookPhucNH = new Book(3, "Book Title 1", "Fiction", 29.99f);

//         mediaPhucNH.add(cdPhucNH);

//         mediaPhucNH.add(dvdPhucNH);

//         mediaPhucNH.add(bookPhucNH);

//         for (Media mPhucNH : mediaPhucNH) {

//         System.out.println(mPhucNH.toString());

//         }
//     }
// }

        



import java.util.*;
//creating class Publication  
class Publication {  
    String title;  
    double price;  
    int availableCopies;  
    int soldCopies;  
     
    //Constructor initializing publication details 
    Publication(String title, double price, int availableCopies) {  
        this.title = title;  
        this.price = price;  
        this.availableCopies = availableCopies;  
        this.soldCopies = 0;   
    }  
     
    //Method to process selling copies 
    void sellCopies(int numCopies) {  
        if (numCopies <= availableCopies) {  
            availableCopies -= numCopies;  
            soldCopies += numCopies;  
        } else {  
            System.out.println("Not enough stock available.");  
        }  
    }  
     
    //Method to add more copies to stock 
    void addCopies(int numCopies) {  
        availableCopies += numCopies;  
    }  
     
    String getTitle() {  
        return title;  
    }  
     
    double getPrice() {  
        return price;  
    }  
     
    int getAvailableCopies() {  
        return availableCopies;  
    }  
     
    int getSoldCopies() {  
        return soldCopies;  
    }  
     
    //Calculating total sale value 
    double calculateTotalSales() {  
        return price * soldCopies;  
    }  
}  
 
//Book class inheriting from Publication 
class Book extends Publication {  
    String writer;  
     
    Book(String title, double price, int availableCopies, String writer) {  
        super(title, price, availableCopies);  
        this.writer = writer;  
    }  
     
    String getWriter() {  
        return writer;  
    }  
}  
 
//Magazine class inheriting from Publication 
class Magazine extends Publication {  
    int currentEdition;  
     
    Magazine(String title, double price, int availableCopies, int currentEdition) {  
        super(title, price, availableCopies);  
        this.currentEdition = currentEdition;  
    }  
     
    //Updating to a new magazine edition 
    void updateEdition(int newEdition) {  
        this.currentEdition = newEdition;  
    }  
     
    int getCurrentEdition() {  
        return currentEdition;  
    }  
}  
 
//Main class to handle media inventory management 
public class PublicationA2 {  
    public static void main(String[] args) {  
        //User input through scanner 
        Scanner input = new Scanner(System.in);  
         
        //Input for Book details 
        System.out.println("Enter the title of the book: ");  
        String bookTitle = input.nextLine();  
        System.out.println("Enter the price of the book: ");  
        double bookPrice = input.nextDouble();  
        System.out.println("Enter the initial stock for the book: ");  
        int bookStock = input.nextInt();  
        input.nextLine();  // Consume the newline character 
        System.out.println("Enter the author of the book: ");  
        String bookWriter = input.nextLine();  
        System.out.println("\n");  
         
        //Creating a Book object 
        Book book = new Book(bookTitle, bookPrice, bookStock, bookWriter);  
         
        //Input for Magazine details 
        System.out.println("Enter the title of the magazine: ");  
        String magazineTitle = input.nextLine();  
        System.out.println("Enter the price of the magazine: ");  
        double magazinePrice = input.nextDouble();  
        System.out.println("Enter the initial stock for the magazine: ");  
        int magazineStock = input.nextInt();  
        System.out.println("Enter the current issue number of the magazine: ");  
        int currentMagazineEdition = input.nextInt();  
        System.out.println("\n");  
         
        //Creating a Magazine object 
        Magazine magazine = new Magazine(magazineTitle, magazinePrice, magazineStock, 
currentMagazineEdition);  
         
        //Processing book orders and sales 
        System.out.println("Enter the number of books to add to inventory: ");  
        int additionalBookStock = input.nextInt();  
        book.addCopies(additionalBookStock);  
        System.out.println("Enter the number of books sold: ");  
        int soldBookCount = input.nextInt();  
        book.sellCopies(soldBookCount);  
         
        //Processing magazine orders and sales 
        System.out.println("Enter the number of magazines to add to inventory: ");  
        int additionalMagazineStock = input.nextInt();  
        magazine.addCopies(additionalMagazineStock);  
        System.out.println("Enter the number of magazines sold: ");  
        int soldMagazineCount = input.nextInt();  
        magazine.sellCopies(soldMagazineCount);  
         
        //Calculating total sales 
        double totalSales = book.calculateTotalSales() + magazine.calculateTotalSales();  
         
        //Displaying the output for book and magazine sales 
        System.out.println("\n");  
        System.out.println("Author  : " + book.getWriter());  
        System.out.println("Book Title   : " + book.getTitle());  
        System.out.println("Total copies added for Book  : " + additionalBookStock);  
        System.out.println("Total copies sold for Book     : " + soldBookCount);  
        System.out.println("Total Sales from Book : " + book.calculateTotalSales());  
        System.out.println("-----------------------------------------------------"); 
        System.out.println("Magazine Title   : " + magazine.getTitle());  
        System.out.println("Total copies added for Magazine : " + additionalMagazineStock);  
        System.out.println("Total copies sold for Magazine    : " + soldMagazineCount);  
        System.out.println("Current issue of Magazine       :" + magazine.getCurrentEdition()); 
        System.out.println("Total Sales from Magazine            : " + 
magazine.calculateTotalSales());  
         
        System.out.println("\n\nTotal sales from all publications: " + totalSales);  
         
        //Closing the scanner 
        input.close();  
    }  
}
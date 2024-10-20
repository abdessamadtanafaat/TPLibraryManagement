public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Customer customer1 = new Customer("Tanafaat");
        Customer customer2 = new Customer("ElMeslouhi");

        Book book1 = new Book("1996", "Java Script Book");
        Book book2 = new Book("2013", "React Book");

        DigitalBook digitalBook = new DigitalBook("Digital Book", "John");

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(digitalBook);

        customer1.checkOutItem(book1);
        customer2.checkOutItem(book2);

        customer1.returnItem(book1);
        customer2.checkOutItem(book1);



    }
}

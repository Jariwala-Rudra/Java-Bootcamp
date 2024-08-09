public class Book {
    String name = "Book";
    String author = "Jeff";
    double price = 16.0;
    boolean sold = false;
    public void changeSell () {
        sold = true;
        System.out.println("Is the book sold? " + sold);
    }
    public void changeName(String newName) {
        name = newName;
        System.out.println("Book Name: " + name);
    }
}


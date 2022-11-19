public class Main {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harrey Potter", 150);
        Book lordOfTheRings = new Book("Lord Of the Rings", -100);
        //lordOfTheRings.changePageNumber(-1000);
        //System.out.println(lordOfTheRings.showPageNumber());
        System.out.println(lordOfTheRings.getName());
    }
}

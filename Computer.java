public class Computer extends TangibleAsset {
    String isbn;

    public Computer(String name, int price, String color, String isbn) {
        super(name, price, color);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return this.isbn;
    }
}

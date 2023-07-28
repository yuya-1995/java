public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.setHP(100);
        h.setName("佐々木");
        
        Hotel hotel = new Hotel();
        hotel.checkIn(h);

        System.out.println(h.getHP());
    }
}

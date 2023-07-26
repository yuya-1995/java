public class Main {
    public static void main(String[] args) {
        //メイン側でいちいち初期化するのは面倒・・・
        Hero h = new Hero("佐々木");
        Hero hh = new Hero();
        System.out.println(h.HP);
        System.out.println(h.name);
        System.out.println(hh.HP);
        System.out.println(hh.name);
    }
}

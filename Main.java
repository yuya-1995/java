public class Main {
    public static void main(String[] args) {
        //キノコ
        Matango m = new Matango();
        m.HP = 100;

        //スーパーヒーロー
        SuperHero sh = new SuperHero();
        sh.fly();
        sh.attack(m);

        //ヒーロー
        // Hero h = new Hero();
        // h.attack(m);

        //ウェポン
        Weapon w = new Weapon();

    }
}

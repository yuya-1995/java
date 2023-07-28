public class Main {
    public static void main(String[] args) {
        // Empty e = new Empty();
        // String s = e.toString();
        // System.out.println(s); //出力 Empty@7ad041f3

        Hero h = new Hero();
        h.name = "ささき";
        h.HP = 100;

        System.out.println(h.toString()); // HeroクラスにてtoString()をオーバーライドしないとHero@7ad041f3と出力される

        Hero h1 = new Hero();
        h1.name = "たなか";
        h1.HP = 100;
        Hero h2 = new Hero();
        h2.name = "たなか";
        h2.HP = 100;

        if (h1.equals(h2)) {// Heroクラスにてequals()をオーバーライドしないと正しい結果にならない
            System.out.println("同じ内容");
        } else {
            System.out.println("違う内容");
        }

        Hero.setRandomMoney(); //static　インスタンス不要
        System.out.println(Hero.money);

    }
}

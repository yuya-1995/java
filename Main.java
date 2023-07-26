public class Main {
    public static void main(String[] args) {
        //Hero
        Hero h = new Hero();
        h.name = "ささき";
        h.HP = 100;
        //Sword
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;
        h.Sword = s;

        //Wizard
        Wizard w = new Wizard();
        w.name = ("たなか");
        w.HP = 70;

        //Matango
        Matango m1 = new Matango();
        m1.HP = 50;
        m1.suffix = 'A';
        Matango m2 = new Matango();
        m2.HP = 50;
        m2.suffix = 'B';
      
        //冒険の始まり
        w.heal(h);
        System.out.println(h.HP);
    }
}

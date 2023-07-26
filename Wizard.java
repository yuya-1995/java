public class Wizard {
    String name; //名前の宣言
    int HP; //HPの宣言
    public void heal(Hero h){
        h.HP += 10;
        System.out.println(h.name + "は10回復した");
    }
}

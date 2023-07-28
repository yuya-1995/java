public class Wizard extends Character {
    int MP;

    public Wizard(String name,int HP,int MP){
        super(name,HP);
        this.MP = MP;
    }

    public void attack(Matango m){
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に3ダメージ！");
        m.HP -= 3;
    }

    public void fiireball(Matango m){
        System.out.println(this.name + "は火の玉を放った");
        System.out.println("敵に20ダメージ");
        m.HP -= 20;
        this.MP -= 5;
    }
}

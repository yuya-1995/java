public class Hero extends Character {

    public Hero(String name,int HP){
        super(name, HP);
    }

    public void attack(Matango m){
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に3ダメージ！");
        m.HP -= 3;
    }
}

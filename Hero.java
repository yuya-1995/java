public class Hero {
    String name;
    int HP;
    //戦う(オーバーライドの禁止)
    public void attack(Matango m){
        m.HP -= 10;
        System.out.println("10のダメージを与える");
    }
    //逃げる
    public void run(){
        System.out.println(this.name + "は逃げ出した");
    }
}

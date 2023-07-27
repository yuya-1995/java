//extendsにてHeroとの差分の処理を記述
public class SuperHero extends Hero{
    boolean flying;
    public void fly(){
        this.flying = true;
        System.out.println("飛び上がった");
    }

    public void land(){
        this.flying = false;
        System.out.println("着陸した");
    }


    public void attack(Matango m){
        m.HP -= 20;
        System.out.println("20のダメージを与える");
        if (this.flying) {
            //親クラス（Hero）のメソッド呼び出し super
            super.attack(m);
        }
    }

    //オーバーライド
    public void run(){
        System.out.println("撤退した");
    }
}

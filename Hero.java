import java.util.*;

public class Hero {
    String name;
    int HP;
    static int money; //静的フィールド Hero.money~

    public static void setRandomMoney(){ //静的メソッド　インスタンスしなくても使える
        Random r = new Random();
        int money = (r.nextInt(10)+1) * 1000;
        Hero.money = money; //this.money = moneyは非推奨
    }

    //元祖ObjectクラスのtoStringメソッドをオーバーライドしている
    public String toString(){
        return "名前:" + this.name + "HP:" + this.HP;
    }

    //元祖Objectクラスのequalsメソッドをオーバーライドしている
    public boolean equals(Object o){
        if(this == o){return true;}

        //何を持って同じ内容なのかを記述
        if (o instanceof Hero) {
            Hero h = (Hero)o;
            if (this.name.equals(h.name)) {
                return true;
            }
        }
        
        return false;
    }
    
}

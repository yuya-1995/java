public class Hero {
    private int HP;
    private String name;
    Sword sword;

    public void bye(){
        System.out.println("勇者は別れを告げた");
    }

    private void die(){
        System.out.println(this.name + "は死んだ");
        System.out.println("Gane Over");
    }

    public void sleep(){
        this.HP += 100;
        System.out.println(this.name + "は眠って回復した");
    }

    //setterメソッド（バリデーションみたいなやつ書ける）
    public void setName(String name){
        if (name == null) {
            throw new IllegalArgumentException("名前がnullやでー");
        }
        if (name.length() <= 1) {
            throw new IllegalArgumentException("名前が短すぎやでー");
        }

        this.name = name;
    }

    //getterメソッド
    public String getName(){
        return this.name;
    }

    public void setHP(int HP){
        this.HP = HP;
    }

    public int getHP(){
        return this.HP;
    }
    


}

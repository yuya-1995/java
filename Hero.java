public class Hero {
        //属性の定義
        String name; //名前の宣言
        int HP; //HPの宣言
        Sword Sword;

        //操作の定義
        // public void attack(){};
        public void sleep(){
            this.HP = 100;
            System.out.println(this.name + "は、眠って回復した");
        };
        public void sit(int sec){
            this.HP += sec;
            System.out.println(this.name + "は" + sec + "秒座った");
            System.out.println(this.name + "は" + sec + "ポイント回復した");
        };
        public void slip(){
            this.HP -= 5;
            System.out.println(this.name + "は転んだ");
            System.out.println("5ダメージ");
        };
        public void run(){
            System.out.println(this.name + "は逃げ出した");
            System.out.println("GAME OVER");
        };
}

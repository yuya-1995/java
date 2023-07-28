public abstract class Character {
    String name;
    int HP;

    public Character(String name,int HP){
        this.name = name;
        this.HP = HP;
    }

    public void run(){
        System.out.println("逃げ出しやがった");
    }
    public abstract void attack(Matango m);
    //抽象メソッドは{}がいらない
}

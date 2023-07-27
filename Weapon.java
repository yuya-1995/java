public class Weapon extends Item {
    //親インスタンスでコンストラクタされている場合は子インスタンスにて最低限のコンストラクタを設定してあげる（super）を用いて
    public Weapon(){
        super("ななしの剣");
    }
}

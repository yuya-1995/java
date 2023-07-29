public class King {
    public void talk(Hero h){
        //getterメソッドで名前を取得する。
        System.out.println(h.getName() + "さん、ご苦労様");
        h.bye();
    }
}

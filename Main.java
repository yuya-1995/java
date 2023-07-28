public class Main {
    public static void main(String[] args) {
        // Wizard c = new Wizard("ささき",100,50);
        Character c = new Wizard("ささき",100,50);
        Matango m = new Matango("マジックマッシュルーム",30);

        //ダウンキャストして大丈夫か確認　instanceof
        if(c instanceof Wizard){
            //ダウンキャスト
            Wizard w = (Wizard)c;
            w.fiireball(m);

        }

        //多様性配列
        Character[] party = new Character[5];
        party[0] = new Hero("たなか", 100);
        party[1] = new Hero("さとう", 100);
        party[2] = new Thief("かとう", 100);
        party[3] = new Wizard("かとう", 100, 10);
        party[4] = new Wizard("まみや", 100, 10);

        for(Character player : party){
            player.HP += 100;
        }

        System.out.println(party[3].HP);

    }
}

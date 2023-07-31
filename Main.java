import java.util.*;

public class Main {
    public static void main(String[] args) {
        //【List】ArrayList（取得は早い）
        ArrayList<Integer> points = new ArrayList<Integer>();
        //随時、追加可能
        points.add(30);
        points.add(20);
        points.add(45);
        int a = points.get(1);//取得
        System.out.println(a);
        // for(int point : points){
        //     System.out.println(point);
        // }
        for(int i = 0; i < points.size(); i++){
            System.out.println(points.get(i));
        }

        //Iterator
        ArrayList<String> names = new ArrayList<String>();
        names.add("ささき");
        names.add("たなか");
        names.add("さとう");
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String e = it.next();
            System.out.println(e);
        }
        printList(names);

        //【List】LinkedList（追加・削除は早い）
        List<String> goods = new LinkedList<String>();
        goods.add("Item 1");
        goods.add("Item 2");
        goods.add("Item 3");

        printList(goods);

        //【Set】HashSet
        // Set<String> colors = new HashSet<String>();
        // Set<String> colors = new LinkedHashSet<String>(); //追加順
        Set<String> colors = new TreeSet<String>(); //自然順序
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");//これは無視される（HashListの場合は重複は許されない）
        printList(colors);
        System.out.println(colors.size());

        //Map(keyとvalueをペアで格納)
        Map<String , Integer> prefs = new HashMap<String , Integer>();
        prefs.put("京都府", 255);
        prefs.put("東京都", 1261);
        prefs.put("熊本県", 181);
        int tokyo = prefs.get("東京都");//キーを指定して値を取得
        System.out.println(tokyo);
        prefs.remove("京都府");//キーを指定して削除
        System.out.println(prefs.size());
        prefs.put("熊本県", 2000);//putで上書きも可能

        for(String key : prefs.keySet()){
            int value = prefs.get(key);
            System.out.println(key + "の人口は" + value);
        }

    }

    public static void printList(List<String> goods) { //引数をList<String>にすることでArrayList・LinkedListでもOKになる
        for (String value : goods) {
            System.out.println(value);
        }
    }

    public static void printList(Set<String> goods) { //引数をList<String>にすることでArrayList・LinkedListでもOKになる
        for (String value : goods) {
            System.out.println(value);
        }
    }
}

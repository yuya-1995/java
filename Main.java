import java.util.*;

class Hero {
    String name;
}

public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "ささき";
        List<Hero> list = new ArrayList<Hero>();
        list.add(h);
        System.out.println(h.name);
        h.name = "たなか";
        System.out.println(list.get(0).name);

    }
}
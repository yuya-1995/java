public class KyotoCleaningShop implements CleaningService {
    // インターフェースを実装する場合はimplementsを使う
    String ownerName;
    String address;
    String phone;

    // Shirt
    public Shirt washShirt(Shirt s) {
        // ここでシャツの洗濯処理を行う
        return s;
    }

    // Towl
    public Towl washTowl(Towl t) {
        // ここでタオルの洗濯処理を行う
        return t;
    }

    // Coat
    public Coat washCoat(Coat c) {
        // ここでコートの洗濯処理を行う
        return c;
    }
}
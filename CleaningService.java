public interface CleaningService {
    // インターフェースの条件
    // ① 全て抽象メソッド
    // ② フィールドがない
    Shirt washShirt(Shirt s);
    Towl washTowl(Towl t);
    Coat washCoat(Coat c);
}
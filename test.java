public class test {
  public static void main(String[] args) {
      // Functionインターフェースの実装を作成
      Function f = (name) -> {
          return "hello, " + name;
      };

      System.out.println(f.apply("sasa"));
  }

  // 独自に定義したFunctionインターフェース
  private static interface Function {
      String apply(String name);
  }
}

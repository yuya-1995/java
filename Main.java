public class Main {
    public static void main(String[] args) {
        //文字列操作
        String s1 = "スッキリJava";
        String s2 = "Java";
        String s3 = "java";

        if (s2.equals(s3)) { //内容が等しいか(全て一致)
            System.out.println("等しい");
        }else{
            System.out.println("異なる");
        }

        if (s2.equalsIgnoreCase(s3)) { //大文字、小文字の区別をつけないで等しいか
            System.out.println("等しい");
        } else {
            System.out.println("異なる");
        }

        if (s1.contains(s2)) {
            System.out.println("Javaを含む");
        }

        StringBuilder sb = new StringBuilder();//文字列の結合
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        String s = sb.toString();
        System.out.println(s);

        boolean check = isValidplayerName("A1231133");
        System.out.println(check);
    }

    public static boolean isValidplayerName(String name){
        return name.matches("[A-Z][A-Z0-9]{7}");
    }
}

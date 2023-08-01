import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // FileWriter fw = new FileWriter("data.txt"); //try.catchがないと使えない

        String fileName = "data.txt";
        Scanner input = new Scanner(System.in);
         // ファイルオブジェクトを作成
        File file = new File(fileName);

        try {
            // try-with-resourcesを使用してファイルを作成(自動的にcloseしてくれる)
            try (FileWriter writer = new FileWriter(file)) {
                System.out.print("書き込む内容を入力してください: ");
                String user = input.nextLine();
                writer.write(user);
            } catch (IOException e) {
                System.out.println("ファイルの作成中にエラーが発生しました。");
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        input.close();

        System.out.println("1" + 3 + 4);
    }

    }
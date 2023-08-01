import java.io.*;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        URL u = new URL("https://www.digital.go.jp/"); //リンク記述
        InputStream is = u.openStream(); // インターネットへ接続する

        // 保存するファイル名とパス
        String fileName = "output.html";
        String filePath = "./" + fileName;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            int i = is.read();
            while (i != -1) {
                char c = (char) i;
                writer.write(c); // ファイルに書き込む
                i = is.read();
            }
        }

        System.out.println("HTMLファイルの保存が完了しました。");
    }
}

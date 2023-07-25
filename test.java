import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Random ans = new Random(10);
        Scanner num = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("0から9の数字を入力してください");
            int userInput = num.nextInt();
            int randomNumber = ans.nextInt(10);

            if (userInput == randomNumber) {
                System.out.println("あたり！");
                break; // 当たった場合にループを抜ける
            } else {
                System.out.println("はずれ！");
            }
        }

        num.close(); // Scannerをクローズ
        System.out.println("game over");
    }
}

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 9};
        Scanner user = new Scanner(System.in);
        boolean found = false;

        while (!found) {
            System.out.println("数字を入力してください");
            int input = user.nextInt();

            for (int value : numbers) {
                if (value == input) {
                    System.out.println("あたり");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("はずれ");
            }
        }

        user.close();
    }
}

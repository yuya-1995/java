import java.util.*;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();// 処理時間を計測（開始）
        // ここで何らかの時間のかかる処理を記述

        Scanner scanner = new Scanner(System.in);
        System.out.print("単語を入力してください: ");
        String word = scanner.nextLine();
        
        if (isPalindrome(word)) {
            System.out.println(word + " は逆から読んでも同じです！");
        } else {
            System.out.println(word + " は逆から読むと違います！");
        }
        
        scanner.close();

        long end = System.currentTimeMillis();// 処理時間を計測（終了）
        long elapsedTime = end - start;
        System.out.println("処理時間（ミリ秒）: " + elapsedTime);
        System.out.println("処理時間（秒）: " + (elapsedTime / 1000.0));

    }
    
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }


        
    
}

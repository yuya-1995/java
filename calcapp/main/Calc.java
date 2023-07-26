package calcapp.main;
import calcapp.logics.CalcLogics; 

//上記はディレクトリ構造に依存する
// javac calcapp/main/Calc.java
// javac calcapp/logics/CalcLogics.java
// java calcapp.main.Calc


public class Calc {
    public static void main(String[] args) {
        int a = 10; int b = 5;
        int sum = calcapp.logics.CalcLogics.tasu(a,b);
        int del = CalcLogics.hiku(a,b);
        System.out.println(sum);
        System.out.println(del);
    }
}

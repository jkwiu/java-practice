package app.examples;

import java.util.Scanner;

public class exchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money;
        double dollor;

        money = sc.nextInt();

        dollor = (double)money/1100;

        sc.close();
        System.out.println(dollor);
    }
}
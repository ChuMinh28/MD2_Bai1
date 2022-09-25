package rikkei.academy;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vnd, usd;
        System.out.println("Enter your USD: ");
        usd = scanner.nextInt();
        vnd = usd*23000;
        System.out.println("Your money is: "+vnd+"VND");
    }
}

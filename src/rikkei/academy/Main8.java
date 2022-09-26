package rikkei.academy;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 so co 3 so: ");
        int a,b,c;
        int num = scanner.nextInt();
        a = num/100;
        b = (num%100)/10;
        c = (num%100)%10;
        switch (a){
            case 0:
                System.out.println("Khong ");
                break;
            case 1:
                System.out.print("Mot ");
                break;
            case 2:
                System.out.print("Hai ");
                break;
            case 3:
                System.out.print("Ba ");
                break;
            case 4:
                System.out.print("Bon ");
                break;
            case 5:
                System.out.print("Nam ");
                break;
            case 6:
                System.out.print("Sau ");
                break;
            case 7:
                System.out.print("Bay");
                break;
            case 8:
                System.out.print("Tam ");
                break;
            case 9:
                System.out.print("Chin ");
                break;
            default:
                System.out.print("Please try again");
        }
        switch (b){
            case 0:
                System.out.println("Khong ");
                break;
            case 1:
                System.out.print("Mot ");
                break;
            case 2:
                System.out.print("Hai ");
                break;
            case 3:
                System.out.print("Ba ");
                break;
            case 4:
                System.out.print("Bon ");
                break;
            case 5:
                System.out.print("Nam ");
                break;
            case 6:
                System.out.print("Sau ");
                break;
            case 7:
                System.out.print("Bay ");
                break;
            case 8:
                System.out.print("Tam ");
                break;
            case 9:
                System.out.print("Chin ");
                break;
            default:
                System.out.print("Please try again");
        }
        switch (c){
            case 0:
                System.out.println("Khong ");
                break;
            case 1:
                System.out.print("Mot ");
                break;
            case 2:
                System.out.print("Hai ");
                break;
            case 3:
                System.out.print("Ba ");
                break;
            case 4:
                System.out.print("Bon ");
                break;
            case 5:
                System.out.print("Nam ");
                break;
            case 6:
                System.out.print("Sau ");
                break;
            case 7:
                System.out.print("Bay ");
                break;
            case 8:
                System.out.print("Tam ");
                break;
            case 9:
                System.out.print("Chin ");
                break;
            default:
                System.out.print("Please try again");
        }
    }
}

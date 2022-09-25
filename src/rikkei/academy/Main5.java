package rikkei.academy;

import java.util.Scanner;

public class Main5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Your weight: ");
        weight = scanner.nextDouble();
        System.out.print("Your height: ");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height,2);
        System.out.printf("%-20s%s","bmi","Interpretation\n");
        if (bmi<18)
            System.out.printf("%-20s%s",bmi,"UnderWeight");
        else if (bmi < 25)
            System.out.printf("%-20s%s",bmi,"Normal");
        else if (bmi < 30)
            System.out.printf("%-20s%s",bmi,"OverWeight");
        else
            System.out.printf("%-20s%s",bmi,"Obese");
        }
    }


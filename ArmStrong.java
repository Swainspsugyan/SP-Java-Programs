//package com.sp;
import java.util.Scanner;

class ArmNum {
    void show(int n) {
        int num = n; // Store the original value of n in num
        int sum = 0;
        int temp;
        
        while (n != 0) {
            temp = n % 10;
            sum += (temp * temp * temp);
            n = n / 10;
        }
        
        if (sum == num) {
            System.out.println("The number is an Armstrong Number");
        } else {
            System.out.println("The entered number is not an Armstrong Number");
        }
    }
}

public class ArmStrong {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to check whether it is Armstrong or not ");
        
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        
        ArmNum an = new ArmNum();
        an.show(a);
    }
}

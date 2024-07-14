package vn.edu.cybersoft.buoi4_2;

import vn.edu.cybersoft.pkg.utils;

import java.util.Scanner;

public class ex {
    final static int MAX_NUMBER_NO_DISCOUNT = 49;
    final static int MAX_NUMBER_DISCOUNT_LV1 = 100;
    public static void main(String[] args) {
        // nhap thong tin 1 mat hang
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham");
        String productName = sc.nextLine();
//        sc = new Scanner(System.in);
        System.out.println("Nhap so luong san pham");
        int number = sc.nextInt();
        if (number <= 0){
            System.out.println("Number of a product should be positive");
            return;
        }
        System.out.println("Nhap gia san pham");
        int amount = sc.nextInt();
        if (amount < 0){
            System.out.println("Amount of a product should be greater or equal zero");
            return;
        }

        double totalAmount = 0;
        // neu so luong >= 50 && so luong <= 100 thi giam 8%
        if (number > MAX_NUMBER_DISCOUNT_LV1){
            totalAmount = discount12percent(amount, number);
        }
        // neu so luong > 100 thi so luong tu 100 tro di giam 12%
        if (number > MAX_NUMBER_NO_DISCOUNT){
            totalAmount += discount8percent(amount, number);
        }

        System.out.printf("So tien phai tra: %2f VND\n", totalAmount);
    }

    private static double discount12percent(double amount, int number){
        return (number-MAX_NUMBER_DISCOUNT_LV1)*amount*12/100;
    }

    private static double discount8percent(double amount, int number){
        if (number > MAX_NUMBER_DISCOUNT_LV1)
            return MAX_NUMBER_DISCOUNT_LV1*amount*8/100;
        return number*amount*8/100;
    }
}

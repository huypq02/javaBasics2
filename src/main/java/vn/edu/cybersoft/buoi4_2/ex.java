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

        if (number <= MAX_NUMBER_NO_DISCOUNT){
            totalAmount = noDiscount(amount, number);
        }

        System.out.printf("So tien phai tra: %2f VND\n", totalAmount);
    }

    private static double discount12percent(double amount, int number){
        // so luong tren 100 thi so luong tu 100 tro di se giam 12%
        // nghia la neu so luong san pham la 101 thi co 2 san pham thu 100 va thu 101 se duoc giam 12%
        return (number-MAX_NUMBER_DISCOUNT_LV1+1)*amount*12/100;
    }

    private static double discount8percent(double amount, int number){
        // neu so luong tren 100 thi chi giam gia 8% cho 99 san pham, san pham con lai giam 12%
        if (number > MAX_NUMBER_DISCOUNT_LV1)
            return (MAX_NUMBER_DISCOUNT_LV1-1)*amount*8/100;
        // so luong tu 50 den 100 se duoc giam 8%
        // nghia la neu so luong san pham la 100 thi 100 san pham do duoc giam 8%
        return number*amount*8/100;
    }

    private static double noDiscount(double amount, int number){
        // so luong duoi 50 tuc so luong tu 0 den 49 se khong co giam gia
        return number*amount;
    }
}

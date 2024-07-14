package vn.edu.cybersoft.buoi4;

import java.util.Scanner;
import vn.edu.cybersoft.pkg.utils;

public class bai2 {
    final static int MAXNUM = 3;
    public static void main(String[] args) {
        System.out.println("Nhap 3 so nguyen");
        Scanner sc = new Scanner(System.in);
        int num;
        int countEven = 0;
        int countOdd = 0;
        for(int i = 0; i < MAXNUM; i++){
            System.out.printf("Nhap so nguyen lan %d\n", i+1);
            num = sc.nextInt();
            if (utils.isEven(num)){
                countEven++;
                continue;
            }
            countOdd++;
        }

        System.out.printf("Tong so chan la %d\n", countEven);
        System.out.printf("Tong so le la %d\n", countOdd);
    }
}

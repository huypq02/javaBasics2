package vn.edu.cybersoft.buoi4;

import vn.edu.cybersoft.pkg.utils;

import java.util.Scanner;

public class bai3 {
    final static int MAX_PERSON = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String[] nameList = new String[MAX_PERSON];
        int[] bodList = new int[MAX_PERSON];
        byte[] sexList = new byte[MAX_PERSON];
        for (int i = 0; i < MAX_PERSON; i++){
            System.out.printf("Nhap thong tin can bo thu %d:\n", i+1);
            System.out.printf("Nhap ten can bo %d ", i+1);
            String name = sc.nextLine();
            nameList[i] = name;
            System.out.printf("Nhap nam sinh cb %d ", i+1);
            int bod = sc1.nextInt();
            bodList[i] = bod;
            System.out.printf("Nhap gioi tinh cb %d (Nu: 0; Nam: 1): ", i+1);
            byte sex = sc2.nextByte();
            sexList[i] = sex;
        }

        int maxYear = utils.smallest(bodList);
        byte male = 1;
        System.out.println("Sinh nam tre nhat " + maxYear);

        System.out.println("Danh sach can bo nam tre nhat la");
        for(int i = 0; i < nameList.length; i++){
            if (bodList[i] == maxYear && utils.duplicated(sexList[i], male)){
                System.out.println("Can bo " + nameList[i]+ " sinh nam " + bodList[i]);
            }
        }
    }
}

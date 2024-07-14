package vn.edu.cybersoft.buoi4;

import java.util.Scanner;
import vn.edu.cybersoft.pkg.utils;

public class bai1 {
    final static int MAX_PERSON = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        String[] nameList = new String[MAX_PERSON];
        int[] bodList = new int[MAX_PERSON];;
        for (int i = 0; i < MAX_PERSON; i++){
            System.out.printf("Nhap thong tin hoc sinh thu %d:\n", i+1);
            System.out.printf("Nhap ten hs %d ", i+1);
            String name = sc.nextLine();
            nameList[i] = name;
            System.out.printf("Nhap nam sinh hs %d ", i+1);
            int bod = sc1.nextInt();
            if (utils.isGreaterThanCurrentDate(bod)) {
                System.out.printf("Nam sinh hs %d khong duoc lon hon hien tai\n", i+1);
                return;
            }
            bodList[i] = bod;
        }

        int maxYear = utils.smallest(bodList);
        System.out.println("Nam sinh tre nhat " + maxYear);

        System.out.println("Danh sach sinh vien tre nhat la");
        for(int i = 0; i < nameList.length; i++){
            if (bodList[i] == maxYear){
                System.out.println("Sinh vien " + nameList[i]+ " sinh nam " + bodList[i]);
            }
        }
    }
}

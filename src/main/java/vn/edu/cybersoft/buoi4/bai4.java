package vn.edu.cybersoft.buoi4;

import vn.edu.cybersoft.pkg.utils;

import java.util.Scanner;

public class bai4 {
    final static int MAX_PERSON = 3;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        String[] nameList = new String[MAX_PERSON];
        String[] studentCoordinateList = new String[MAX_PERSON];
        double[] distanceFromSchoolList = new double[MAX_PERSON];

        for (int i = 0; i < MAX_PERSON; i++){
            System.out.printf("Nhap ten hs %d ", i+1);
            String name = sc.nextLine();
            nameList[i] = name;
            System.out.printf("Nhap hoanh do (Ox) toa do hs %d\n", i+1);
            double x = sc1.nextDouble();
            System.out.printf("Nhap tung do (Oy) toa do hs %d\n", i+1);
            double y = sc1.nextDouble();
            studentCoordinateList[i] = Double.toString(x)+';'+ y;
            System.out.printf("=> Toa do nha cua hs %d la: (%s)\n", i+1, studentCoordinateList[i]);
        }

        System.out.println("Nhap toa do nha truong, cu the:");
        System.out.println("+ Nhap tung do (Ox) toa do nha truong");
        double x0 = sc1.nextDouble();
        System.out.println("+ Nhap tung do (Oy) toa do nha truong");
        double y0 = sc1.nextDouble();
        for (int i = 0; i < MAX_PERSON; i++) {
            String[] arrOfStr = studentCoordinateList[i].split(";", 2);
            double x = Double.parseDouble(arrOfStr[0]);
            double y = Double.parseDouble(arrOfStr[1]);
            distanceFromSchoolList[i] = calculateDistance(x, y, x0, y0);
        }

        double maxDistance = utils.furthest(distanceFromSchoolList);
        System.out.println("Khoang cach xa truong DH nhat " + maxDistance);

        System.out.println("Danh sach sinh vien xa truong DH nhat gom: ");
        for(int i = 0; i < nameList.length; i++){
            if (distanceFromSchoolList[i] == maxDistance){
                System.out.println(nameList[i]);
            }
        }

    }

    private static double calculateDistance(double x1, double y1, double x2, double y2){
        // This case related to Cartesian coordinate system 2D
        return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
    }
}

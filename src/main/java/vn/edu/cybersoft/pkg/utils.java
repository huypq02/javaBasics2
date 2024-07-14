package vn.edu.cybersoft.pkg;

public class utils {
    public static boolean isEven(int num){
        return (num%2) == 0;
    }

    public static int smallest(int[] list){
        int temp = 0;
        for(int i = 0; i < list.length; i++){
            if (temp < list[i]){
                temp =  list[i];
            }
        }
        return temp;
    }

    public static double furthest(double[] list){
        double temp = 0;
        for(int i = 0; i < list.length; i++){
            if (temp < list[i]){
                temp =  list[i];
            }
        }
        return temp;
    }

    public static boolean duplicated(int value, int expectedValue){
        return value == expectedValue;
    }
}

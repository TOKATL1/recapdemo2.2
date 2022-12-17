package org.example;

public class Main {
    public static void main(String[] args) {
        double[] mylist = {1.2, 1.3, 4.5, 5.5};
        double total = 0;
        double max = mylist[0];

        for (double number : mylist) {
            total = total + number;
            if (max < number) {

                max = number;


            }
            System.out.println(number);
            System.out.println("Toplam=" + total);
System.out.println("Enbüyük="+max);
        }


    }
}
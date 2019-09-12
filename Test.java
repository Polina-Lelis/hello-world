package com.company;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Row my_row = new Row();

        System.out.print("Input your X: ");
        my_row.x = in.nextDouble();
       // System.out.printf("Your X: %f \n", my_row.x);

        System.out.print("Input your K: ");
        double k = in.nextDouble();
       // System.out.printf("Your number: %f \n", k);

        my_row.eps=Math.pow(10,k);
        System.out.println(my_row.eps);
        my_row.sum();
        System.out.printf("sqrt(%.3f) = %.3f%n", 1+my_row.x, Math.sqrt(1+my_row.x));
        double answer = my_row.sum();
        System.out.printf("%.3f",answer);
        in.close();
    }


}

class Row {
    public double x;
    public double eps;


    public double sum() {
         int i = 2;
         double sum = 1;
         double abs = 1;
       // Row my_sum = new Row();
        while (eps < Math.abs(sum)) {
            sum = -sum * (i - 3) / i * x;
            abs = sum + abs;
            i = i + 2;
        }
        return abs;
    }
}



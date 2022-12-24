package application;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double[] vect = new double[n];
        double soma =0;

        for (int i = 0; i < n; i++){
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }
        double resul = soma/n;

        System.out.println(resul);

        sc.close();
    }

}
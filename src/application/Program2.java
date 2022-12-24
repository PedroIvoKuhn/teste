package application;

import java.util.Scanner;

import entities.Product;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] products = new Product[n];

        double soma = 0;

        for (int i = 0; i < products.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            products[i] = new Product(name, price);
            soma += products[i].getPrice();
        }
        double resul = soma/products.length;

        System.out.println(resul);
        sc.close();
    }
}

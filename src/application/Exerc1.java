package application;

import java.util.Scanner;

import entities.Room;

public class Exerc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Room[] rooms = new Room[10];

        System.out.print("How many rooms will be rented?");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.printf("Rent #%d:\n", i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            rooms[room] = new Room(name, email);
        }

        System.out.println("Busy rooms:");
        for(int i =0; i < rooms.length; i++){
            if(rooms[i] != null){
                System.out.println(i + ": " + rooms[i]);
            }
        }

        sc.close();
    }
}

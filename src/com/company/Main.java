package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    System.out.println("Witaj użytkowniku wybierz jaka czynność chcesz wykonać");
    System.out.println("Dodanie nowego samochodu wybierz 1");
    System.out.println("Wyświetl listę samochodów wybierz 2");
    System.out.println("Usuń samochód z list wybierz 3");
        Scanner input = new
                Scanner(System.in);
        System.out.println("Wpisz polecenie");

        int czynnosc = input.nextInt();
        if (czynnosc > 3 ) {
            System.out.println("Poddałeś nieprawidłowe działanie");
        } else {
            System.out.println("Wybrałeś " + czynnosc);

        }



    }

}

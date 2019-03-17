package com.company;

import com.company.cars.Samochod;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            System.out.println("Witaj użytkowniku wybierz jaka czynność chcesz wykonać");
            System.out.println("Dodanie nowego samochodu wybierz 1");
            System.out.println("Wyświetl listę samochodów wybierz 2");
            System.out.println("Usuń samochód z list wybierz 3");
            Scanner input = new
                    Scanner(System.in);
            System.out.println("Wpisz polecenie");

            int czynnosc = input.nextInt();

            switch (czynnosc) {
                case 1:
                    System.out.println("Wybrałes dodanie nowego samochodu, wpisz cechy");
                    Scanner input2 = new
                            Scanner(System.in);
                            System.out.println("Wpisz kolor");
                            String getKolor = input2.nextLine();
                            System.out.println("Wpisz marke");
                            String getMarka = input2.nextLine();
                            System.out.println("Wpisz cene");
                            long getCena = input2.nextLong();
                            System.out.println("Wpisz przebieg");
                            long getPrzebieg = input2.nextLong();
                            System.out.println("Wpisz rocznik");
                            int getRocznik = input2.nextInt();
                    Samochod car = new Samochod();
                    car.setKolor(getKolor);
                    car.setMarka(getMarka);
                    car.setCena(getCena);
                    car.setPrzebieg(getPrzebieg);
                    car.setRocznik(getRocznik);
                    break;
                case 2:
                    System.out.println("Wybrałeś listę samochodów");
                    break;
                case 3:
                    System.out.println("Wybrałeś usunięcie samochodu");
                    break;
                    default:
                        System.out.println("Wybrałeś złe polecenie");
                        break;
            }
        }

    }
}











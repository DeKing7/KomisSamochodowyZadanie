package com.company;

import com.company.cars.Samochod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        List cars = new ArrayList();

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
                    Samochod car = new Samochod(getKolor, getMarka, getCena, getPrzebieg, getRocznik);
                    car.setKolor(getKolor);
                    car.setMarka(getMarka);
                    car.setCena(getCena);
                    car.setPrzebieg(getPrzebieg);
                    car.setRocznik(getRocznik);
                    cars.add(getKolor);
                    cars.add(getMarka);
                    cars.add(getCena);
                    cars.add(getPrzebieg);
                    cars.add(getRocznik);
                    break;
                case 2:
                    System.out.println("Wybrałeś listę samochodów");
                    System.out.println("Wyświetl listę wybierz 1");
                    System.out.println("Sortować samochod wybierz 2");
                    System.out.println("Filtrować samochody wybierz 3");
                    Scanner input3 = new
                            Scanner(System.in);
                    Integer getdata = input3.nextInt();

                    switch (getdata){
                        case 1:
                            System.out.println("Lista samochodów" + cars);
                            break;
                        case 2:
                            System.out.println("Aby sortować wybierz:");
                            System.out.println("1: Kolor");
                            System.out.println("2: Marka");
                            System.out.println("3: Cena");
                            System.out.println("4: Przebieg");
                            System.out.println("5: Rocznik");
                            Scanner input4 = new
                                    Scanner(System.in);
                            Integer getinfo = input4.nextInt();

                            switch (getinfo){
                                case 1:

                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                    break;
                            }
                        case 3:
                            default:
                                System.out.println("Wybierz poprawne polecenie");
                    }
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











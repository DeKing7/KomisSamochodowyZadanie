package com.company.cars;

import java.util.List;
import java.util.function.Function;

public class SamochodSort {

    private SamochodSort() {
    }

    public static void bubbleSort(int[] numbers){
        for(int j=numbers.length; j > 0; j--){
            for(int i=0; i < j - 1; i++){
                if(numbers[i] > numbers[i+1]){
                    swap(numbers, i, i+1);
                }
            }
        }
    }

    private static void swap(int[] numbers, int i, int j) {
        int tmp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = tmp;
    }

    public static void bubbleSortBySamochodSize(List<Samochod> samochody) {
        for(int j=samochody.size(); j> 0; j--){
            for(int i=0; i < j - 1; i++){
                Samochod samochod1 = samochody.get(i);
                int size1 = samochod1.getSize();

                Samochod samochod2 = samochody.get(i+1);
                int size2 = samochod2.getSize();
                if(size1 > size2){
                    swapOnList(samochody, i, i+1);
                }
            }
        }
    }


    public static <T> void swapOnList(List<T> objects, int i, int j) {
        T tmp = objects.get(i);
        objects.set(i, objects.get(j));
        objects.set(j, tmp);
    }


    public static void bubbleSort(List<Samochod> samochody, Function<Samochod, Integer> function) {
        for(int j=samochody.size(); j> 0; j--){
            for(int i=0; i < j - 1; i++){
                if(function.apply(samochody.get(i)) > function.apply(samochody.get(i+1))){
                    swapOnList(samochody, i, i+1);
                }
            }
        }

    }
}
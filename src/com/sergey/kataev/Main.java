package com.sergey.kataev;

public class Main {

    public static void main(String[] args) {
        StringSorter bubbleSorter = new BubbleStringSorter();
        String[] arr = {"ab","aa","ds","a"};
        String[] sortedArr = bubbleSorter.sort(arr);
        for (String i :
                sortedArr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

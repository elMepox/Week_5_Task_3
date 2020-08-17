package com.sergey.kataev;

public class BubbleStringSorter implements StringSorter {
    @Override
    public String[] sort(String[] arr) {
        TimeMeasureAssistTool timeMeasureAssistTool = new TimeMeasureAssistTool();
        String[] tempArr = arr.clone();
        int permutations = 0;
        int comparision = 0;
        System.out.println("Сортировка пузырьком:");
        timeMeasureAssistTool.beginMeasure();
        for (int end = tempArr.length - 1; end > 1; end--) {
            for (int begin = 0; begin < end; begin++) {
                comparision++;
                if (tempArr[begin].compareTo(tempArr[begin + 1]) > 0) {
                    permutations++;
                    String temp = tempArr[begin];
                    tempArr[begin] = tempArr[begin + 1];
                    tempArr[begin + 1] = temp;
                }
            }
        }
        timeMeasureAssistTool.endMeasure();
        System.out.println("Число перестановок: " + permutations);
        System.out.println("Число сравнений: " + comparision);
        System.out.println("Времени прошло " + timeMeasureAssistTool.result() + " нс");
        return tempArr;
    }
}

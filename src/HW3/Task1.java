package HW3;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        createArray(list);
        System.out.println("Начальный массив :" + list);
        deleteEven(list);
        System.out.println("Без четных значений: " + list);
        System.out.println("Максимальное значение: " + Collections.max(list));
        System.out.println("Минимальное значение: " + Collections.min(list));
        System.out.println("Среднее значение: " + findAvg(list));
        System.out.println(planet(list));
        System.out.println("Меркурий:" + Collections.frequency(planet(list), "Меркурий"));
        System.out.println("Венера:" +Collections.frequency(planet(list), "Венера"));
        System.out.println("Марс:" +Collections.frequency(planet(list), "Марс"));
        System.out.println("Земля:" +Collections.frequency(planet(list), "Земля"));
        System.out.println("Юпитер:" +Collections.frequency(planet(list), "Юпитер"));

    }
    public static int generateRandomInt(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    public static void createArray(List <Integer> list){
        for (int i = 0; i < 25; i++) {
            list.add(generateRandomInt(0,9));
        }

    }
    public static void deleteEven(List <Integer> list){
        for (int i = 0; i < list.size();) {
            if (list.get(i)%2!=0) {
                i++;
            } else {
                list.remove(i);
            }
        }
    }
    public static double findAvg(List<Integer> list){
        double sum=0;
        for (int value : list) {
            sum += value;
        }
        return sum/ list.size();
    }
    public static List<String> planet(List <Integer> list){
        List <String> resList = new ArrayList<>();
        for (int value: list){
            if (value==1){
                resList.add("Меркурий");
            }
            if (value==3){
                resList.add("Венера");
            }
            if (value==5){
                resList.add("Марс");
            }
            if (value==7){
                resList.add("Земля");
            }
            if (value==9){
                resList.add("Юпитер");
            }
        }return resList;
    }
}

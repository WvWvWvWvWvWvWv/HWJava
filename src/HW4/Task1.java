package HW4;

import java.util.Iterator;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Начальный List: " + list);
        list=reVerse(list);
        System.out.println("Обратный List: " + list);
        enqueue(list,5);
        System.out.println(list);
        System.out.println("Возвращаем первый элемент и удаляем его: " + dequeue(list));
        System.out.println(list);
        System.out.println("Достаем первый элемент: " + first(list));
        System.out.println(list);
        System.out.println("Сумма: " + sum(list));
    }
    static LinkedList<Integer> reVerse(LinkedList<Integer> list){
        LinkedList<Integer> list2= new LinkedList<>();
        for(int value:list)
        {
            list2.addFirst(value);
        }
        return list2;
    }
    static void enqueue(LinkedList<Integer> list, int value){
        list.add(value);

    }
    static int dequeue(LinkedList<Integer> list){
        return list.removeFirst();
    }
    static int first(LinkedList<Integer> list){
        return list.getFirst();
    }
    static int sum(LinkedList<Integer> list){
        int sum=0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            sum+= iterator.next();
        }
        return sum;
    }
}

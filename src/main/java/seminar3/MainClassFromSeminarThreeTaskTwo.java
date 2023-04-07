package seminar3;
// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное
// и среднее арифметическое из этого списка.

import java.util.ArrayList;
import java.util.Collections;

public class MainClassFromSeminarThreeTaskTwo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(52);
        list.add(23);
        list.add(3);
        list.add(19);
        list.add(7);
        list.add(20);
        list.add(8);

        System.out.println("Список: " + list);

        int min = Collections.min(list);
        int max = Collections.max(list);
        double average = list.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average);
    }
}


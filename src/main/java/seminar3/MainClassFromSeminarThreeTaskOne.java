package seminar3;

//1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)

import java.util.ArrayList;
public class MainClassFromSeminarThreeTaskOne {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(19);
        numbers.add(49);
        numbers.add(57);
        numbers.add(6);
        numbers.add(4);
        numbers.add(1);
        numbers.add(15);

        System.out.println("Список: " + numbers);

        numbers.removeIf(n -> n % 2 == 0);

        System.out.println("Список без четных чисел: " + numbers);

    }
}

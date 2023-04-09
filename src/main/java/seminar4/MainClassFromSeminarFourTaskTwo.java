package seminar4;
//2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
import java.util.Collections;
import java.util.LinkedList;
public class MainClassFromSeminarFourTaskTwo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("груша");
        list.add("яблоко");
        list.add("вишня");
        LinkedList<String> reversedList = reverseLinkedList(list);
        System.out.println(reversedList);
    }

    public static LinkedList reverseLinkedList(LinkedList list) {
        Collections.reverse(list);
        return list;
    }
}

package seminar3;
//4*. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.
import java.util.ArrayList;
public class MainClassFromSeminarThreeTaskFour {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Monday");
        list.add("Tuesday");
        list.add("Thursday");
        list.add("123");
        list.add("5");
        list.add("23");

        System.out.println("Исходный список: " + list);

        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            try {
                Integer.parseInt(element);
                list.remove(i);
                i--;
            }
            catch (NumberFormatException ignored) {
            }
        }

        System.out.println("Список после удаления целых чисел: " + list);
    }
}

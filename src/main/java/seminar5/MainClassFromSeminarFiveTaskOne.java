package seminar5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MainClassFromSeminarFiveTaskOne {
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Александров");
    }

    public static void addInPhoneBook() {
        phoneBook.put("Александров", List.of("+7(913)732-05-45", "+7(923)455-78-89"));
        phoneBook.put("Шестопалов", List.of("+7(912)345-45-62", "+7(988)353-76-89"));
        phoneBook.put("Беспалова", List.of("+7(923)564-45-67", "+7(923)567-34-56"));
        phoneBook.put("Иванова", List.of("+7(913)456-78-45", "+7(913)787-20-30"));
    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}

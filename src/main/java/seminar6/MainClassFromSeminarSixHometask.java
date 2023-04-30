package seminar6;
import java.util.List;
import java.util.Scanner;
public class MainClassFromSeminarSixHometask {
    public static void main(String[] args) {
        Notebook AcerAspireBJ567 = new Notebook("AcerAspire", "BJ567", "Black", 15.6, "LCD", 8, 256, "SSD");
        Notebook AquariusD304 = new Notebook("Aquarius", "D304", "White", 15.6, "LCD", 8, 512, "SSD");
        Notebook AsusF409 = new Notebook("Asus", "F409", "Blue", 17.0, "TFT", 16, 512, "SSD");
        Notebook DreamMachineFHK321 = new Notebook("DreamMachine", "FHK321", "Blue", 15.6, "OLED", 32, 2048, "HDD 2.0");
        Notebook HaseeTUG234 = new Notebook("Hasee", "TUG234", "Gray", 15.6, "TFT", 16, 1024, "SSD");

        List<Notebook> notebookList = List.of(AcerAspireBJ567, AquariusD304, AsusF409, DreamMachineFHK321, HaseeTUG234);

        Scanner scannerUser = new Scanner(System.in);
        System.out.println("Выберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        int choiceUserSearch = scannerUser.nextInt();
        Scanner scannerRequestUserForSearch = new Scanner(System.in);
        System.out.println("Напишите интересующий цвет или бренд: ");
        String requestUserForSearch = scannerRequestUserForSearch.nextLine();

        if (choiceUserSearch == 1) {
            for (Notebook color : notebookList) {
                if (color.getColor().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(color.printInfo());
                }
            }

        } else if (choiceUserSearch == 2) {
            for (Notebook brand : notebookList) {
                if (brand.getBrand().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(brand.printInfo());
                }
            }
        } else {
            System.out.println("Ошибка.\nВыберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        }

        scannerUser.close();

    }

}

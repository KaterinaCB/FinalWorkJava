import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class InfoBaseNotebooks {

    public static void main(String[] args) {
        Set<NoteBooks> notebooks = new HashSet<>();
        notebooks.add(new NoteBooks("ASUS", 8, 256, "Windows 10", "Black", 15.6));
        notebooks.add(new NoteBooks("Lenovo", 16, 512, "Windows 10", "Silver", 16.6));
        notebooks.add(new NoteBooks("Apple", 8, 512, "MacOS", "Grey", 17.0));
        notebooks.add(new NoteBooks("Huawei", 16, 256, "Linux", "White", 15.6));
        notebooks.add(new NoteBooks("Honor", 8, 512, "Windows 10", "Black", 18.5));

        Map<Integer, String> criteria = new HashMap<>();
        criteria.put(1, "объем оперативной памяти");
        criteria.put(2, "объем накопителя");
        criteria.put(3, "операционная система");
        criteria.put(4, "цвет");
        criteria.put(5, "диагональ экрана");

        Map<String, Integer> filterParams = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        for (Map.Entry<Integer, String> entry : criteria.entrySet()) {
            System.out.println("Укажите " + entry.getValue() + ":");
            int value = sc.nextInt();
            filterParams.put(entry.getValue(), value);
        }

        Set<NoteBooks> filteredNotebooks = new HashSet<>();
        for (NoteBooks notebook : notebooks) {
            if (notebook.getRam() >= filterParams.get("объем оперативной памяти") &&
                    notebook.getStorage() >= filterParams.get("объем накопителя") &&
                    notebook.getOs().equals(filterParams.get("операционная система")) &&
                    notebook.getColor().equals(filterParams.get("цвет")) && notebook.getDiagonal() >= filterParams.get("диагональ экрана")) {
                filteredNotebooks.add(notebook);
            }
        }
        
        System.out.println("\nРезультаты поиска:");
        for (NoteBooks notebook : filteredNotebooks) {
            System.out.println(notebook);
        }
    }
}

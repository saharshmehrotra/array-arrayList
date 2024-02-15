import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class arrayLists {
    public static void main(String[] args) {
        // Example 1: Convert ArrayList to Array
        ArrayList<String> languagesList = new ArrayList<>();
        languagesList.add("Java");
        languagesList.add("Python");
        languagesList.add("JavaScript");
        System.out.println("ArrayList: " + languagesList);

        // Convert ArrayList to String array
        String[] languagesArray = new String[languagesList.size()];
        languagesList.toArray(languagesArray);
        System.out.print("Array (Converted from ArrayList): ");
        for (String item : languagesArray) {
            System.out.print(item + ", ");
        }
        System.out.println(); // Add a line break for better output separation
        // Example 2: Convert Array to ArrayList
        String[] array = {"Java", "Python", "C"};
        System.out.println("Array: " + Arrays.toString(array));
        // Convert array to ArrayList
        List<String> arrayToArrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList (Converted from Array): " + arrayToArrayList);
    }
}

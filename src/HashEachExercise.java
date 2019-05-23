import java.util.HashMap;
import java.util.Scanner;

public class HashEachExercise {
    public static void hashEach() {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> aboutYou = new HashMap<>();
        System.out.println("What is your name? ");
        aboutYou.put("Name" , scanner.nextLine());
        System.out.println("How old are you? ");
        aboutYou.put("Age" , scanner.nextLine());
        System.out.println("What is your hometown? ");
        aboutYou.put("Hometown" , scanner.nextLine());
        System.out.println("What is your favorite food? ");
        aboutYou.put("Favorite Food" , scanner.nextLine());
        System.out.println();
        System.out.println("This is " + aboutYou.get("Name"));
        System.out.println("They are " + aboutYou.get("Age") + "-years-told,");
        System.out.println("from " + aboutYou.get("Hometown") + ",");
        System.out.println("and their favorite food is " + aboutYou.get("Favorite Food"));
    }
}

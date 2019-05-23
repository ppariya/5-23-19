import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ForEachAndMapExercise {
    public static void forEach() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("You will enter 5 random numbers");
        System.out.println("Please enter your 1st number: ");
        list.add(scanner.nextInt());
        System.out.println("Please enter your 2nd number: ");
        list.add(scanner.nextInt());
        System.out.println("Please enter your 3rd number: ");
        list.add(scanner.nextInt());
        System.out.println("Please enter your 4th number: ");
        list.add(scanner.nextInt());
        System.out.println("Please enter your 5th number: ");
        list.add(scanner.nextInt());

        int sum = 0;
        int max = list.get(0);
        int min = list.get(0);
        for(Integer number: list){
            sum += number;
            if(max < number){
                max = number;
            }
            if(min > number){
                min = number;
            }
        }

        System.out.println("Sum of those numbers is " + sum);
        System.out.println("Largest number of those numbers is " + max);
        System.out.println("Smallest number of those number is " + min);
    }

    public static void map() {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> cars = new HashMap<>();
        cars.put("camry" , "Toyota");
        cars.put("civic", "Honda");
        cars.put("corolla", "Toyota");

        System.out.println("What car(model) you are looking for?");
        String model = scanner.nextLine().toLowerCase();

        if(cars.containsKey(model) == true){
            System.out.println( "Oh, you're looking for a " + model +"? Our " + cars.get(model) + " selection is right over here...");
        } else {
            System.out.println("Sorry! We do not have the model you are looking for.");
        }
    }
}

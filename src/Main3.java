import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int age;
            String firstName;
            String favouriteFood;

            System.out.println("Enter your age: ");
            age = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Enter your first name: ");
            firstName = scanner.nextLine();

            System.out.println("Enter your food: ");
            favouriteFood = scanner.nextLine();

            System.out.println("First name: " + firstName + "\n\n" + "Age: " + age + "\n\n" + "Food: " + favouriteFood);
        }

    }

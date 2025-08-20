import java.util.Scanner;

public class Switch__case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fruits = sc.next();

        switch (fruits) {
            case "apple" -> System.out.println("A red fruit");
            case "Orange" -> System.out.println("a round fruit");
            case "grapes" -> System.out.println("A small fruit");
            default -> System.out.println("No fruits found");
        }
    }
}

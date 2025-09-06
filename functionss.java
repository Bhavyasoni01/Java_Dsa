import java.util.Scanner;

public class functionss {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Number one");
        int one = sc.nextInt();
        System.out.println("Enter Number two");
        int two = sc.nextInt();
        swap(one,two);
    }

    static void swap(int a, int b){
        int temp = b;
        b = a;
        a = temp;

        System.out.println("Swapped Numbers are " + a +" "+ b);
    }
}

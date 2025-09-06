import java.util.Scanner;

public class functions_questions {
    public static void main(String[] args) {
//        System.out.println("Enter a number to check wheter its prime or not: ");
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        isPrime(n);

        // Armstrong no
      armstrong(21);
    }


    static boolean armstrong(int a ){
       int org = a;
        int sum = 0;


       while (a>0){
          int rem = a%10;
           a = a/10;
           sum = sum + rem*rem*rem;
       }
    return sum==org;
    }

   /* static void isPrime(int a){
        if(a%2==1){
            System.out.println("The number is prime");
        }else {
            System.out.println("The Number isn't Prime");
        }
    }

    */
}

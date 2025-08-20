import java.util.Scanner;

public class revision1 {
    public static void main(String[] args) {

        //checks the char is lowercase or uppercase
//        Scanner sc = new Scanner(System.in);
//
//        char ch = sc.next().trim().charAt(0);
//
//        if (ch >='a' && ch <= 'z'){
//            System.out.println("LowerCase");
//        }else{
//            System.out.println("Uppercase");
//        }
                // Fabonacci
//        Scanner sc = new Scanner(System.in);
//
//        int a = 0;
//        int b=1;
//        int count =2;
//
//        int n = sc.nextInt();
//
//        while(count <=n){
//            int temp = b;
//            b= b+a;
//            a = temp;
//            System.out.println(b);
//            count++;
//        }


        // reversing a number

//        int n = 12312;
//
//        int ans = 0;
//
//        while(n>0){
//          int rem = n%10;
//
//          n = n/10;
//          ans = ans *10 +rem;
//
//        }
//        System.out.println(ans);

                // Counting Occurences

        int n = 1214312;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in find: ");
        int find = sc.nextInt();
        int count = 0;

        while (n>0){
            int i = n%10;
            if(i==find){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}

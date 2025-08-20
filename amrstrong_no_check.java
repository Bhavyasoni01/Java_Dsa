import java.util.Scanner;

public class amrstrong_no_check {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        System.out.println(isArmstrong(a));

        for (int i = 100; i <1000 ; i++) {
            if(isArmstrong(i)){
                System.out.println(i);
            }

        }
    }
    static Boolean isArmstrong(int n ){
        int org = n;
        int sum = 0;

        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        if(sum==org){
            return true;
        }else {
            return false;
        }
    }
}

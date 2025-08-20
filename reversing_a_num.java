public class reversing_a_num {
    public static void main(String[] args) {

        int num = 1214312;

        int ans = 0;

        while (num>0){
            int rem = num %10;

            num = num/10;

            ans = ans *10+rem;
        }
        System.out.println(ans);

    }
}

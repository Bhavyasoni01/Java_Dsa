public class countting_occurneces {
    public static void main(String[] args) {
        int n =1245322213;

        int count  = 0;
//        int i =0;
        while(n>0){
             int i = n%10;
            if(i==2){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);




    }
}

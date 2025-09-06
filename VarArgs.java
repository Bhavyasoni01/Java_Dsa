import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        nums(1,2,2,33,45,545,46,54,6,54,64,2);
    }
    static void nums (int ...v){
        System.out.println(Arrays.toString(v));
    }
}

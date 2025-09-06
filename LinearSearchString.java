public class LinearSearchString {
    public static void main(String[] args) {
        String name  = "NIgar";


       boolean src = search(name,'n');
        System.out.println(src);

    }
    static boolean search(String name, char target){
        if(name.isEmpty()){
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)==target){
                return true;
            }

        }
        return false;
    }
}

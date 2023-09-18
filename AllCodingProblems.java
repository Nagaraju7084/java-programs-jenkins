import java.util.Date;

public class AllCodingProblems{
    public static void main(String[] args) {
        System.out.println(new Date());
        //finbonacci();
        findFirstNonRepeatedCharacterInAString();

    }

    private static void findFirstNonRepeatedCharacterInAString() {
        String str = "zzzzzbbbccccddehhhhiii";
        for(int i=0; i<str.length()-1; i++){
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                System.out.println("first non repeated character in a String is : "+ch);
            }
        }
    }

    private static void finbonacci() {
        int n = 5;
        for(int i=0; i<=n; i++){
            int fibNumber = findFib(i);
            System.out.println("fibNumber : " + fibNumber);
        }
    }

    private static int findFib(int i) {
        if(i<=1){
            return i;
        }else{
            return findFib(i-1) + findFib(i-2);
        }
    }
}
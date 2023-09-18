import java.util.Date;

public class Main{
    public static void main(String[] args) {
        System.out.println("this is java program");
        System.out.println("output from java program");
        System.out.println(new Date());
        finbonacci();
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
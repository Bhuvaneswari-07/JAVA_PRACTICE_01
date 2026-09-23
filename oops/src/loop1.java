public class loop1 {
    public static void main(String[] args){
        int n=145;
        int o=n;
        int fact=1;
        int sum=0;
        if(n>0) {
            int digit = n % 10;
            fact *= digit;
            sum = sum + fact;
        }
        n=n/10;
        if(sum==o){
            System.out.println("armstrong number");

        }

    }
}

class Calc{
    void square(int n){
        int result=n*n;
        System.out.println("the square is:"+result);

    }
}
public class oop1 {
    public static void main(String[] args){
        Calc c=new Calc();
        c.square(10);
    }
}

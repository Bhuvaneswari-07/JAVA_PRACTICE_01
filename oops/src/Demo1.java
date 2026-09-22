class student{
     public String display(int cost) {
         if (cost > 2) {
             return "ok";
         }
         else{
             return "no";
         }


    }
}
public class Demo1 {
    public static void main(String[] args){
        student o=new student();
         String s=o.display(10);
         System.out.println(s);
    }
}

import java.util.Scanner;
class Student1{
    int marks[]=new int[5];
    int avg;
    Scanner input=new Scanner(System.in);




    void display(){
        for(int i=0;i<5;i++) {
            marks[i] = input.nextInt();
        }
        avg=(marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;

    }


}
public class oops4 {
    public static void main(String[] args){
        Student1 s=new Student1();
        s.display();
        System.out.println("avg is"+s.avg);

    }
}

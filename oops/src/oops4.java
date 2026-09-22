import java.util.Scanner;
class Student1{
    int marks[]=new int[5];
    Scanner input=new Scanner(System.in);




    void display(){
        for(int i=0;i<5;i++)
        marks[i]=input.nextInt();
        for(int i=0;i<5;i++)
        System.out.println(marks[i]);
    }


}
public class oops4 {
    public static void main(String[] args){
        Student1 s=new Student1();
        System.out.println("enter marks");
        s.display();
    }
}

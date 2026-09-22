class a{
    int roll;
    int marks;

}
public class Demo2 {
    public static void main(String[] args){
        a s1=new a();
        s1.roll=1;
        s1.marks=20;
        a s2=new a();
        s2.roll=2;
        s2.marks=30;
        a arr[]=new a[2];
        arr[0]=s1;
        arr[1]=s2;
        for(int i=0;i<2;i++){
            System.out.println(arr[i].roll);
            System.out.println(arr[i].marks);

        }
    }
}

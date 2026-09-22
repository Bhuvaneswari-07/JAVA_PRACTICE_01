class Rect{
    int len;
    int bred;
    int ar;
    Rect(int l,int b){
        len=l;
        bred=b;
    }
    void area(){
         ar=len*bred;

    }

}
public class oop3 {
    public static void main(String[] args){
        Rect r=new Rect(10,20);
        r.area();
        System.out.println("the length is="+r.len);
        System.out.println("the breadth is="+r.bred);

        System.out.println("the area is="+r.ar);
    }
}

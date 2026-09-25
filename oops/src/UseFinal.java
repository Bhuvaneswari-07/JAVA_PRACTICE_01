
    public class UseFinal {


        final int x = 20;

        public static void main(String[] args) {

            UseFinal myObj = new UseFinal();

            // myObj.x = 25;   // Error: cannot change final variable

            System.out.println(myObj.x);
        }
    }


public class A1 {
    public static void main(String[] args) {
        int h = 0;
        int a = 0;

        do {
            do {
                System.out.print("*");
                a++;
            } while (a < 4);

            System.out.println( );
            a=0;
            h++;
        } while (h < 4);
    }
}
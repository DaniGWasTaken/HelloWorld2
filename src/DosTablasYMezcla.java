import java.util.Arrays;
import java.util.Scanner;

public class DosTablasYMezcla {
    public static void main(String[] args) {
        int a[]=new int[5];
        int b[]=new int[5];
        int c[]=new int[10];
        int j=0;
        Scanner sc = new Scanner(System.in);

        for (int i=0;i<a.length;i++){
            System.out.println("Introduce un número para la tabla A");
            int n = sc.nextInt();
            a[i]=n;
        }

        for (int i=0;i<b.length;i++){
            System.out.println("Introduce un número para la tabla B");
            int n = sc.nextInt();
            b[i]=n;
        }

        for (int i=0;i<a.length;i++) {
            System.out.println(a[i] + "," + b[i]);
        }

        for (int i=0;i<c.length;i++){
            if (i>=5){
                c[i]=b[j];
                j++;
            } else c[i]=a[i];
        }
            System.out.println(Arrays.toString(c));
    }
}

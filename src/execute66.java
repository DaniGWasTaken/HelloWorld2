import java.util.Arrays;
import java.util.Scanner;

public class execute66 {
    public static void main(String[] args) {
        int a[] = new int [10];
        int d=0;
        Scanner sc = new Scanner(System.in);

       for (int i=0;i<a.length;i++){
           System.out.println("Introduce un número para la tabla A");
           int n = sc.nextInt();
           a[i]=n;
       }

       for (int i=0;i<a.length;i++){
           if (i == 0){
               for (int c=1;c<a.length;c++){
                   if(a[i]==a[c]){
                       d=d+1;
                   }
               }
           }
           if (i == 1){
               for (int c=2;c<a.length;c++){
                   if(a[i]==a[c]){
                       d=d+1;
                   }
               }
           }
           if (i == 2){
               for (int c=3;c<a.length;c++){
                   if(a[i]==a[c]){
                       d=d+1;
                   }
               }
           }
           if (i == 3){
               for (int c=4;c<a.length;c++){
                   if(a[i]==a[c]){
                       d=d+1;
                   }
               }
           }
           if (i == 4){
               for (int c=5;c<a.length;c++){
                   if(a[i]==a[c]){
                       d=d+1;
                   }
               }
           }
           if (i == 5){
               for (int c=6;c<a.length;c++){
                   if(a[i]==a[c]){
                       d=d+1;
                   }
               }
           }
           if (i == 6){
               for (int c=7;c<a.length;c++){
                   if(a[i]==a[c]){
                       d=d+1;
                   }
               }
           }
           if (i == 7){
               for (int c=8;c<a.length;c++){
                   if(a[i]==a[c]){
                       d=d+1;
                   }
               }
           }
           if (i == 8){
               for (int c=9;c<a.length;c++){
                   if(a[i]==a[c]){
                       d=d+1;
                   }
               }
           }
       }
       System.out.println("hay " + d + " números duplicados");
       System.out.println(Arrays.toString(a));
    }
}


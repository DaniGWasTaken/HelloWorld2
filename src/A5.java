import javax.swing.*;

public class A5 {
    public static void main(String[] args) {
        boolean Flag = false;
        do {

        String filas = JOptionPane.showInputDialog("Número de filas mayor que 0 y menor o igual a 200");
        String columnas = JOptionPane.showInputDialog("Número de columnas mayor que 0 y menor o igual a 200");

        int f=Integer.parseInt(filas);
        int c=Integer.parseInt(columnas);

        if ((f > 0 && f <= 200 )&&(c > 0 && c <= 200)){
        Flag =true;

            int a=0;
            int h=0;
            do {
                do {
                    System.out.print("*");
                    a++;
                } while (a < c);

                System.out.println( );
                a=0;
                h++;
            } while (h < f);

        } else JOptionPane.showMessageDialog(null,"Error");

        } while (!Flag);
    }
}

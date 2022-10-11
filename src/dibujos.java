import javax.swing.*;

public class dibujos {

    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog("Introduce un número");
        int h = Integer.parseInt(texto);

        for (int i=0;i<h;i++) {

            for (int j=0;j<h-i-1;j++) {
                System.out.print(" ");
            }

            for (int j=0;j<i+1;j++) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }

        for (int i=0;i<3;i++){
            for (int j=0;j<=h/2;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=h/4;j++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }

        for (int i=0;i<h;i++) {

            for (int j=0;j<i;j++) {
                System.out.print(" ");
            }
            for (int j=0;j<h-i;j++) {
                System.out.print("* ");
            }


            System.out.println(" ");
        }
    }
}
import javax.swing.*;

public class rombo {
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

        for (int i=0;i<h;i++) {

            for (int j=0;j<i+1;j++) {
                System.out.print(" ");
            }
            for (int j=0;j<h-i-1;j++) {
                System.out.print("* ");
            }


            System.out.println(" ");
        }
    }
}

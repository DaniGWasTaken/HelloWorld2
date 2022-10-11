import javax.swing.*;

public class diagonal {

    public static void main(String[] args) {

        int a = 0;
        String numero = JOptionPane.showInputDialog("Introduce el numero de filas");
        a = Integer.parseInt(numero);

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
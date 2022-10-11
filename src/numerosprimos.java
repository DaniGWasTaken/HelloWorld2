import javax.swing.*;

public class numerosprimos {
    public static void main(String[] args) {

        String numero = JOptionPane.showInputDialog("introduce un número entero mayor o igual a 1");
        int n=Integer.parseInt(numero);
        int c=0;
        int m=1;

        do {
            for (int i = 1; i <= n; i++) {
                if ((n % i) == 0) {
                    c++;
                }
            }
            if (c <= 2){
                m=n*m;
                n++;
                c=0;
            }
        } while (m<=210);
        JOptionPane.showMessageDialog(null,"la multiplicación es " + m);
    }
}

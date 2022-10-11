import javax.swing.*;

public class MatricesOArreglos {
    public static void main(String[] args) {
        int numeros [] = new int[10];
        int s = 0;

        do {
            String valor = JOptionPane.showInputDialog("introduce un número");
            int v = Integer.parseInt(valor);
            numeros [s] = v;
            s++;
        } while (s < numeros.length);

        int c=0;

        for (int i=0;i<numeros.length ; i++){
            c+=numeros[i];
        }

        int media=c/numeros.length;
        JOptionPane.showMessageDialog(null,"la media es " + media);

        int mayor=Integer.MIN_VALUE;
        int pm=0;
        int menor=Integer.MAX_VALUE;
        int pmin=0;

        for (int i=0;i< numeros.length;i++){
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                pm = i;
                }
            }
        for (int i=0;i < numeros.length;i++){
            if (numeros[i] < menor) {
                menor = numeros[i];
                pmin=i;
            }
        }
        JOptionPane.showMessageDialog(null,"el mayor es " + mayor + " y está en " + pm);
        JOptionPane.showMessageDialog(null,"el menor es " + menor + " y está en " + pmin);
    }
}

import javax.swing.JOptionPane;
public class piramide {
    public static void main(String[] args) {
        int filas = 0;
        boolean flag = false;
        do {
            String texto = JOptionPane.showInputDialog("Introduce el numero de filas entre 3 y 21.");
            try {
                filas = Integer.parseInt(texto);
                if (filas < 3 || filas > 21) {
                    JOptionPane.showMessageDialog(null, "El valor indicado no es " +
                            "correcto");
                } else {
                    flag = true;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El valor indicado no es " +
                        "correcto");
            }
        } while (!flag);
        for (int columnas = 0; columnas < filas; columnas++) {
            for (int astr = 0; astr < columnas; astr++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

        for (int columnas = 1; columnas <= filas; columnas++) {
            for (int espacio = filas; espacio > columnas; espacio--) {
                System.out.print(" ");
            }
            for (int astr = 0; astr < ((columnas * 2) - 1); astr++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
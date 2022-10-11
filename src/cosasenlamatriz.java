import javax.swing.*;

public class cosasenlamatriz {
    public static void main(String[] args) {

        String cosas[] = new String[50];
        int s = 0;

        do {

            String valor = JOptionPane.showInputDialog("introduce un algo");
            cosas[s] = valor;
            s++;
        } while (s <= 49);

        for (int i=0;i<=49;i++) {
            System.out.println(cosas[i]);
        }
        }

    }

import javax.swing.*;

public class login {
    public static void main(String[] args) {

        //definimos las variables usuario, contraseña, un boolean en falso y un int que funcionará como contador
        String u = "Dani";
        String c = "pass123";
        int i = 0;
        boolean flag = false;

        //abrimos un do while que nos sirve para que el programa finalice si llegamos a el máximo de intentos o si acertamos
        do {

            //pedimos usuario y contraseña
            String user = JOptionPane.showInputDialog("Usuario");
            String password = JOptionPane.showInputDialog("Contraseña");

            //abrimos un if que comprueba si el usuario o la contraseña son incorrectos
            if ((!user.equals(u)) || (!password.equals(c))) {
                //si alguno es incorrecto salta un mensaje y cuenta un intento
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos, intentos restantes:" + (3 - i));
                i++;
            } else {
                //si ambos son correctos nos da la bienvenida y cambia el boolean para salir del ciclo
                JOptionPane.showMessageDialog(null, "Bienvenido");
                flag = true;
            }
        }while ((i <= 3) && (!flag));

        // con este if, si hemos llegado al máximo de intentos nos salta un mensaje que nos lo indica
        if (i==3){
            JOptionPane.showMessageDialog(null,"Intentos máximos superados");
        }
    }
}
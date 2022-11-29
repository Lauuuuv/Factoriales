import javax.swing.*;
import java.awt.*;
import java.math.BigInteger;

public class Operaciones {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del número"));
        BigInteger factorial = BigInteger.ONE;

        int divisores;
        for(divisores = 1; divisores <= numero; divisores++) {
            factorial = factorial.multiply(BigInteger.valueOf((long)divisores));
        }

        System.out.println( "El factorial de " + numero + " es: \n" + factorial);
        numero = factorial.intValue();
        divisores = 0;

        for(int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                ++divisores;
            }
        }

        System.out.println("El número de divisores de " + factorial + " es: \n" + divisores);
    }

    public int leerDatoEntero(String mensaje) {
        int dato =0;
        boolean condicion = false;
        while(condicion == false) {
            try {
                String aux = JOptionPane.showInputDialog(mensaje);
                dato = Integer.parseInt(aux);
                condicion= true;
            }
            catch (Exception e) {
                condicion = false;
            }
        }
        return dato;
    }

    public String leerDatoString(String mensaje) {
        String respuesta = JOptionPane.showInputDialog(mensaje);
        return respuesta;
    }

    public static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public void mostrarInformacionError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error" , JOptionPane.ERROR_MESSAGE);

    }

    }

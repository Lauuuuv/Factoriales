import javax.swing.*;
import java.math.BigInteger;
import java.util.ArrayList;

public class Factoriales {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número"));
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
        JOptionPane.showMessageDialog(null, "El factorial de " + num + " es: " +
                "\n" + factorial);
        System.out.println("La cantidad es divisores son: "+ findDivisors(factorial));
    }
    private static BigInteger findDivisors(BigInteger a){
        ArrayList<Integer> exponentes = new ArrayList<>();
        int aux;
        for (BigInteger i = BigInteger.TWO;i.compareTo(a)<=0;i=i.add(BigInteger.ONE)){
            aux = 0;
            while (a.mod(i).equals(BigInteger.ZERO)){
                aux++;
                a=a.divide(i);
            }
            if (aux!=0){
                exponentes.add(aux);
            }
        }
        BigInteger divisores = BigInteger.ONE;
        for (int num:exponentes){
            divisores = divisores.multiply(BigInteger.valueOf(num+1));
        }
        return divisores;
    }
}

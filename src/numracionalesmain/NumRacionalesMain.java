
package numracionalesmain;


public class NumRacionalesMain {

    
    public static void main(String[] args) {
        NumRacional num1 = new NumRacional();
        NumRacional num2 = new NumRacional(1,2);
        NumRacional operaciones = new NumRacional();
        
        operaciones.Sumar(num1, num2);
        System.out.println
        ("La suma de: " + num1.getNumerador() + "/" + num1.getDenominador()+ " + " + num2.getNumerador() + "/" + num2.getDenominador() +  " es: " +  operaciones.getNumerador() + "/" + operaciones.getDenominador());

        operaciones.Restar(num1, num2);
        System.out.println
        ("La resta de: " + num1.getNumerador() + "/" + num1.getDenominador()+ " - " + num2.getNumerador() + "/" + num2.getDenominador() +  " es: " +  operaciones.getNumerador() + "/" + operaciones.getDenominador());
    }
    
}/* Last commit: 26/03/21 at the 1:27 p.m. */
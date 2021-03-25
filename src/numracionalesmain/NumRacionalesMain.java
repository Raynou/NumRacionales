
package numracionalesmain;


public class NumRacionalesMain {

    
    public static void main(String[] args) {
        NumRacional num1 = new NumRacional();
        NumRacional num2 = new NumRacional(1,2);
        NumRacional suma = new NumRacional().Sumar(num1, num2);
        //int resultado [] = new int [2]; 

        //resultado =num1.Sumar(num1, num2);

        System.out.println
        ("La suma de: " + num1.getNumerador() + "/" + num1.getDenominador()+ " + " + num2.getNumerador() + "/" + num2.getDenominador() +  " es: " +  suma.getNumerador() + "/" + suma.getDenominador());

        //resultado =num1.Restar(num1, num2);
       /*  System.out.println
        ("La resta de: " + num1.getNumerador() + "/" + num1.getDenominador()+ " + " + num2.getNumerador() + "/" + num2.getDenominador() +  " es: " +  resultado[0] + "/" + resultado[1]); */
    }
    
}
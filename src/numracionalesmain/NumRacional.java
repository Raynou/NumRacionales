
package numracionalesmain;


public class NumRacional {
    public int numerador;   // 1
                            // -
    public int denominador; // 2

    public NumRacional() {
        this.numerador =1;
        this.denominador = 1;
    }
    
    public NumRacional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    /*public NumRacional Sumar(NumRacional num, NumRacional num2){
        int a = num.getNumerador();
        int b = num.getDenominador();
        int c = num2.getNumerador();
        int d = num2.getDenominador();

        this.setNumerador((a*d)+(b*c));
        this.setDenominador(b*d);
        return this;
    }
    public NumRacional Restar(NumRacional num, NumRacional num2){
        int a = num.getNumerador();
        int b = num.getDenominador();
        int c = num2.getNumerador();
        int d = num2.getDenominador();

        this.setNumerador((a*d)-(b*c));
        this.setDenominador(b*d);
        return this;
    }*/

    
    
}

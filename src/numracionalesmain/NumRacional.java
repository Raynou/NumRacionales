
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
    
}

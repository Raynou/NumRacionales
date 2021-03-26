
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
    
    public NumRacional Sumar(NumRacional num, NumRacional num2){
        int primerNumerador = num.getNumerador(); 
        int primerDenominador = num.getDenominador(); 
        int segundoNumerador = num2.getNumerador();
        int segundoDenominador = num2.getDenominador();

        this.setNumerador((primerNumerador*segundoDenominador)+(primerDenominador*segundoNumerador));
        this.setDenominador(primerDenominador*segundoDenominador);
        return this;
    }
    public NumRacional Restar(NumRacional num, NumRacional num2){
        int primerNumerador = num.getNumerador(); 
        int primerDenominador = num.getDenominador(); 
        int segundoNumerador = num2.getNumerador();
        int segundoDenominador = num2.getDenominador();

        this.setNumerador((primerNumerador*segundoDenominador)-(primerDenominador*segundoNumerador));
        this.setDenominador(primerDenominador*segundoDenominador);
        return this;
    }

    
    
}

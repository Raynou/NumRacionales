package numracionalesmain;

public class OperacionesNumRacionales extends NumRacional {
    
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


package numracionalesmain;

public class OperacionesNumRacionales extends NumRacional {
    
    public NumRacional Sumar(NumRacional num, NumRacional num2){
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
    }
}

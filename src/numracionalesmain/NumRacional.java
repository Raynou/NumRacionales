
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
    
    /*public int [] Sumar(int primNum, int primDen, int segNum, int segDen){
        int numRacional [] = new int [2];
                
        int numTotal = (primNum*segDen)+(primDen*segNum);
        int denTotal =  primDen * segDen;
        
        numRacional[0]=numTotal;
        numRacional[1]=denTotal;
        
        return numRacional;
    }
    public int [] Restar(int primNum, int primDen, int segNum, int segDen){
         int numRacional [] = new int [2];
        
        int denTotal =  primDen * segDen;
        int numTotal = (primNum*segDen)-(primDen*segNum);
        
        numTotal = numRacional[0];
        denTotal = numRacional[1];
        
        return numRacional;
        
    }*/
    
    
    
    
    public int [] Sumar(NumRacional num, NumRacional num2){
        int numRacional [] = new int [2];
        int numRacional2 [] = new int [2];
        int resultado [] = new int [2];
        
        numRacional[0] = num.getNumerador();
        numRacional[1] = num.getDenominador();
        
        numRacional2[0] = num2.getNumerador();
        numRacional2[1] = num2.getDenominador();
        
        resultado[0] = (numRacional[0]*numRacional2[1])+(numRacional[1]*numRacional2[0]);
        resultado[1] =  numRacional[1] * numRacional2[1];
             
        return resultado;
    }
    public int [] Restar(NumRacional num, NumRacional num2){
        int numRacional [] = new int [2];
        int numRacional2 [] = new int [2];
        int resultado [] = new int [2];
        
        numRacional[0] = num.getNumerador();
        numRacional[1] = num.getDenominador();
        
        numRacional2[0] = num2.getNumerador();
        numRacional2[1] = num2.getDenominador();
        
        resultado[0] = (numRacional[0]*numRacional2[1])-(numRacional[1]*numRacional2[0]);
        resultado[1] =  numRacional[1] * numRacional2[1];
            
        return resultado;
    }

    
    
}

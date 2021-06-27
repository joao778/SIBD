package tp4;
public class ExcecaoDivisaoResultadoZero extends Exception {
    public ExcecaoDivisaoResultadoZero(String mensagem){
        super(mensagem);
    }
}

package tp4;

public class DivisorArray {

    public DivisorArray(){
        arrayA = new int[10];
        arrayB = new int[10];
    }
    
    private int[] arrayA;
    private int[] arrayB;

    public int[] getArrayA() {
        return arrayA;
    }

    public int[] getArrayB() {
        return arrayB;
    }

    public void setArrayA(int[] arrayA) {
        this.arrayA = arrayA;
    }

    public void setArrayB(int[] arrayB) {
        this.arrayB = arrayB;
    }

    public void setArrayANaPosicao(int valor, int posicaoArray){
        validador(posicaoArray, arrayA);
        arrayA[posicaoArray] = valor;
    }
    
    public void setArrayBNaPosicao(int valor, int posicaoArray){
        validador(posicaoArray, arrayB);
        arrayB[posicaoArray] = valor;
    }

    public int calcula(int a, int b) throws ExcecaoDivisaoResultadoZero{
        int resultado = 0;
        try{
            resultado = a/b;
            if(resultado == 0){
                throw new ExcecaoDivisaoResultadoZero("Resultado da divisão é igual a zero");
            }
        }catch(ArithmeticException e){
            System.out.println("Não se pode dividir um número por 0. Tente novamente.");
        }
        
        return resultado;
    }

    public void calculaDivisaoArrays(){
        
        int [] resultadoDivisoes = new int [10];

        try{
            for(int i = 0; i < arrayA.length; i++){
                resultadoDivisoes[i] = calcula(arrayA[i], arrayB[i]);
            }
        }catch(ExcecaoDivisaoResultadoZero e){
            System.out.println(e.getMessage());

        }finally{
            for(int i = 0; i < arrayA.length; i++){
                System.out.println("Valor "+i+1+" do arrayA, arrayB e Resultado, respectivamente:"
                + arrayA[i]+","+arrayB[i]+","+resultadoDivisoes[i]);
            }
        }
    }

    private void validador(int posicaoValidar, int[] array){
        if(!((posicaoValidar >= 0) && (posicaoValidar <= array.length -1))){
            throw new IllegalArgumentException("Posição não existe no array. Por favor, tente de novo.");
        }
    }
}

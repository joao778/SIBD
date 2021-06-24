public abstract class Quadrilatero implements Forma {

    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;
    
    //Construtor
    public Quadrilatero(double lado1, double lado2, double lado3, double lado4){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    /*Implementação do método abstrato da interface forma..
        (outro método não precisou ser implementado, pois esta é uma 
        classe abstrata)
    */
    public double calcPerimetro(){
        return lado1+lado2+lado3+lado4;
    }

    public double[] getLados(){
        double [] lados = new double[4];
        lados[0] = lado1;
        lados[1] =lado2;
        lados[2] = lado3;
        lados[3] = lado4;
        return lados;
    }

}


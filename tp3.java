public interface Forma {

    double calcPerimetro();
    double calcArea();

}
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
public class Retangulo extends Quadrilatero {

    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        super(base, base, altura, altura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcPerimetro(){
        return super.calcPerimetro();
    }

    @Override
    public double calcArea(){
        double[] ladosRet = super.getLados();
        return ladosRet[0]*ladosRet[2];
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

}
public class Quadrado extends Quadrilatero {
    
    public Quadrado(double lado){
        super(lado, lado, lado, lado);
    }

    @Override
    public double calcPerimetro(){
        return super.calcPerimetro();
    }

    @Override
    public double calcArea(){
        double[] ladosQuad = super.getLados();
        return Math.pow(ladosQuad[0],2);
    }

    public double getLado(){
        double[] ladosQuad = super.getLados();
        return ladosQuad[1];
    }

}
public class Circulo implements Forma{

    private double raio;

    public Circulo(){
        this.raio = 1.0;
    }

    public Circulo(double raio){
        this.raio = raio;
    }   

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return raio;
    }

    public double calcPerimetro(){
        return raio*2*Math.PI;
    }

    public double calcArea(){
        return Math.PI*Math.pow(raio,2);
    }

}
public class principal {
    
    public static void main(String[] args) {
        
        Quadrado quad = new Quadrado(2);
        Circulo circ = new Circulo(5);
        Retangulo ret = new Retangulo(12, 10);

        //Dados do Quadrado
        System.out.println("*******Quadrado*******");
        System.out.println(quad.getLado());
        System.out.println(quad.calcArea());
        System.out.println(quad.calcPerimetro());
        System.out.println();

        //Dados do Circulo
        System.out.println("********Circulo*********");
        System.out.println(circ.getRaio());
        System.out.println(circ.calcArea());
        System.out.println(circ.calcPerimetro());
        System.out.println();

        //Dados do Retangulo
        System.out.println("********Retangulo*********");
        System.out.println("Altura: " + ret.getAltura()+" - Base: "+ ret.getBase());
        System.out.println(ret.calcArea());
        System.out.println(ret.calcPerimetro());
    }
}


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

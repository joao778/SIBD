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


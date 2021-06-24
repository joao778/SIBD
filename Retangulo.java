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


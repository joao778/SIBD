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

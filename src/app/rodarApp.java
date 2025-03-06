package app;
public class rodarApp {
    public static void main(String[] args) { //ponto de entrada pra começar a funcionar
        Carro carro1 = new Carro();  // construtor simples sem parametros

        carro1.setCor("AZUL");
        carro1.setModelo("Bmw");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));


        // cria-se o ojeto valendo-se de sobrecarga do metodo construtor
        Carro carro2 = new Carro( "cinza", "Mercedes", 66); // construtor com parametros//

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));


    }
}

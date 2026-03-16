public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.marca = "Toyota";
        carro1.velocidad = 180;
        carro1.puertas = 4;

        carro1.mostrarInfo();

        System.out.println("Marca: " + carro1.marca);
        System.out.println("Velocidad: " + carro1.velocidad);
        System.out.println("Puertas: " + carro1.puertas);

    }

}

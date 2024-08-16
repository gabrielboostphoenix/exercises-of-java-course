package poo;

// That's a class where all the things happen
public class Main {
    // That's the main method that runs all the application
    public static void main(String[] args) {

        // Creating an object through the car class
        Car civic = new Car();
        // Setting the attributes of the car
        civic.setHorsepower(150);
        civic.setColor("Prata");
        civic.setAutomaker("Honda");
        civic.setTransmission("Automático");
        civic.setTankCapacity(13);
        civic.setAutonomy(50);
        civic.fillUpTank(4);

        // Showing the details of the car by properties
        System.out.println("Detalhes do carro:");
        System.out.printf("Potência do motor em cavalos: %d%n", civic.getHorsepower());
        System.out.printf("Cor do veículo: %s%n", civic.getColor());
        System.out.printf("Sistema de transmissão: %s%n", civic.getTransmission());
        System.out.printf("Fabricante: %s%n", civic.getAutomaker());
        System.out.printf("Capacidade do tanque: %.2f litros%n", civic.getTankCapacity() * 3.8);
        System.out.printf("Quantidade de combustível: %.2f litros%n", civic.getFuel() * 3.8);
        System.out.printf("Autonomia do veículo: %d litros por km%n", civic.showAutonomy());
    }
}

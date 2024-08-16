package poo;

// That's a class that defines a car model
public class Car {
    // Attributes
    private int horsepower;
    private String color;
    private String automaker;
    private String transmission;
    private int tankCapacity;
    private int fuel;
    private int autonomy;

    // Getters Methods
    public int getHorsepower() {
        return this.horsepower;
    }

    public String getColor() {
        return this.color;
    }

    public String getAutomaker() {
        return this.automaker;
    }

    public String getTransmission() {
        return this.transmission;
    }

    public int getTankCapacity() {
        return this.tankCapacity;
    }

    public int getFuel() {
        return this.fuel;
    }

    public int getAutonomy() {
        return this.autonomy;
    }

    // Setters Methods
    public void setHorsepower(int power) {
        this.horsepower = power;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAutomaker(String automaker) {
        this.automaker = automaker;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setTankCapacity(int gallon) {
        this.tankCapacity = gallon;
    }

    private void setFuel(int gallon) {
        this.fuel = this.getFuel() + gallon;
    }

    public void setAutonomy(int miles) {
        this.autonomy = miles;
    }

    // Methods
    public void fillUpTank(int gallon) {

        // Checking if the tank already is full
        if (this.getFuel() == this.getTankCapacity()) {

            // Showing a message that wasn't possible to do that
            System.out.println("Não é possível abastecer o veículo, o tanque está cheio!");

        } else {

            // Checking the amount that is possible to fill up the tank
            int availableGallon =  this.getTankCapacity() - this.getFuel();

            // Checking if it's possible to do that
            if (gallon > availableGallon) {

                // Filling as far as possible
                this.setFuel(availableGallon);
                // Showing the message that was filled the vehicle tank
                System.out.printf("Foi possível preencher até %.2f litros%n", availableGallon * 3.8);
                // Showing the rest of the fuel that wasn't possible to fill up
                System.out.printf("Excedente de combustível: %.2f litros%n", (gallon - availableGallon) * 3.8);

            } else if (gallon == availableGallon)  {

                // Filling up the vehicle tank
                this.setFuel(gallon);
                // Showing the message that was filled the vehicle tank with successfully
                System.out.println("Tanque de combustível preenchido com sucesso até o final!");

            } else {

                // Filling up the vehicle tank
                this.setFuel(gallon);
                // Showing the message that was filled the vehicle tank with successfully
                System.out.printf("Tanque de combustível do veículo preenchido com %.2f litros%n", gallon * 3.8);
                // Calculating the available amount that still wasn't filled in the vehicle tank
                int availableGallonAmount = this.getTankCapacity() - this.getFuel();
                // Showing the available amount in the vehicle tank
                System.out.printf("Quantidade vazia de combustível no tanque do veículo: %.2f litros%n", availableGallonAmount * 3.8);

            }
        }

    }

    public  int showAutonomy() {
        // Calculating the fuel autonomy
        int autonomy;
        autonomy = this.getFuel() * this.getAutonomy();
        // Returning the autonomy result
        return autonomy;
    }

}

package Transport;

public class Bus extends Transport {
    private int wheels;
    private String type;

    private int length;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Bus(String brand, String model, int year, String country, String color, int maxSpeed, int wheels, String type, int length) {
        super(brand, model, year, country, color, maxSpeed);
        this.wheels = wheels;
        this.type = type;
        this.length = length;


    }
}

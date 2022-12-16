public class Cars {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int year;
    public String country;

    Cars(String brand, String model, double engineVolume, String color, int year, String country) {
        if (model == null) {
            this.model = "default";
        } else this.model = model;
        if (brand == null) {
            this.brand = "default";
        } else this.brand = brand;
        if (country == null) {
            this.country = "default";
        } else this.country = country;

        if (engineVolume <= 0) {
           this.engineVolume = 1.5;
        } else this.engineVolume = engineVolume;

        if (color == null) {
            this.color = "белого";
        } else this.color = color;

        if (year <= 0) {
            this.year = 2000;
        } else this.year = year;


    }

}

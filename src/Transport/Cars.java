package Transport;

public class Cars {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String carStyle;
    private String regNumber;
    private final int seatsNumber;
    private boolean tires;
    private Key key;

    public Cars(String brand,
                String model,
                double engineVolume,
                String color,
                int year,
                String country,
                String transmission,
                String carStyle,
                String regNumber,
                int seatsNumber,
                boolean tires,
                Key key) {

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

        if (transmission == null) {
            this.transmission = "Некорректное значение";
        } else this.transmission = transmission;

        if (carStyle == null) {
            this.carStyle = "Неккоректное значение";
        } else this.carStyle = carStyle;

        if (regNumber == null) {
            this.regNumber = "Некорректное значение";
        } else this.regNumber = regNumber;

        if (seatsNumber < 3) {
            this.seatsNumber = 5;
        } else this.seatsNumber = seatsNumber;

        this.tires = tires;

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getCarStyle() {
        return carStyle;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public boolean getTires() {
        return tires;
    }

    public void setTires(boolean tires) {
        this.tires = tires;
    }

    public void typeOfTyres() {
        this.tires = !this.tires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public class Key {
       private boolean remoteEngineStart;
       private boolean noKeyAccess;

        public Key(boolean remoteEngineStart, boolean noKeyAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.noKeyAccess = noKeyAccess;
        }
        public Key() {
            this(false,false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isNoKeyAccess() {
            return noKeyAccess;
        }
    }
}

package Transport;

public class Cars extends Transport {

    private double engineVolume;
    private String transmission;
    private final String carStyle;
    private String regNumber;
    private final int seatsNumber;
    private boolean tires;
    private Key key;

    public Cars(String brand,
                String model,
                int year,
                String country,
                String color,
                int maxSpeed,
                String carStyle,
                String transmission,
                double engineVolume,
                String regNumber,
                int seatsNumber,
                boolean tires,
                Key key) {

        super(brand,model, year, country, color, maxSpeed);


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


    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public boolean isTires() {
        return tires;
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

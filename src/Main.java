import Transport.Cars;

public class Main {
    public static void main(String[] args) {


        Cars bmw = new Cars("BMW","Z8",3.0,"черного",2021,"Германии","Автомат", "Родстер",
                "А011КР", 3, true, null);
        System.out.println(bmw.getBrand() + " " + bmw.getModel() + ", " + bmw.getEngineVolume() + " год выпуска, сборка в " + bmw.getCountry() + ", " +
                bmw.getColor() +  " цвета, объем двигателя — " + bmw.getEngineVolume() + " л. Коробка " + bmw.getTransmission() + ", " +
                "тип кузова " + bmw.getCarStyle() + ". " + "Регистрационный номер " + bmw.getRegNumber() + ", количество мест для сидения - " + bmw.getSeatsNumber() +
                ". Зимние шины " + bmw.getTires() + ". Ключ доступа " + bmw.getKey());

    }
}
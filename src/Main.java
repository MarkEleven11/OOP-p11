import Transport.Bus;
import Transport.Cars;

public class Main {
    public static void main(String[] args) {


        Cars bmw = new Cars("BMW", "Z8",2020, "Germany", "Yellow", 280, "Roadster", "Mechanic", 4.0,
                "J11ME", 6, true, null);

        System.out.println(bmw.getBrand() + " " + bmw.getModel() + ", " + bmw.getEngineVolume() + " год выпуска, сборка в " + bmw.getCountry() + ", " +
                bmw.getColor() +  " цвета, объем двигателя — " + bmw.getEngineVolume() + " л. " + " Коробока" + bmw.getTransmission() +
                "Тип кузова " + bmw.getCarStyle() + ". " + "Регистрационный номер " + bmw.getRegNumber() + ", количество мест для сидения - " + bmw.getSeatsNumber() +
                ". Зимние шины " + bmw.getTires() + ". Ключ доступа " + bmw.getKey() + ". Максимальная скорость " + bmw.getMaxSpeed());

        Bus scania = new Bus("Scania", "Touring", 2012, "Sweden", "White", 100, 6, "tourist", 12);
        System.out.println("Марка автобуса " + scania.getBrand() + ". Модель " + scania.getModel() + ". Год выпуска " + scania.getYear() + ". Страна выпуска " +
                scania.getCountry() + ". Цвет " + scania.getColor() + ". Максимальная скорость " + scania.getMaxSpeed() + ". Количество колес " + scania.getWheels() +
                ". Тип  автобуса " + scania.getType() + ". Длина автобуса " + scania.getLength() + " метров.");
    }
}
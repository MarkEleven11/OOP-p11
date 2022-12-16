public class Main {
    public static void main(String[] args) {
        Cars granta = new Cars("Lada","Granta",1.7,"России",2015,"России");
        System.out.println(granta.brand + " " + granta.model + ", " + granta.year + " год выпуска, сборка в " + granta.country + ", " + granta.color +
                " цвета, объем двигателя — " + granta.engineVolume + " л, ");
        System.out.println();

        Cars audi = new Cars("Audi", "A8 50 L TDI quattro",3.0,"Германии",2020,"Германии");
        System.out.println(audi.brand + " " + audi.model + ", " + audi.year + " год выпуска, сборка в " + audi.country + ", " + audi.color +
                " цвета, объем двигателя — " + audi.engineVolume + " л.");
        System.out.println();

        Cars bmw = new Cars("BMW","Z8",3.0,"черный",2021,"Германии");
        System.out.println(bmw.brand + " " + bmw.model + ", " + bmw.year + " год выпуска, сборка в " + bmw.country + ", " + bmw.color +
                " цвета, объем двигателя — " + bmw.engineVolume + " л.");
        System.out.println();


        Cars kia = new Cars("Kia","Sportage 4-го поколения",2.4,"красный",2018, "Южной Корее");
        System.out.println(kia.brand + " " + kia.model + ", " + kia.year + " год выпуска, сборка в " + kia.country + ", " + kia.color +
                " цвета, объем двигателя — " + kia.engineVolume + " л.");
        System.out.println();

        Cars hunday = new Cars("Hyundai","Avante",1.6,"оранжевый",2018,"Южной Корее");
        System.out.println(hunday.brand + " " + hunday.model + ", " + hunday.year + " год выпуска, сборка в " + hunday.country + ", " + hunday.color +
                " цвета, объем двигателя — " + hunday.engineVolume + " л.");
        System.out.println();

    }
}
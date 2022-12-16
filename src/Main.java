public class Main {
    public static void main(String[] args) {
        Cars granta = new Cars();
        granta.brand = "Lada";
        granta.model = "Granta";
        granta.year = 2015;
        granta.country = "России";
        granta.color = "желтого";
        granta.engineVolume = 1.7;
        System.out.println(granta.brand + granta.model + ", " + granta.year + " год выпуска, сборка в " + granta.country + ", " + granta.color +
                " цвета, объем двигателя — " + granta.engineVolume + " л, ");
        System.out.println();

        Cars audi = new Cars();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.year = 2020;
        audi.country = "Германии";
        audi.color = "черный";
        audi.engineVolume = 3.0;
        System.out.println(audi.brand + audi.model + ", " + audi.year + " год выпуска, сборка в " + audi.country + ", " + audi.color +
                " цвета, объем двигателя — " + audi.engineVolume + " л.");
        System.out.println();

        Cars bmw = new Cars();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.year = 2021;
        bmw.country = "Германии";
        bmw.color = "черный";
        bmw.engineVolume = 3.0;
        System.out.println(bmw.brand + bmw.model + ", " + bmw.year + " год выпуска, сборка в " + bmw.country + ", " + bmw.color +
                " цвета, объем двигателя — " + bmw.engineVolume + " л.");
        System.out.println();


        Cars kia = new Cars();
        kia.brand = "Kia";
        kia.model = "Sportage 4-го поколения";
        kia.year = 2018;
        kia.country = "Южной Корее";
        kia.color = "красный";
        kia.engineVolume = 2.4;
        System.out.println(kia.brand + kia.model + ", " + kia.year + " год выпуска, сборка в " + kia.country + ", " + kia.color +
                " цвета, объем двигателя — " + kia.engineVolume + " л.");
        System.out.println();

        Cars hunday = new Cars();
        hunday.brand = "Hyundai";
        hunday.model = "Avante";
        hunday.year = 2018;
        hunday.country = "Южной Корее";
        hunday.color = "оранжевый";
        hunday.engineVolume = 1.6;
        System.out.println(hunday.brand + hunday.model + ", " + hunday.year + " год выпуска, сборка в " + hunday.country + ", " + hunday.color +
                " цвета, объем двигателя — " + hunday.engineVolume + " л.");
        System.out.println();

    }
}
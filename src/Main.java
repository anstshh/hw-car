public class Main {
    public static void main(String[] args) {

        Car granta = new Car();
        granta.brand = "Lada";
        granta.model = "Granta";
        granta.volumeOfEngine = 1.7;
        granta.colour = "желтый";
        granta.yearOfProduction = 2015;
        granta.countryOfOrigin = "Россия";
        System.out.println("Марка автомобиля " + granta.brand +
                ", модель автомобиля " + granta.model +
                ", объем двигателя " + granta.volumeOfEngine +
                ", цвет автомобиля " + granta.colour +
                ", год выпуска " + granta.yearOfProduction +
                ", страна производства " + granta.countryOfOrigin);

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.volumeOfEngine = 3.0;
        audi.colour = "черный";
        audi.yearOfProduction =  2020;
        audi.countryOfOrigin = "Германия";
        System.out.println("Марка автомобиля " + audi.brand +
                ", модель автомобиля " + audi.model +
                ", объем двигателя " + audi.volumeOfEngine +
                ", цвет автомобиля " + audi.colour +
                ", год выпуска " + audi.yearOfProduction +
                ", страна производства " + audi.countryOfOrigin);

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.volumeOfEngine = 3.0;
        bmw.colour = "черный";
        bmw.yearOfProduction =  2021;
        bmw.countryOfOrigin = "Германия";
        System.out.println("Марка автомобиля " + bmw.brand +
                ", модель автомобиля " + bmw.model +
                ", объем двигателя " + bmw.volumeOfEngine +
                ", цвет автомобиля " + bmw.colour +
                ", год выпуска " + bmw.yearOfProduction +
                ", страна производства " + bmw.countryOfOrigin);

        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Sportage 4 поколение";
        kia.volumeOfEngine = 2.4;
        kia.colour = "красный";
        kia.yearOfProduction =  2018;
        kia.countryOfOrigin = "Южная Корея";
        System.out.println("Марка автомобиля " + kia.brand +
                ", модель автомобиля " + kia.model +
                ", объем двигателя " + kia.volumeOfEngine +
                ", цвет автомобиля " + kia.colour +
                ", год выпуска " + kia.yearOfProduction +
                ", страна производства " + kia.countryOfOrigin);

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.volumeOfEngine = 1.6;
        hyundai.colour = "оранжевый";
        hyundai.yearOfProduction =  2016;
        hyundai.countryOfOrigin = "Южная Корея";
        System.out.println("Марка автомобиля " + hyundai.brand +
                ", модель автомобиля " + hyundai.model +
                ", объем двигателя " + hyundai.volumeOfEngine +
                ", цвет автомобиля " + hyundai.colour +
                ", год выпуска " + hyundai.yearOfProduction +
                ", страна производства " + hyundai.countryOfOrigin);

    }
}
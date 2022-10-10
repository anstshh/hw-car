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

    }
}
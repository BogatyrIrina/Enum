public class Main {
    public static void main(String[] args) {
        Car granta = new Car("Lada", "Granta", 1.7, Car.BodyType.SEDAN);
        granta.printTransport();

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, Car.BodyType.SEDAN);
        audi.printTransport();

        Car bmw = new Car("BMW", "Z8", 3.0, Car.BodyType.SEDAN);
        bmw.printTransport();

        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4, Car.BodyType.SEDAN);
        kia.printTransport();

        Bus man = new Bus("MAN", "Lion's City", 1.7, Bus.Capacity.MIDDLE);
        man.printTransport();

        Bus citroen = new Bus("Citroen", "Jumper II", 2.0, Bus.Capacity.SMALL);
        citroen.printTransport();

        Bus mercedes = new Bus("Mercedes-Benz", "Sprinter Classic", 1.7, Bus.Capacity.MIDDLE);
        mercedes.printTransport();

        Bus toyota = new Bus("Toyota", "Coaster", 2.0, Bus.Capacity.MIDDLE);
        toyota.printTransport();

        Truck kamaz = new Truck( "КАМАЗ", "4310", 5, Truck.Carrying.N3);
        kamaz.printTransport();

        Truck belaz = new Truck( "БелАЗ", "75710", 5.5, Truck.Carrying.N3);
        belaz.printTransport();

        Truck zil = new Truck( "ЗИЛ", "130", 5, Truck.Carrying.N3);
        zil.printTransport();

        Truck maz = new Truck( "МАЗ", "7310", 6, Truck.Carrying.N3);
        maz.printTransport();


        DriverB ivanov = new DriverB("Иванов", "Иван", "Иванович",
                "Категория В", 20);
        granta.drive(ivanov);


        DriverC petrov = new DriverC("Петров", "Петр", "Петрович",
                "Категория С", 20);
        man.drive(petrov);


        DriverD sidorov = new DriverD("Сидоров", "Сидор", "Сидорович",
                "Категория D", 20);
        kamaz.drive(sidorov);

    }
}
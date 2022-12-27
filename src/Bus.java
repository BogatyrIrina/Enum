public class Bus extends Transport<DriverC> implements Competing {

    Capacity capacity;

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public Bus(String brand, String model, double engineCapacity, Capacity middle) {
        super(brand, model, engineCapacity);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начинает движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автобус заканчивает движение");
    }

    @Override
    public void printType() {

    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " сделал пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " показал лучшее время круга: ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " проехал с максимальной скорость: ");
    }
    public enum Capacity{
        ESPECIALLY_SMALL(10),
        SMALL(25),
        MIDDLE(50),
        LARGE(80),
        ESPECIALLY_LARGE(120);

        private final int seats;

        Capacity(int seats) {
            this.seats = seats;
        }

        public int getSeats() {
            return seats;
        }
    }
}

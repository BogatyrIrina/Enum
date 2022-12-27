public class Truck extends Transport<DriverD> implements Competing{

    Carrying carrying;

    public Carrying getCarrying() {
        return carrying;
    }

    public void setCarrying(Carrying carrying) {
        this.carrying = carrying;
    }

    public Truck(String brand, String model, double engineCapacity, Carrying n3) {
        super(brand, model, engineCapacity);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик начинает движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовик заканчивает движение");
    }

    @Override
    public void printType() {
        if (carrying == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип кузова автомобиля: " + getCarrying());
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " делает пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Тягач " + getBrand() + " " + getModel() + " лучшее время круга составило ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " поехал с максимальной скорость: " );
    }
    public enum Carrying {
        N1(3.5F),
        N2(5.0F),
        N3(12.0F);
        private final float weight;

        Carrying(float weight) {
            this.weight = weight;
        }

        public float getWeight() {
            return weight;
        }
        public String toString(){
            return "Тип кузова: " + getWeight();
        }
    };
}

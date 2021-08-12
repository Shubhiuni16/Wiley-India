interface Vehicle {
    void start();
    void stop();
    int getNoOfWheels();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    public int getNoOfWheels(){
        return 4;
    }

    void performWheelie() {
        System.out.println("Wheelies are dangerous");
    }
}
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike started");
    }

    public void stop() {
        System.out.println("Bike stopped");
    }

    public int getNoOfWheels(){
        return 2;
    }

    void performWheelie() {
        System.out.println("Wheelies are dangerous");
    }
}
class Interfaces {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        c.start();
        c.stop();
        b.start();
        b.stop();
        System.out.println(b.getNoOfWheels());
    }
}



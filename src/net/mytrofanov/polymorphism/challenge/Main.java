package net.mytrofanov.polymorphism.challenge;

public class Main {
    public static void main(String[] args) {
        Car ferrary = new FerraryF40(8, "V-type", "f40", 1990);
        startAccelerateBrake(ferrary);

        Car lada = new Lada2109(4, "row", "21099", 1995);
        startAccelerateBrake(lada);

        Car skoda = new SkodaOctavia(4, "row", "1,8T", 2004);
        startAccelerateBrake(skoda);
    }

    public static void startAccelerateBrake(Car car) {
        car.startEngine();
        car.accelerate();
        car.brake();
        System.out.println("\n");
    }
}

class Car {
    private boolean engine;
    private int wheels;
    private int cylinders;
    private String cylinderName;

    public Car(int cylinders, String cylinderName) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.cylinderName = cylinderName;
    }

    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " : Engine is started");
    }

    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " : Vehicle is getting faster");
    }

    public void brake() {
        System.out.println(getClass().getSimpleName() + " : Vehicle is slowing down");
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getCylinderName() {
        return cylinderName;
    }
}

class FerraryF40 extends Car {
    private String model;
    private int yearOfIssue;
    private boolean isGearboxAutomatic;

    public FerraryF40(int cylinders, String cylinderName, String model, int yearOfIssue) {
        super(cylinders, cylinderName);
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.isGearboxAutomatic = false;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public boolean isGearboxAutomatic() {
        return isGearboxAutomatic;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " : pushing the button and engine is started");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " : wooooooooooooow!");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName() + " : you gotta be kidding me");
    }
}

class Lada2109 extends Car {
    private String model;
    private int yearOfIssue;
    private boolean isGearboxAutomatic;

    public Lada2109(int cylinders, String cylinderName, String model, int yearOfIssue) {
        super(cylinders, cylinderName);
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.isGearboxAutomatic = false;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public boolean isGearboxAutomatic() {
        return isGearboxAutomatic;
    }

    @Override
    public void startEngine() {
        putTheKey();
        System.out.println("Lada2109: Starting engine with a key");
    }

    @Override
    public void accelerate() {
        shiftTheGearUp();
        System.out.println("Lada2109: vehicle is getting faster");
    }

    @Override
    public void brake() {
        System.out.println("Lada2109: vehicle is slowing down");
    }

    private void shiftTheGearUp() {
        System.out.println("Lada2109: Increase gear manually");
    }

    private void putTheKey() {
        System.out.println("Lada2109: Put the key into keyhole");
    }
}

class SkodaOctavia extends Car {

    private String model;
    private int yearOfIssue;
    private boolean isGearboxAutomatic;

    public SkodaOctavia(int cylinders, String cylinderName, String model, int yearOfIssue) {
        super(cylinders, cylinderName);
        this.model = model;
        this.yearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public boolean isGearboxAutomatic() {
        return isGearboxAutomatic;
    }

    @Override
    public void startEngine() {
        System.out.println("SkodaOctavia: remotely started engine");
    }

    @Override
    public void accelerate() {
        if (this.isGearboxAutomatic) {
            enableAntilockBrakingSystem();
        }
        System.out.println("SkodaOctavia: is getting faster");
    }

    @Override
    public void brake() {
        enableAntilockBrakingSystem();
        System.out.println("SkodaOctavia is slowing down");
    }

    private void enableAntilockBrakingSystem() {
        System.out.println("SkodaOctavia: antilock braking system enabled");
    }

    private void enableGearboxMode() {
        System.out.println("Gearbox: drive mode selected");
    }
}


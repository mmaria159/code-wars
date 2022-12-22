package oop.time.phone;

public class Phone {
    public static void main(String[] args) {
    AbstractPhone phone = new Smartphone(2022,18,"windows");
    phone.call(12);
        System.out.println(phone.toString());
        Smartphone smartphone = new Smartphone(2022,28,"linux");
        smartphone.install("linux");
        System.out.println(smartphone.toString());

        CellPhone cellPhone = new Smartphone(2021,12,"linux");
        cellPhone.call(13);
        cellPhone.call(23);

        WirelessPhone wirelessPhone = new Smartphone(2022,4,"macos");
        wirelessPhone.call(2);
        wirelessPhone.ring(45);
    }
}
abstract class AbstractPhone {
    private int year;

    public AbstractPhone(int year) {
        this.year = year;
    }
    public abstract void call(int outputNumber);
    public abstract void ring(int inputNumber);
}
abstract class WirelessPhone extends AbstractPhone {

    private int hour;

    public WirelessPhone(int year, int hour) {
        super(year);
        this.hour = hour;
    }

}
 class CellPhone extends WirelessPhone {
    public CellPhone(int year, int hour) {
        super(year, hour);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вызываю номер " + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Вам звонит абонент " + inputNumber);
    }
}

class FixPhone extends WirelessPhone {

    public FixPhone(int year, int hour) {
        super(year, hour);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("fix phone call" + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("fix phone ring" + inputNumber);
    }
}

class Smartphone extends CellPhone {

    private String operationSystem;

    public Smartphone(int year, int hour, String operationSystem) {
        super(year, hour);
        this.operationSystem = operationSystem;
    }
    public void install(String program){
        System.out.println("Устанавливаю " + program + "для" + operationSystem);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("hello " + outputNumber);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "operationSystem='" + operationSystem + '\'' +
                '}';
    }
}

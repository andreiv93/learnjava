public class App {
    public static void main(String[] args) {
        Engine x = new Engine("GAS", 16);
        System.out.println(Car.getCounter());
        Car a = new Car();
        System.out.println(Car.getCounter());
        Car b = new Car(x,"rosu", "Ford", 1999);
        System.out.println(Car.getCounter());
        Car c = new Car();
        System.out.println(Car.getCounter());

        a.setColor("albastru");
        a.setModel("Renault");
        a.setYear(2002);

        c.setColor("alb");
        c.setModel("BMW");
        c.setYear(2015);

        System.out.println(a.getColor());
        System.out.println(c.getYear());

        System.out.println(a.isNew());
        System.out.println(b.isNew());
        System.out.println(c.isNew());

        Car[] cars = new Car[10];

        cars[0] = a;
        cars[4] = b;
        cars[9] = c;
    }
}

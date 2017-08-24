public class Car {
   private static int counter = 0;

   private Engine engine;



    private String color;
   private String model;
   private int year;

    //   TODO: use ALT+insert to generate constructor + getters/setters

   public Car() {
       System.out.println("Car was created with default constructor");
       counter++;
   }

   public Car(Engine engine, String color, String model, int year) {
       this.engine = engine;
       this.color = color;
       this.model = model;
       this.year = year;
       counter++;
   }
   
    public Engine getEngine() {
        return this.engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

   public static int getCounter() {
       return counter;
   }

   public String getColor() {
       return this.color;
   }

   public String getModel() {
       return this.model;
   }

   public int getYear() {
       return this.year;
   }

   public void setColor(String color) {
       this.color = color;
   }

   public void setModel(String model) {
       this.model = model;
   }

   public void setYear(int year) {
       this.year = year;
   }

   public boolean isNew() {
       if (this.year > 2000) {
           return true;
       }
       return false;
   }
}

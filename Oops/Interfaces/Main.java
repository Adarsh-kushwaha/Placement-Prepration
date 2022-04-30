package Oops.Interfaces;

public class Main {
   public static void main(String[] args) {
       Car car1 = new Car();

       car1.acc();
       car1.brake();
       car1.start();
       car1.stop();

       Media carMedia = (Media) new Car();
   }
}

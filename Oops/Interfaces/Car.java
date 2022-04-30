package Oops.Interfaces;

//you cannot implement Media here because it contain same method as Engine so for that we create seperate classes;
public class Car implements Engine, Brake {

    @Override
    public void brake() {
        // TODO Auto-generated method stub
        System.out.println("Stop the car");

    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("Start the engine");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("Stop the engine");
    }

    @Override
    public void acc() {
        // TODO Auto-generated method stub
        System.out.println("acc the engine");
    }

}

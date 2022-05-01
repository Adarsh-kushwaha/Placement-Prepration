package Oops.Interfaces;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("EE start");
        
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("EE stop");
    }

    @Override
    public void acc() {
        // TODO Auto-generated method stub
        System.out.println("EE acc");
    }
    
}

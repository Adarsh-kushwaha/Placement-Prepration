package Oops.Singelton;

public class Singelton {
    private Singelton() {

    }

    private static Singelton instance;

    public static Singelton getInstance() {
// create instance if it is null otherwise return the same instance 
        if (instance == null) {
            instance = new Singelton();
        }

        return instance;
    }
}

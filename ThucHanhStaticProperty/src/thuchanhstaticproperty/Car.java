package thuchanhstaticproperty;

public class Car {
    private String name;

    private String engine;

    public static int numberOfCars;

    public Car(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;
    }

    public String getCarName(){
        return this.name;
    }

    public String setCarName(String name){
        return this.name=name;
    }

    public String getCarEngine(){
        return this.engine;
    }

    public String getCarEngine(String engine){
        return this.engine=engine;
    }



}

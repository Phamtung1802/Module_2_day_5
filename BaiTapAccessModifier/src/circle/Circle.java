package circle;

public class Circle {
    private double radius=1.0, area;
    private String color="red";


    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return this.radius;
    }
    public double setRadius(double radius){
        return this.radius=radius;
    }

    public double getArea(){
        return this.area=this.radius*this.radius*Math.PI;
    }


}

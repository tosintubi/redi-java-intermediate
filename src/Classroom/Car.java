package Classroom;

public class Car {

    // Color, Type and Speed
    private String  color;
    private String type;
    private  int speed;


    public Car() {
        this.color = "Blue";
        this.type = "Mercedes";
        this.speed = 0;
    }


    public void paint(String newColor){
        this.color = newColor;
    }

    public void accelerate(int newSpeed){
        this.speed = newSpeed;
    }

    public String getType()
    {
        return this.type;
    }

    public int printSpeed(){
        return  this.speed;
    }

    public void printCar(){
        System.out.println("Car Type: "+this.type +"\n" +
                "Color is :"+this.color +"\n"+
                "Speed is :"+this.speed);
    }
}

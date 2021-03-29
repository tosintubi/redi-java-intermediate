package Classroom;

public class Car {

    // Color, Type and Speed
    private String  color;
    private String type;
    private  int speed;
    private int gear;

    // NoArgs constructor
    public Car() {
        this.color = "Blue";
        this.type = "Mercedes";
        this.speed = 0;
    }

    public Car(String color, String type, int speed) {
        this.color = color;
        this.type = type;
        this.speed = speed;
    }

    public void paint(String newColor){
        this.color = newColor;
    }

    public String getColor(){
        return this.color;
    }



    public void accelerate(int newSpeed){
        this.speed = newSpeed;
        if (speed > 10){
            this.changeGear(2);
        }
    }

    public String getType()
    {
        return this.type;
    }

    public int printSpeed(){
        return  this.speed;
    }

    public void print(){
        System.out.println("Car Type: "+this.type +"\n" +
                "Color is :"+this.color +"\n"+
                "Speed is :"+this.speed);
    }

    private void changeGear(int newGear){
        this.gear = newGear;
    }
}

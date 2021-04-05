package homework6;

public class Dog extends  Animal implements IWalk{

    private DogBreed breed;
    private String owner;
    private int age;
    private String color;
    private float height;


    public Dog(DogBreed breed, String owner, int age, String color, float height) {
        super();
        this.breed = breed;
        this.owner = owner;
        this.age = age;
        this.color = color;
        this.height = height;
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println("I'm walking with my owner");
    }

    @Override
    protected void printInfo() {
        super.printInfo();
        System.out.println("I am a          : "+ this.breed + " dog");
        System.out.println("My Name  is     : "+ super.getName());
        System.out.println("My Owner is     : "+ this.getOwner());
        System.out.println("I am            : "+ this.getAge() + " years old");
        System.out.println("My color is     : "+ this.getColor());
        System.out.println("I am            : "+ this.getHeight() + " meters high");
    }


    //.. Only dogs bark
     protected void bark(){
        System.out.println(super.getName() + " is barking ..."+ "Woof... Woof... Woof!!!");
    }

    public DogBreed getBreed() {
        return breed;
    }

    public void setBreed(DogBreed breed) {
        this.breed = breed;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}

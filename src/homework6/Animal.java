package homework6;

public  class Animal implements  ISwim, IFly{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private boolean isExtinct;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
    }

    @Override
    public void swim() {
    }

    private void whoAmI(){
        System.out.println("I'm an animal");
    }

    protected void print(){

    }
    public String getExtinct() {
        return (isExtinct) ? "Yes" : "No";
    }

    public void setExtinct(boolean extinct) {
        isExtinct = extinct;
    }


}

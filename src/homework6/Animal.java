package homework6;

public  class Animal{
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


    private void whoAmI(){
        System.out.println("I'm an animal");
    }

    protected void printInfo(){

    }
    public String getExtinct() {
        return (isExtinct) ? "Yes" : "No";
    }

    public void setExtinct(boolean extinct) {
        isExtinct = extinct;
    }


}

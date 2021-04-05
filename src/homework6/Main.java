package homework6;

public class Main {
    public static void main(String[] args) {
        Fish whale = new Fish("Macserous","Blue Whale",Habitat.FRESH_WATER,false, 14,250);
        whale.printInfo();

        System.out.println("==========================");

        Dog unoDog = new Dog("Uno");
        unoDog.setAge(3);
        unoDog.setBreed(DogBreed.German_Shepherd);
        unoDog.setOwner("Marx");
        unoDog.setHeight(0.4F);
        unoDog.setColor("Brown");
        unoDog.printInfo();

        System.out.println("==========================");
        unoDog.bark();
    }
}

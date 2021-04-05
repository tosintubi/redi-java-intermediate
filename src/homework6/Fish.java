package homework6;


public class Fish extends  Animal{

    private String Category;
    private Habitat fishHabitat;
    private boolean hasScales;
    private int maxLifeSpan;
    private float maxSize;

    public Fish(String name, String fishCategory, Habitat fishHabitat, boolean hasScales, int maxLifeSpan, float maxSize) {
        super(name);
        this.Category = fishCategory;
        this.fishHabitat = fishHabitat;
        this.hasScales = hasScales;
        this.maxLifeSpan = maxLifeSpan;
        this.maxSize = maxSize;

    }

    public Fish() {
        super();
    }

    @Override
    public void swim() {
        super.swim();
        System.out.println("I'm swimming ");
    }

    @Override
    protected void print() {
        super.print();
        System.out.println("I am a          : "+ this.getFishCategory());
        System.out.println("My Name  is     : "+ super.getName());
        System.out.println("I live in       : "+ this.getFishHabitat());
        System.out.println("My Max size is  : "+ this.getMaxSize());
        System.out.println("I live in       : "+ this.getFishHabitat());
        System.out.println("Am i extinct    : "+ super.getExtinct());
    }

    public String getFishCategory() {
        return Category;
    }

    public void setFishName(String fishName) {
        this.Category = fishName;
    }

    public Habitat getFishHabitat() {
        return fishHabitat;
    }

    public void setFishHabitat(Habitat fishHabitat) {
        this.fishHabitat = fishHabitat;
    }

    public String getHasScales() {
        return (hasScales) ? "Yes" : "No";
    }

    public void setHasScales(boolean hasScales) {
        this.hasScales = hasScales;
    }

    public int getMaxLifeSpan() {
        return maxLifeSpan;
    }

    public void setMaxLifeSpan(int maxLifeSpan) {
        this.maxLifeSpan = maxLifeSpan;
    }

    public float getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(float maxSize) {
        this.maxSize = maxSize;
    }
}

package exercices;

public class Point {
    private final Integer x;
    private final Integer y;

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!getClass().equals(obj.getClass())){
            System.out.println(obj.getClass());
        }
        return true;
    }
}

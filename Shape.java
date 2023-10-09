public abstract class Shape {
    public Integer x;
    public Integer y;

    public abstract Integer area();

    public Integer calculateArea() {
        return x * y;
    }

    public Integer calculateArea(Integer x, Integer y) {
        return x * y;
    }
}

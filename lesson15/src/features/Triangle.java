package features;

public record Triangle(int x, int y, String name) {
    public Triangle(int x,int y){
        this(x,y,"H");
    }
    public String getInfo () {
        return "Hi";
    }
}

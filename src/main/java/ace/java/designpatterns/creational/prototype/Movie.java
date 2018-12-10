package ace.java.designpatterns.creational.prototype;

public class Movie implements  Cloneable{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Movie clone() throws CloneNotSupportedException{
        return (Movie) super.clone();
    }
}

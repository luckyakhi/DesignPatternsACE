package ace.java.designpatterns.behavioural.Visitor;

public class Edge implements Element{
    private String name;

    public Edge(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "name='" + name + '\'' +
                '}';
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

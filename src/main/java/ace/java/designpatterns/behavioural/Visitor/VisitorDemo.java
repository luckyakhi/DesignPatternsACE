package ace.java.designpatterns.behavioural.Visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorDemo {
    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        elements.add(new Node("Node A"));
        elements.add(new Node("Node B"));
        elements.add(new Edge("A -> B"));
        DisplayVisitor visitor = new DisplayVisitor();
        elements.forEach(element -> visitor.visit(element));
    }
}

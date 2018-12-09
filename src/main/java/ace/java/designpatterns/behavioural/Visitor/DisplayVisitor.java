package ace.java.designpatterns.behavioural.Visitor;

public class DisplayVisitor implements Visitor {
    @Override
    public void visit(Element e) {
        System.out.println(e);
    }
}

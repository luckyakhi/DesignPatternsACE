package ace.java.designpatterns.creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
       MovieRepo movieRepo = new MovieRepo();
       Movie mowgli = movieRepo.getMovie("mowgli");
       Movie mowgliClone = movieRepo.getMovie("mowgli");
       System.out.printf("Same reference %s \n",mowgli==mowgliClone);

    }
}

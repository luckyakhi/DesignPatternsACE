package ace.java.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class MovieRepo {
    private static Map<String,Movie> movieMap = new HashMap<>();
    public Movie getMovie(String name) throws CloneNotSupportedException {
        return  movieMap.computeIfAbsent(name,n-> new Movie(n)).clone();
    }
}

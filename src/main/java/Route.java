import java.util.ArrayList;
import java.util.List;

public class Route implements Comparable{
    private final List<Path> paths;
    private int length;

    public Route() {
        paths = new ArrayList<>();
        length = 0;
    }

    public void add(Path path){
        paths.add(path);
        length+=path.getLength();
    }

    public List<Path> getPaths() {
        return paths;
    }

    public int getLength() {
        return length;
    }

    @Override
    public int compareTo(Object o) {
        Route route= (Route) o;
        return length-route.getLength();
    }
}

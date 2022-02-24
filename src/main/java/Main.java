import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void routing(List<Point> points) {
        System.out.println(points.get(0));

        List<Point> otherPoints=new ArrayList<>(points);
        otherPoints.remove(points.get(0));

        System.out.println(otherPoints);
        if (otherPoints.size()!=0){
            routing(otherPoints);
        }
    }

    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 1));
        points.add(new Point(3, 2));
        points.add(new Point(4, 4));
        points.add(new Point(2, 3));

        routing(points);
    }
}

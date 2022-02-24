import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class RouteTest {
    @Test
    public void routeLength() {
        Path path1 = new Path(new Point(0, 0), new Point(10, 0));
        Path path2 = new Path(new Point(0, 0), new Point(0, 10));
        Path path3 = new Path(new Point(0, 0), new Point(20, 0));

        Route route = new Route();
        route.add(path1);
        route.add(path2);
        route.add(path3);

        assertEquals(40, route.getLength());
    }

    @Test
    public void routeCompare() {
        Path path1 = new Path(new Point(0, 0), new Point(10, 0));
        Path path2 = new Path(new Point(0, 0), new Point(0, 20));
        Path path3 = new Path(new Point(0, 0), new Point(25, 0));

        Route route1 = new Route();
        Route route2 = new Route();
        Route route3 = new Route();

        route1.add(path1); // length 30
        route1.add(path2);

        route2.add(path2); // length 45
        route2.add(path3);

        route3.add(path1); // length 35
        route3.add(path3);

        List<Route> routes = Arrays.asList(route1,route2,route3);

        Collections.sort(routes);

        assertEquals(route2,routes.get(2));
        assertEquals(route3,routes.get(1));

    }
}
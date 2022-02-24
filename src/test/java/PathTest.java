import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class PathTest {

    @Test
    public void pathGetters() {
        Point p1=new Point(1,2);
        Point p2=new Point(2,1);
        Path path=new Path(p1,p2);

        assertEquals(p1,path.getP1());
        assertEquals(p2,path.getP2());
    }

    @Test
    public void pathLength() {
        Path path1=new Path(new Point(1,4),new Point(5,1));
        Path path2=new Path(new Point(0,0),new Point(0,10));

        assertEquals(5,path1.getLength());
        assertEquals(10,path2.getLength());
    }

    @Test
    public void pathEquals() {
        Point p1=new Point(1,2);
        Point p2=new Point(2,3);
        Point p3=new Point(3,4);
        Path path1=new Path(p1,p2);
        Path path2=new Path(p2,p1);
        Path path3=new Path(p1,p3);

        assertEquals(path1, path2);
        assertEquals(path2, path1);
        assertNotEquals(path1, path3);
    }

    @Test
    public void pathCompare() {
        Path path1=new Path(new Point(1,1),new Point(20,20));
        Path path2=new Path(new Point(1,1),new Point(30,30));
        Path path3=new Path(new Point(1,1),new Point(10,10));

        ArrayList<Path> paths = new ArrayList<>();
        paths.add(path1);
        paths.add(path2);
        paths.add(path3);

        Collections.sort(paths);

        assertEquals(path3,paths.get(0));
        assertEquals(path1,paths.get(1));
        assertEquals(path2,paths.get(2));
    }
}
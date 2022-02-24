import java.util.Objects;

public class Path implements Comparable {
    private final Point p1;
    private final Point p2;
    private final int length;

    public Path(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;

        int dx = p1.getX() - p2.getX();
        int dy = p1.getY() - p2.getY();
        length = (int) Math.round(Math.sqrt(dx * dx + dy * dy));
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean equals(Object o) {
        Path path = (Path) o;
        return (p1.equals(path.p1) && p2.equals(path.p2))
                || (p1.equals(path.p2) && p2.equals(path.p1));
    }

    @Override
    public int hashCode() {
        return Objects.hash(p1, p2);
    }

    @Override
    public int compareTo(Object o) {
        Path path = (Path) o;
        return this.getLength() - path.getLength();
    }

    @Override
    public String toString() {
        return p1+"-"+p2;
    }
}

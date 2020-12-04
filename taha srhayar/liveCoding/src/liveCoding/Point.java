package liveCoding;

public class Point {

	int x, y, z;

	public Point() {
	}

	public Point(int xx, int yy, int zz) {
		this.x = xx;
		this.y = yy;
		this.z = zz;
	}
	
	public Point(int xx, int yy) {
		this.x = xx;
		this.y = yy;
	}

	public static void main(String[] args) {

		Point a = new Point(1, 1, 1);
		Point b = new Point(1, 1, 1);
		Point c = new Point(1, 1, 1);
		Point d = new Point(1, 1);
		
		System.out.println(d.toString());

	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}

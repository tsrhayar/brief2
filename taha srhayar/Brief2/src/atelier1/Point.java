package atelier1;

public class Point {

	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static double distance(Point A, Point B) {
		return Math.sqrt(Math.pow(A.x - B.x, 2) + Math.pow(A.y - B.y, 2));
	}

	public static void main(String[] args) {

		Point p1 = new Point(1, 4);
		Point p2 = new Point(2, 3);
		double distance = distance(p1, p2);
		System.out.println("La distance entre les deux point est: " + distance);

	}

}

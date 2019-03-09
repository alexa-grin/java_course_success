package ru.stqa.pft.sandbox;

public class PointMain {

	public static double distance(Point p1, Point p2) {
		double distance = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
		return distance;
	}

	public static void main(String[] args) {
		Point p1 = new Point(4.6, 1.9);
		Point p2 = new Point(1.0, 1.0);
		System.out.println(p1.distance(p2));
		System.out.println(distance(p1, p2));

		}
}







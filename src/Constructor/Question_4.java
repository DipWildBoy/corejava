package Constructor;

public class Question_4 {
	int s1=3;
	int s2=4;
	int s3=5;
	public double area() {
        // Heron's formula for calculating the area of a triangle
        double s = (s1 + s2 + s3) / 2;
        double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        return area;
    }

    public int perimeter() {
        return s1 + s2 + s3;
    }

    public static void main(String[] args) {
        Question_4 triangle = new Question_4();
        System.out.println("Area of the triangle: " + triangle.area());
        System.out.println("Perimeter of the triangle: " + triangle.perimeter());
    }
}






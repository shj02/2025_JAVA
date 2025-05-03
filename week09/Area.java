package week8;

public class Area {
	//원 넓이
	double areaCal(double radius) {
		return 3.14*radius*radius;
	}
	
	//정사각형 넓이
	int areaCal(int width) {
		return width*width;
	}
	
	//직사각형 넓이
	int areaCal(int width, int height) {
		return width*height;
	}
}

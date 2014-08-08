
public class RectangleModel {
	double surfaceAreaResult;
	
	public void computeSurfaceArea(double height, double width, double depth){
		double wh = width * height;
		double wd = width * depth;
		double dh = depth * height;
		surfaceAreaResult = 2*(wh + wd + dh);
	}
	
	public void computeSurfaceArea(double height, double width){
		surfaceAreaResult = height * width;
	}
	
	public double getSurfaceArea(){
		return surfaceAreaResult;
	}

}

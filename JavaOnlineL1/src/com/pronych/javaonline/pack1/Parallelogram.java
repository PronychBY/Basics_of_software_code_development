package com.pronych.javaonline.pack1;

public class Parallelogram {
	Point leftBottom;
	Point rightUpper;
	public Parallelogram(Point leftBottom, Point rightUpper) {
		this.setLeftBottom(leftBottom);
		this.setRightUpper(rightUpper);
	}
	public Point getLeftBottom() {
		return leftBottom;
	}
	public void setLeftBottom(Point leftBottom) {
		this.leftBottom = leftBottom;
	}
	public Point getRightUpper() {
		return rightUpper;
	}
	public void setRightUpper(Point rightUpper) {
		this.rightUpper = rightUpper;
	}
	
	public boolean isPointInParallelogram(Point point) {
		if (point.getX()<=rightUpper.getX()&&point.getX()>=leftBottom.getX()
				&& point.getY()<=rightUpper.getY()&&point.getY()>=leftBottom.getY()	
				) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
}

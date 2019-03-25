package com.raja.spring;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Trianglr implements InitializingBean,DisposableBean{
private List<Point> points;

public List<Point> getPoints() {
	return points;
}

public void setPoints(List<Point> points) {
	this.points = points;
}
public void getPointDraw()
{
	for(Point point:points)
	{
	System.out.println("point is"+point.getX()+","+point.getY());
	}
	
}

@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Init");
}

@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("destroyed");
}
}

package com.geometry;
import java.lang.Math;

public class Point{
    double x;
    double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    Point(Point s){
        x = s.x;
        y = s.y;
    }
    
    double distanceTo(Point p){
        return Math.sqrt(Math.pow(x-p.x, 2) + Math.pow(y-p.y, 2));
    }

}

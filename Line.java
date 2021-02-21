package com.geometry;
import com.geometry.Point;

public class Line{
    Point source, dest;
    double length;

    Line(Point s, Point d){
        source = new Point(s);
        dest = new Point(d);
        length = s.distanceTo(d);
    }
}


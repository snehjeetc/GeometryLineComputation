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

    Line(Line l){
        source = new Point(l.source);
        dest = new Point(l.dest);
        length = l.length;
    }

    public double getLength(){
        return length;
    }
}


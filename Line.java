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

    public boolean equalTo(Line l){
        return (source.equalTo(l.source) && dest.equalTo(l.dest) 
                && length == l.length);
    }

    public int compareTo(Line l){
        if( length == l.length)
            return 0;
        else if(length < l.length)
            return -1;
        else
            return 1;
    }

    public void print(){
        source.print();
        System.out.print(" ---> ");
        dest.print();
    }
}


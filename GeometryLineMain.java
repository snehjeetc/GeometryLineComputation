package com.geometry;
import java.util.Scanner;
import com.geometry.Line;

public class GeometryLineMain{
    public static void main(String[] args){
        
        System.out.println("Welcome to Line Comparison Computaion Program");
        Scanner sc = new Scanner(System.in);
        double x,y;
        System.out.println("Enter the source point : ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        Point source = new Point(x,y);
        System.out.println("Enter the ending point: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        Point dest = new Point(x,y);
        Line line = new Line(source, dest);
        System.out.println("The length of the line is : " + line.length );
    }
}



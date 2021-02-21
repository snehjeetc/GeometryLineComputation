package com.geometry;
import java.util.Scanner;
import com.geometry.Line;

public class GeometryLineMain{
    public static void main(String[] args){
        
        System.out.println("Welcome to Line Comparison Computaion Program");
        Line l1, l2;
        System.out.println("Enter line 1 : ");
        l1 = takeLineInput();
        System.out.println("Enter line 2 : ");
        l2 = takeLineInput();
        if(l1.equalTo(l2))
            System.out.println("Two line is same");
        else{
            int comp = l1.compareTo(l2);
            if(comp == 0)
                System.out.println("Two line is of same length");
            else if(comp < 0){
                System.out.print("[ ");
                l1.print();
                System.out.print(" ]");
                System.out.print(" < ");
                System.out.print("[ ");
                l2.print();
                System.out.print(" ]");
                System.out.println();
            }
            else{
                System.out.print("[ ");
                l1.print();
                System.out.print(" ]");
                System.out.print(" > ");
                System.out.print("[ ");
                l2.print();
                System.out.print(" ]");
                System.out.println();
            }
        }
    }
    static Point takePointInput(){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        Point point = new Point(x,y);
        return point;
    }
    static Line takeLineInput(){
        System.out.println("Enter the source point : ");
        Point source = takePointInput();
        System.out.println("Enter the ending point: ");
        Point dest = takePointInput();
        Line line = new Line(source, dest);
        return line;
    }
}



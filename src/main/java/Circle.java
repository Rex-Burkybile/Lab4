
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rex Burkybile
 */

public class Circle {
    Scanner Keyboard = new Scanner (System.in);
    static String radiusAsString = JOptionPane.showInputDialog("Radius of circle.");

    static double radius;
    static final double pi = 3.14159;
    
    public Circle (double rad) {
        this.radius = rad;
    }
    
    public Circle () {
        radius = 0.0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
    public static double area(){
        double area = pi * radius * radius;
        return area;
    }
    
    public static double diameter(){
        double diameter = radius * 2;
        return diameter;
    }
    
    public static double circumference(){
        double circumference = 2 * pi * radius;
        return circumference;
    }
    
    public static void main(String[] args) {
        Circle circle = new Circle();
        radius = Double.parseDouble(radiusAsString);
        
        double area = area();
        double diameter = diameter();
        double circumference = circumference();
        
        System.out.println("The circle's area is : " + area + " the diameter is: " + diameter + " the circumference is: " + circumference);
    }
}

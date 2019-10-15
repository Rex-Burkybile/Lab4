
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0800490
 */
public class CircleDemonstration {
    double radius;
    private final double pi = 3.14159;
    String radiusAsString = JOptionPane.showInputDialog("Radius of circle.");
    
    public CircleDemonstration (double rad) {
        this.radius = rad;
    }
    
    public CircleDemonstration () {
        radius = 0.0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
    public double area(){
        double area = pi * radius * radius;
        return area;
    }
    
    public double diameter(){
        double diameter = radius * 2;
        return diameter;
    }
    
    public double circumference(){
        double circumference = 2 * pi * radius;
        return circumference;
    }
}

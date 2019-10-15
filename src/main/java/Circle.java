
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
    
    
    public static void main(String[] args) {
        CircleDemonstration obj = new CircleDemonstration();
        obj.radius = Double.parseDouble(obj.radiusAsString);
        
        double area = obj.area();
        double diameter = obj.diameter();
        double circumference = obj.circumference();
        
        System.out.println("The circle's area is : " + area + " the diameter is: " + diameter + " the circumference is: " + circumference);
    }
}

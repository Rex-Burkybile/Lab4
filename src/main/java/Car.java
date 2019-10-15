/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rex Burkybile
 */
public class Car {
    
    public static void main(String[] args) {
        CarDemonstrations obj1 = new CarDemonstrations(95,"chevy");
        System.out.println("The car is accelerating to: ");
        
        
        for(int i = 1; i <= 5;i++){
            int a = obj1.accelerate();
            
            System.out.println(obj1.getSpeed());
        }
        
        System.out.println("The car is decelerating to: ");
        for(int j = 1; j <= 5;j++){
            int b = obj1.brake();
            
            System.out.println(obj1.getSpeed());
        }
        
    }
}

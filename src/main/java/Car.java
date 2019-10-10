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
    
    int yearModel;
    String make;
    static int speed;
   
    public Car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
        Car.speed = 0;
        
    }

    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return make;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public static int accelerate (){
        Car.speed = speed +5;
        return speed;
    }
    
    public static int brake(){
        Car.speed = speed - 5;
        return speed;
    }
    
    
    public static void main(String[] args) {
        Car obj1 = new Car(95,"chevy");
        System.out.println("The car is accelerating to: ");
        
        
        for(int i = 1; i <= 5;i++){
            int a = accelerate();
            
            System.out.println(obj1.getSpeed());
        }
        
        System.out.println("The car is decelerating to: ");
        for(int j = 1; j <= 5;j++){
            int b = brake();
            
            System.out.println(obj1.getSpeed());
        }
        
    }
}

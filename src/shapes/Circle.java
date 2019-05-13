/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author Carlos
 */
public class Circle {
    
    double area;
    double radius;
    
    public void setRadius(double radius){
        this.radius = radius;
        System.out.println ("radius");
        
    }
    
    public void drawCircle(){
        System.out.println ("Circle");
        System.out.println ("Circle2");
    }
    
    public void calcAreaCircle(double radius){
        this.area = 3.14159 * Math.pow(radius,2);
    }
    
}

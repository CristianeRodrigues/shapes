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
    }
    
    public void drawCircle(){
        System.out.println ("Circle");
    }
    
    public void calcAreaCircle(double radius){
        this.area = 3.14159 * Math.pow(radius,2);
    }
    
}

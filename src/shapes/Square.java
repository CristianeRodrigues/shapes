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
public class Square {
    
    double area;
    double sizeEdges;
    
    public void setSizeEdges(double sizeEdges){
        this.sizeEdges = sizeEdges;
        System.out.println ("size edges");
    }
    
    public void drawSquare(){
        System.out.println ("Square");
        System.out.println ("Square2");
        System.out.println ("Square3");
        System.out.println ("Square4");
    }
    
    public void calcAreaSquare(double sizeEdges){
        this.area = Math.pow(sizeEdges,2);
    }
    
}

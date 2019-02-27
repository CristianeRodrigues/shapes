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
public class Diamond {
    double littleDiagonal;
    double bigDiagonal;
    double area;
    
    public void setLittleDiagonal(double littleDiagonal){
        this.littleDiagonal = littleDiagonal;
    }
    public void setBigDiagonal(double bigDiagonal){
        this.bigDiagonal = bigDiagonal;
    }
    public void drawDiamond(){
        System.out.println ("Diamond");
    }
    
    public void calcAreaDiamond(double little_diagonal, double big_diagonal){
        this.area = (little_diagonal * big_diagonal)/2;
    }
}

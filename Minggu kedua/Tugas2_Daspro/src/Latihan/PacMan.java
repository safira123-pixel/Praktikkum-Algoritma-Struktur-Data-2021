
package Latihan;
public class PacMan {
 int x;
 int y;
 int width;
 int height;
 
 void moveLeft(){
     if ((x > 0)&&( x < width)){
         x = x+1;
 } else {
         
     }
 }
 void moveRight(){
    if ((x > 0)&&( x < width)){
        x = x - 1;   
    } else {
        
    } 
 }
 void moveUp(){
      if ((y > 0)&&( y < height)){
        y = y - 1;   
    } else {
        
    } 
 }
 void moveDown(){
      if ((y > 0)&&( y < height)){
        y = y + 1;   
    } else {
        
    } 
 }
 void printPosition(){
     System.out.println("x berada pada posisi :" +x);
     System.out.println("x berada pada posisi :" +y);
    
     
 }
    public static void main(String[] args) {
        PacMan pc = new PacMan();
        pc.x = 4;
        pc.y = 3;
        pc.height = 10;
        pc.width = 13;
        pc.moveDown();
        pc.moveLeft();
        pc.moveRight();
        pc.moveUp();
        pc.printPosition();

        
    }
     
}


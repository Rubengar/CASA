/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square campo;
    private Person persona;
    private Circle nube1;
    private Circle nube2;
    private Circle nube3;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
     
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        campo = new Square();
        campo.moveHorizontal(-500);
        campo.moveVertical(100);
        campo.changeSize(1000);
        campo.changeColor("green");
        campo.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    /**
     * make the sun move
     */
    public void moveSun()
    {
        if (wall != null)   // only if it's painted already...
        {
           sun.slowMoveVertical(120);
           sun.changeColor("black");
           wall.changeColor("black");
           roof.changeColor("black");
           window.changeColor("white");
           campo.changeColor("black");
           
            
           }
    }/**
     * create a person
     */
    public void createPerson()
    {
       if (wall != null)   // only if it's painted already...
        {   persona = new Person();
            persona.moveHorizontal(-200);
            persona.moveVertical(-12);
            persona.makeVisible();
            
           }
    }/**
     * move a person
     */
    public void movePerson()
    {
       if (wall != null)   // only if it's painted already...
        { persona.slowMoveHorizontal(50);
           }
    }/**
     * create a clouds
     */
    public void createClouds()
    {
       if (wall != null)   // only if it's painted already...
        { nube1 = new Circle();
          nube1.changeColor("black");
          nube1.makeVisible();
          nube1.changeSize(600);
          nube1.moveVertical(-600);
          nube1.moveHorizontal(300);
          nube1.slowMoveHorizontal(-300);
       
         
          nube3 = new Circle();
          nube3.changeColor("black");
          nube3.makeVisible();
          nube3.changeSize(600);
          nube3.moveVertical(-600);
          nube3.moveHorizontal(-1200);
          nube3.slowMoveHorizontal(600);
          
          
          nube2 = new Circle();
          nube2.changeColor("black");
          nube2.makeVisible();
          nube2.changeSize(600);
          nube2.moveVertical(-600);
          nube2.moveHorizontal(300);
          nube2.slowMoveHorizontal(-600);
      
        
          
          
           }
    }}

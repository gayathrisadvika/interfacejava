interface Shape
{
    void draw();

}
class Rectangle implements Shape//rectangle clss is a concrete class
{
    public void draw()
    {
        System.out.println("Rectangle is drawn...");
    }
}
class Circle implements Shape//rectangle clss is a concrete class
{
    public void draw()
    {
        System.out.println("Circle is drawn...");
    }
}
class Demo
{
    static Shape getShape(int n)//getshape() returns the s variable it retunrs the rectangle class of object and getshape() method is an instance method
    {
        // Shape s = new Rectangle();// creating a object for the rectangle class and assign to the shape and it is upcasting
        //return s; // s is the variable of the shape return type
        Shape s=null;
        if (n==1)
            s=new Rectangle();
        else if(n==2)
           s=new Circle();
        return s;
    }

}
public class InterfaceDemo1
{
    public static void main(String[] args)
    {
        Shape s1=Demo.getShape(1);
        Shape s2 =Demo.getShape(2);
        s1.draw();//calling the draw method of the rectangle class
        s2.draw();//calling the draw method of the circle class
    }
    
}

package GroupProject;

public interface Shape {
    /*
   Task1:
Create an Interface ‘Shape’ with undefined methods
as calculateArea and calculatePerimeter. Create 2
classes Circle & Square that implements functionality
defined in the Shape Interface. Test your code.
    */
    void calculateArea();
    void calculatePerimeter();
    class Circle implements Shape{
        @Override
        public void calculateArea() {
            System.out.println("");
        }
        public void calculatePerimeter() {
            System.out.println("");
        }
    }
    class Square implements Shape{
        @Override
        public void calculatePerimeter() {
            System.out.println("");
        }
        public void calculateArea() {
            System.out.println("");
        }
    }
}
import java.util.*;
import java.io.*;

class AreaCalculator{
    public static void printArea(Shape shape) {
        System.out.println("Hey I am printing area");
        System.out.println(shape.area());
    }
    public static void printPerimeter(Rectangle rect) throws Exception{
      FileReader reader=new FileReader("message.properties");
      Properties p=new Properties();
      p.load(reader);
      System.out.println(p.getProperty("message"));
      System.out.println(rect.perimeter());
    }
    public static void main(String argv[]) throws Exception{
        printArea(new Rectangle(2,3));
        printArea(new Square(3));
        printPerimeter(new Rectangle(2,3));
    }
}

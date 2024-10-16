class Shape{
void draw()
{System.out.println("Drawing Shape");}
void erase()
{System.out.println("erasing Shape");}
}
class circle extends Shape{
void draw()
{System.out.println("Drawing circle");}
void erase()
{System.out.println("erasing circle");}
}
class Triangle extends Shape{
void draw()
{System.out.println("Drawing Triangle");}
void erase()
{System.out.println("erasing Triangle");}
}
class Square extends Shape{
void draw()
{System.out.println("Drawing Square");}
void erase()
{System.out.println("erasing Square");}
}
public class Method{
public static void main(String[]args){
Shape c= new circle();
Shape t= new Triangle();
Shape s= new Square();
c.draw();
c.erase();
t.draw();
t.erase();
s.draw();
s.erase();

}
}
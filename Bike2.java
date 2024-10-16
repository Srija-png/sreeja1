class Vehicle{
void run(){
System.out.println("Vehicle is running");
}
}
class Bike2 extends Vehicle{
void run(){
System.out.println("Bike is running safely");
}
public static void main(String[]args){
Bike2 B = new Bike2();
B.run();
}
}
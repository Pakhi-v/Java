//Program Test for inheritance.
class Mother{
    int x=4;
    void show(){
    System.out.println("The value of x = "+x);}}
    class Child extends Mother{ }
    public class Main{
    public static void main (String[] args) {
    Mother m = new Mother();
    m.show();
    Child ch = new Child();
    ch.show();}}

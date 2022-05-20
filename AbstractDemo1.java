import java.lang.*;

abstract class Demo
{
    public int i,j;

    public Demo()
    {
        System.out.println("Demo constructor");
    }
    public void fun()  //Concrete
    {
        System.out.println("Demo fun");
    }
    public abstract void gun(); //Abstract  //vaitual void gun()=0;
}

class Hello extends Demo
{
    public int x,y;
    public Hello()
    {
        System.out.println("Hello constuctor");
    }
    public void sun()  //concrete
    {
        System.out.println("Hello sun");
    }
    public void gun()  //concrete
    {
        System.out.println("Hello gun");
    }
}


class AbstractDemo1
{
    public static void main(String a[])
    { 
       Hello hobj=new Hello();
       hobj.fun();
       hobj.gun();
       hobj.sun();

    }
}
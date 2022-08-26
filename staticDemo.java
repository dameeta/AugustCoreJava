package tstJava;

public class staticDemo {
    int x;
    static int y;
    public staticDemo()
    {
        x++;
        System.out.println("value of nonstatic x is" + x);
        y++;
        System.out.println("value of static y is" + y);

    }


    public static void main(String[] args) {
staticDemo dmobj1=new staticDemo();
staticDemo dmobj2=new staticDemo();
//staticDemo dmobj3=new staticDemo();
//staticDemo dmobj4=new staticDemo();
System.out.println(dmobj1.x);
System.out.println(dmobj1.y);

    }
}
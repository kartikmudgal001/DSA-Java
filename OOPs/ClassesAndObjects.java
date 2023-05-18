package OOPs;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // we have created a Object -- p1 in Heap
        p1.setColour("Yellow");
        System.out.println(p1.colour);
        p1.setTip(5);
        System.out.println(p1.tip);
        // p1.setColour("Green");
        p1.colour = "Green";
        System.out.println(p1.colour);
    }
    
}
class Pen{
    //attributes
    String colour;
    int tip;

    //functions
    void setColour(String newColour){
        colour = newColour;
    }
    void setTip(int newTip){
        tip = newTip;
    }

}
class Student{
    String name;
    int age;
    float percentage;

    void calculatePercentage(int phy, int chem, int maths){
        percentage = (phy+chem+maths)/3;
    }

}

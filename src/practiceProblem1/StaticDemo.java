package practiceProblem1;

//Write a program to demonstrate static variables, methods, and blocks.
public class StaticDemo {
    
    static String name ;
    static int marks = 0;

    static {
        marks = 90;
    }
    static void display(){
        System.out.println("Name : "+name+" , Marks : "+marks);
    }
    public static void main(String[] args) {
        display();
        StaticDemo.name = "Prabhakaran";
        display();
    }
}

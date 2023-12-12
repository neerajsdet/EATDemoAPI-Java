package week5.session2;

public class Child extends AccessModifier {



    public static void main(String...s){
        Child child = new Child();

        child.method();

    }

    public void childMethod1(){
        System.out.println("I'm in method 1 of child");
    }

    public void childMethod2(){
        System.out.println("I'm in method 2 of child");
    }

    public void method(){
        defaultMethod();
        publicMethod();
        protectedMethod();
    }

    public void newMethod(){
        defaultMethod();
        publicMethod();
        protectedMethod();
    }



}

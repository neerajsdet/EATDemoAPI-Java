package week5.session2;

public class AccessModifier {



    void defaultMethod(){
        System.out.println("I'm in method 1 of parent");
    }

    public void publicMethod(){
        System.out.println("I'm in method 2 of parent");
    }

    private void privateMethod(){
        System.out.println("I'm in method 3 of parent");
    }

    protected void protectedMethod(){
        System.out.println("I'm in method 4 of parent");
    }
}

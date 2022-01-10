package playground;

public class Parent {


    public Parent() {
        System.out.println("i am parent constructor");
    }

    {
        System.out.println("I am parent init block");
    }

    static {
        System.out.println("I am parent static init block");
    }

    class NestedParent {
        public int a = 3;
    }

    public int a = 1;
}

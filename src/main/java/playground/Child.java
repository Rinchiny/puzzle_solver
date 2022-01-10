package playground;

import java.util.HashSet;

public class Child extends Parent {

    public Child() {
        super();
        System.out.println("i am child constructor");
    }

    {
        System.out.println("I am child init block");
    }

    static {
        System.out.println("I am child static init block");
    }

    public int a = 2;
}

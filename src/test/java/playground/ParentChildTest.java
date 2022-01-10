package playground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParentChildTest {

    @Test
    void testVariableShadowing() {
        Parent parent = new Parent();
        Child child = new Child();
        Parent parentChild = new Child();
        Assertions.assertEquals(1, parent.a);
        Assertions.assertEquals(2, child.a);
        Assertions.assertEquals(1, parentChild.a);
    }

    @Test
    void testConstructorPrecedence() {
        //view stdout
        new Child();
    }

    @Test
    void testNestedClasses() {
        Parent parent = new Parent();
        Parent.NestedParent nestedParent = parent.new NestedParent();
    }
}

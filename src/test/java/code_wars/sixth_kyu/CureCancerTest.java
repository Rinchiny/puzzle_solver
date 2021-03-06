package code_wars.sixth_kyu;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CureCancerTest {

    @Test
    public void testSomething1() {
        char[][] body =  {
                "thisIsAsmallerPerson".toCharArray(),
                "thisIsAsmallerPerson".toCharArray(),
                "thisIsAsmallerPerson".toCharArray(),
                "thisssAsmallerPerson".toCharArray()
        };
        int[] answer = CureCancer.mutationLocation(body);
        assertEquals(Arrays.toString(new int[]{3,4}), Arrays.toString(answer));
    }

    @Test
    public void testSomething2() {
        char[][] body =  {
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuff1thinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray(),
                "someGreaTstuffIthinkThisIs".toCharArray()
        };
        int[] answer = CureCancer.mutationLocation(body);
        assertEquals(Arrays.toString(new int[]{9,14}), Arrays.toString(answer));
    }
}

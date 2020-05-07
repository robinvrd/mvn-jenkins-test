/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import fr.robinverdier.maven.project.TestClass;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Robin
 */
public class TestClassTest {

    @Test
    public final void testSum() {
        TestClass tc = new TestClass();
        if (tc.sum(1,2) != 3) {
            fail("sum is not working");
        }
    }
}

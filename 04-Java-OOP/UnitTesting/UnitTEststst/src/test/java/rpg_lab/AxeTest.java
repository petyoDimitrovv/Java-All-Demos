package rpg_lab;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static rpg_lab.Axe.DURABILITY_LOSS;

public class AxeTest {

    @Test
    public void testDurabilityLossAfterAttackShouldLooseExactOnePoint(){
        int initialDurability = 1;
        //AAA Pattern

        // A -> Arrange (Prepare)

        Axe axe = new Axe(0, initialDurability);
        Dummy dummy = new Dummy(100, 100);

        //a -> Act

        axe.attack(dummy);

        // A -> Assertion
        int expectedPoints = initialDurability - DURABILITY_LOSS;
        int actualPoint = axe.getDurabilityPoints();

        assertTrue(expectedPoints == actualPoint);
    }
    @Test (expected = IllegalStateException.class)
    public void testAttackWithBrokenAxeShouldThrowEx(){
        Axe axe = new Axe(10, 0);
        Dummy dummy = new Dummy(100, 100);
        axe.attack(dummy);

    }

}

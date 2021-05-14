package rpg_lab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyTest {

    private static final int INIT_HEALTH = 10;
    private static final int INIT_XP = 10;

    private Dummy dummy ;
    @Before
    private void setUp(){
        this.dummy = new Dummy(INIT_HEALTH, INIT_XP);
    }

    @Test
    public void testIsDummyLoseHealthAfterItTakesAttack() {

        dummy.takeAttack(5);
        int expectedHealthPoint = 5;
        assertEquals( 5, dummy.getHealth());

    }
    @Test (expected = IllegalStateException.class)
    public void testIsDeadDummyThrowsIfAttacked() {

         new Dummy(0, 10);

        dummy.takeAttack(11);

    }
    @Test (expected = IllegalStateException.class)
    public void testIsDeadDummyThrowsIfAttackedWithHealthBelowZero() {
        new Dummy(-1, 10).takeAttack(10);


    }
    @Test
    public void testIsDeadDummyCanGiveXp(){
        int expect = 10;
        int actual = new Dummy(0, 10).giveExperience();
        assertEquals(expect, actual);

    }
    @Test (expected = IllegalStateException.class)
    public void testAliveDummyCantGiveXp(){
        new Dummy(10, 10).giveExperience();
    }
}
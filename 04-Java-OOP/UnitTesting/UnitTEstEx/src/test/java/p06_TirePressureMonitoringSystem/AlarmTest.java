package p06_TirePressureMonitoringSystem;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AlarmTest {

    private static Sensor sensor = Mockito.mock(Sensor.class);


    @Test
    public void Test_ChekWithLowerPressureValue(){
        Mockito.when(sensor.popNextPressurePsiValue())
                .thenReturn(15.0);

        Alarm alarm = new Alarm(sensor);

        alarm.check();

        assertTrue(alarm.getAlarmOn());
    }@Test
    public void Test_ChekWithHigherPressureValue(){
        Sensor sensor =  Mockito.mock(Sensor.class);

        Mockito.when(sensor.popNextPressurePsiValue())
                .thenReturn(27.0);

        Alarm alarm = new Alarm(sensor);

        alarm.check();

        assertTrue(alarm.getAlarmOn());
    }
    @Test
    public void Test_ChekWithNormalPressureValue(){
        Sensor sensor =  Mockito.mock(Sensor.class);

        Mockito.when(sensor.popNextPressurePsiValue())
                .thenReturn(18.0);

        Alarm alarm = new Alarm(sensor);

        alarm.check();

        assertFalse(alarm.getAlarmOn());
    }

}
package Military.interfaces;

import Military.implementation.Mission;

import java.util.Collection;

public interface Comando {


    void addMission(Mission mission);

    Collection<Mission> getMissions();

}

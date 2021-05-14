package Military.implementation;

import Military.enums.Corp;
import Military.interfaces.Comando;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ComandoImpl extends SpecialisedSoldierImpl implements Comando {
    private Set<Mission> missions;

    public ComandoImpl(int id, String firstName, String lastName, double salary, Corp corp) {
        super(id, firstName, lastName, salary, corp);
        this.missions = new LinkedHashSet<>();
    }



    @Override
    public void addMission(Mission mission) {
        this.missions.add(mission);

    }

    @Override
    public Collection<Mission> getMissions() {
        return this.missions;
    }
}

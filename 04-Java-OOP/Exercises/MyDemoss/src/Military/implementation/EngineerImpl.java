package Military.implementation;

import Military.enums.Corp;
import Military.interfaces.Engineer;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    private Set<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, Corp corp) {
        super(id, firstName, lastName, salary, corp);
        this.repairs = new LinkedHashSet<>();
    }

    @Override
    public Corp getCorp() {
        return super.getCorp();
    }

    @Override
    public void addRepair(Repair repair) {
        this.repairs.add(repair);

    }

    @Override
    public Collection<Repair> getRepairs() {
        return this.repairs;
    }
}

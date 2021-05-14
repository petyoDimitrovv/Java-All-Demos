package Military.interfaces;

import Military.implementation.Repair;

import java.util.Collection;

public interface Engineer {
 void addRepair(Repair repair);
 Collection<Repair> getRepairs();
}

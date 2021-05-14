package militaryElite;

public abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    private Corp corp;


    public SpecialisedSoldierImpl(int id, String firstName,
                                  String lastName, double salary,Corp corp ) {
        super(id, firstName, lastName, salary);
        this.corp = corp;

    }

}

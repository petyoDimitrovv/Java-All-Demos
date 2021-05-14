package Military.implementation;

import Military.interfaces.Spy;

public class SpyImpl  extends SoldierImpl implements Spy {

    private String  codeNumber;

    public SpyImpl(int id, String firstName, String lastName,String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String  getCodeNumber() {
        return this.codeNumber;
    }
}

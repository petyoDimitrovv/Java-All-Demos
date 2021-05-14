package Military.implementation;

import Military.interfaces.LieutenantGeneral;
import Military.interfaces.Private;

import java.util.ArrayList;
import java.util.List;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {

    private List<Private> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new ArrayList<>();
    }


    @Override
    public void addPrivate(Private priv) {
        this.privates.add(priv);

    }

    @Override
    public List<Private> getPrivate() {
        return privates;
    }
}

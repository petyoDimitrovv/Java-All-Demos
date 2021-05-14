import enities.gringotts.WizardDeposit;

import javax.persistence.EntityManager;
import java.nio.file.Watchable;

public class Engine implements Runnable{
    private final EntityManager entityManager;

    public Engine(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void run() {
        WizardDeposit wd = new WizardDeposit();

        wd.setLastName("Pesho");
        wd.setAge(10);

        this.entityManager.getTransaction().begin();
        this.entityManager.persist(wd);
        this.entityManager.getTransaction().commit();
    }
}

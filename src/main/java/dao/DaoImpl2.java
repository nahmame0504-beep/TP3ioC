package dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * DaoImpl2 — simule la base de développement.
 * Actif uniquement sous le profil "dev".
 */
@Component("daoDev")
@Profile("dev")
public class DaoImpl2 implements IDao {

    @Override
    public double getValue() {
        System.out.println("[DAO] Lecture depuis la base de données (dev)");
        return 150.0;
    }
}

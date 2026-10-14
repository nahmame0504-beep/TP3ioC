package dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * DaoImpl — simule la base par défaut / fallback.
 * Actif uniquement sous le profil "default-dao".
 */
@Component("dao")
@Profile("default-dao")
public class DaoImpl implements IDao {

    @Override
    public double getValue() {
        System.out.println("[DAO] Lecture depuis la base de données (prod)");
        return 100.0;
    }
}

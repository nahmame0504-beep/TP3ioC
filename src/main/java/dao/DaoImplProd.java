package dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * DaoImplProd — actif uniquement sous le profil "prod".
 */
@Component("daoProd")
@Profile("prod")
public class DaoImplProd implements IDao {

    @Override
    public double getValue() {
        System.out.println("[DAO] Lecture depuis la base de données PROD (profil prod)");
        return 100.0;
    }
}

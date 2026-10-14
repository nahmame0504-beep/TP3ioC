package dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("daoFile")
@Profile("file")
public class DaoFile implements IDao {
    @Override
    public double getValue() {
        System.out.println("[DAO] Lecture depuis un fichier local");
        return 180.0;
    }
}

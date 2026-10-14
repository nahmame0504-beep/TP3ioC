package config;

import dao.DaoApi;
import dao.DaoFile;
import dao.DaoImpl;
import dao.DaoImpl2;
import dao.IDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Stratégie C — désactivée pour laisser la priorité au profil actif.
 */
@Configuration
public class DynamicDaoConfig {

    @Value("${dao.target:dao}")
    private String daoTarget;

    @Bean
    public IDao dynamicDao() {
        return switch (daoTarget) {
            case "dao"     -> new DaoImpl();
            case "dao2"    -> new DaoImpl2();
            case "daoFile" -> new DaoFile();
            case "daoApi"  -> new DaoApi();
            default        -> throw new IllegalArgumentException("Cible DAO inconnue: " + daoTarget);
        };
    }
}

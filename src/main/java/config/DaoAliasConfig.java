package config;

import dao.DaoApi;
import dao.IDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Stratégie B — Alias via @Bean (désactivée pour la Stratégie C)
 */
@Configuration
public class DaoAliasConfig {

    @Bean
    public IDao daoAlias() {
        return new DaoApi();
    }
}

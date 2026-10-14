package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * AppConfig — configuration principale pour la gestion par Profils.
 */
@Configuration
@ComponentScan(basePackages = {"dao", "metier"})
public class AppConfig {
}

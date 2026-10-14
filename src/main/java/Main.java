import config.AppConfig;
import metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main — Stratégie des Profils Spring (@Profile).
 *
 * Le conteneur Spring charge uniquement les composants associés au profil actif.
 */
public class Main {

    public static void main(String[] args) {
        // 1. Instanciation du contexte Spring sans le démarrer tout de suite
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();

        // 2. Définition du profil actif (ex: "prod", "dev", "file", "api")
        context.getEnvironment().setActiveProfiles("prod");

        // 3. Enregistrement de la configuration et démarrage du conteneur
        context.register(AppConfig.class);
        context.refresh();

        // 4. Récupération et exécution
        IMetier metier = context.getBean(IMetier.class);
        double resultat = metier.calcul();
        System.out.println("Résultat final : " + resultat);

        context.close();
    }
}

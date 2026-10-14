import config.AppConfig;
import metier.IMetier;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Test de non-régression OCP.
 *
 * Vérifie que MetierImpl retourne le bon résultat selon la configuration
 * active, SANS avoir été modifié.
 *
 * Prérequis : dao.target=dao dans app.properties (@Primary sur DaoImpl)
 * → résultat attendu : 200.0
 */
public class OcpSelectionTest {

    @Test
    public void testDaoImplParDefaut() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        IMetier metier = context.getBean(IMetier.class);

        // DaoImpl retourne 100.0 → calcul() retourne 100.0 * 2 = 200.0
        assertEquals(200.0, metier.calcul(), 0.001);

        context.close();
    }
}

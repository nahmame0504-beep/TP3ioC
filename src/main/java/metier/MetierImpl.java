package metier;

import dao.IDao;
import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * MetierImpl — couche métier principale.
 *
 * RÈGLE OCP : Cette classe ne doit JAMAIS être modifiée pour changer
 * de source de données. La dépendance IDao est injectée par Spring.
 *
 * @PostConstruct : affiche une trace pour confirmer quelle implémentation
 * IDao a été injectée (utile pour le débogage).
 */
@Service
@Primary
public class MetierImpl implements IMetier {

    private final IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @PostConstruct
    public void init() {
        System.out.println("[TRACE] Implémentation DAO injectée : "
                + dao.getClass().getSimpleName());
    }

    @Override
    public double calcul() {
        double valeur = dao.getValue();
        return valeur * 2.0;
    }
}

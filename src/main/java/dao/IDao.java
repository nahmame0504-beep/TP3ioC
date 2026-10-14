package dao;

/**
 * Interface IDao — abstraction fondamentale (contrat).
 * Toute source de données doit implémenter cette interface.
 */
public interface IDao {
    /**
     * Récupère une valeur numérique depuis la source de données.
     * @return la valeur récupérée
     */
    double getValue();
}

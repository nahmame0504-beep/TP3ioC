package metier;

/**
 * Interface IMetier — contrat de la couche métier.
 */
public interface IMetier {
    /**
     * Effectue un calcul en utilisant la source de données injectée.
     * @return le résultat du calcul
     */
    double calcul();
}

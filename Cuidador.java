package zoo;

import java.util.ArrayDeque;
import java.util.HashMap;

public class Cuidador {

    /**
     * Codi del cuidador autogenerat.
     *
     */
    private int codi;
    /**
     * Contador per acumular codis.
     */
    private static int contador = 1;

    /**
     * Nom del cuidador.
     *
     */
    private String nom;
    /**
     * Llista de les esp?cies del cuidador.
     *
     */
    private HashMap<String, Especie> llistatEspecie;
    /**
     * Coa tasques cuidador.
     *
     */
    private ArrayDeque<Tasca> tascaCuidador;

    /**
     * Constructor de Cuidador.
     *
     * @param nom String
     */
    public Cuidador(String nom) {
        this.nom = nom;
        llistatEspecie = new HashMap<>();
        tascaCuidador = new ArrayDeque<>();
        setCodi(contador);
        contador++;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    /**
     * Metode per recollir el nom del cuidador.
     *
     * @return String
     */
    public String getNom() {
        return nom;
    }

    /**
     * Metode per recollir el codi del cuidador.
     *
     * @return int
     */
    public int getCodi() {
        return codi;
    }

    /**
     * Per obtenir la llista de tasques de cada cuidador.
     *
     * @return ArrayDeque
     */
    public ArrayDeque getLlistatTasca() {
        return tascaCuidador;
    }
    

    /**
     * Retorna la llista d'esp?cies en un mapa.
     *
     * @return HashMap
     */
    public HashMap<String, Especie> getLlistaEspecie() {
        return llistatEspecie;
    }

    /**
     * Afegir una esp?cie a la llista d'esp?cies del cuidador
     *
     * @param e Especie
     *
     */
    public void afegirEspecie(Especie e) {
        
        llistatEspecie.put(e.getNom(), e);

    }

    /**
     * Elimina una esp?cie.
     *
     * @param nom String
     * 
     */
    public void borrarEspecie(String nom) {
            llistatEspecie.remove(nom);
        
    }

    /**
     * Afegir tasca al cuidador.
     *
     * @param t Tasca
     */
    public void afegirTasca(Tasca t) {
        tascaCuidador.add(t);
    }

    /**
     * Torna la tasca.
     *
     * @return Tasca
     */
    public ArrayDeque getTasca() {
        return tascaCuidador;
    }
    
    /**
     * Torna un String amb el codi i el nom.
     *
     * @return String
     */
    @Override
    public String toString() {
        return "codi= " + codi + " nom= " + nom + "\n";
    }
}

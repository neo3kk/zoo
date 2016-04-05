package zoo;

import java.util.HashMap;

public class Animal {

    /**
     * codiAnimal ?s el codi identificatiu per a cada un dels animals, ens
     * serveix per diferenciar els animals d'una mateixa esp?cie i d'altres
     * esp?cies tambe.
     */
    private int codiAnimal;
    /**
     * Contador per acumular codis d'animal
     */
    private static int contador = 1;
    /**
     * ?s el nom que t? cada un dels animals. No confondre amb el nom de
     * l'esp?cie. ?s opcional.
     */
    private String nom;
    /**
     * ?s una llista d'aliments que cont? els objectes Aliment i un
     * String(identificador) amb el nom de cada aliment.
     */
    private HashMap<String, Aliment> llistaAliment;

    /**
     * Constructor sense par?metres.
     *
     */
    public Animal() {
        llistaAliment = new HashMap<>();
        setCodiAnimal(contador);
        contador++;
    }
     public Animal(String nom) {
        llistaAliment = new HashMap<>();
        this.nom=nom;
        setCodiAnimal(contador);
        contador++;
    }

    /**
     * Per posar el codi del contador com a codi animal
     *
     * @param codiAnimal
     */
    public void setCodiAnimal(int codiAnimal) {
        this.codiAnimal = codiAnimal;
    }

    /**
     * Permet afegir aliments a la llista.
     *
     * @param a
     *
     */
    public void afegirAliment(Aliment a) {
        llistaAliment.put(getNom(), a);
    }
    public void eliminarAliment(String nom){
        llistaAliment.remove(nom);
    }

    /**
     * Torna el nom d'un animal.
     *
     * @return String
     */
    public String getNom() {
        return nom;
    }

    /**
     * Permet assignar el nom a un animal.
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Torna el codi d'un animal concret.
     *
     * @return int
     */
    public int getCodiAnimal() {
        return codiAnimal;
    }

    /**
     * Torna la llista d'aliments d'un animal concret.
     *
     * @return HashMap
     */
    public HashMap<String, Aliment> getLlistaAliment() {
        return llistaAliment;
    }

    @Override
    public String toString() {
        return "codiAnimal=" + codiAnimal + ", nom=" + nom+ "\n";
    }

    

}

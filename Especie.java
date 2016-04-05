package zoo;

import java.util.HashMap;

public class Especie {

    private String nom;
    private String nomCientific;
    private String descripcio;
    private HashMap<Integer, Animal> llistatAnimal;
    private HashMap<Integer, Espai> llistatEspai;
    private HashMap<String, Aliment> llistatAliments;

    /**
     * Constructor per crear una inst?ncia de la classe Especie.
     *
     * @param nom String
     * @param nomCientific String
     * @param descripcio String
     */
    public Especie(String nom, String nomCientific, String descripcio) {

        this.nom = nom;
        this.nomCientific = nomCientific;
        this.descripcio = descripcio;
        llistatAnimal = new HashMap<>();
        llistatEspai = new HashMap<>();
        llistatAliments = new HashMap<>();
    }

    /**
     * getNom ens permet recollir el nom de l'Especie
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     * getNomCientific ens permet recollir el nom cientific.
     *
     * @return
     */
    public String getNomCientific() {
        return nomCientific;
    }

    /**
     * getDescripcio ens permet recollir la descripci?
     *
     * @return
     */
    public String getDescripcio() {
        return descripcio;
    }

    /**
     * Metode per afegir animal dins el llistatAnimal
     *
     * @param animal
     */
    public void afegirAnimal(Animal animal) {
        llistatAnimal.put(animal.getCodiAnimal(), animal);
    }

    public void getAnimal(int i) {
        llistatAnimal.get(i);
    }

    public void eliminarAnimal(int codiAnimal) {
        llistatAnimal.remove(codiAnimal);
    }

    public HashMap getLlistaAnimal() {
        return llistatAnimal;
    }

    public void getEspai(int e) {
        llistatEspai.get(e);
    }

    public void afegirEspai(Espai espai) {
        llistatEspai.put(espai.getId(), espai);

    }

    /**
     *
     * @return HashMap
     */
    public HashMap getLlistaEspai() {
        return llistatEspai;
    }

    public void afegirAliment(Aliment a) {
        llistatAliments.put(a.getNom(), a);
        
    }
    public void eliminarAliment(String nom){
        llistatAliments.remove(nom);
    }
    
    
    public HashMap<String, Aliment> getLlistatAliments() {
        return llistatAliments;
    }

    @Override
    public String toString() {
        return "nom=" + nom + ", nomCientific=" + nomCientific + ", descripcio=" + descripcio + '\n';
    }

}

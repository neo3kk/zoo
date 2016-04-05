package zoo;

public class Aliment {

    /**
     * Atributs que necesiten la classe Aliment. nom String el nom que rep un
     * aliment. recepta String indicar ingredients i pasos per poder realitzar
     * l' aliment.
     *
     */
    private String nom;
    private String recepta;

    /**
     * Constructor per crear una inst?ncia de la classe Aliment.
     *
     * @param nom String
     * @param recepta String
     */
    public Aliment(String nom, String recepta) {
        this.nom = nom;
        this.recepta = recepta;
    }

    /**
     * Ens permet recollir el nom del aliment
     *
     * @return String
     */
    public String getNom() {
        return nom;
    }

    /**
     * Ens permet recollir la recepta.
     *
     * @return String
     */
    public String getRecepta() {
        return recepta;
    }

    /**
     * Per poder mostrar el nom i la recepta.
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Aliment [nom=" + nom + ", recepta=" + recepta + "]";
    }

}

package zoo;

public class Tasca {

    /**
     * Constructor per crear una inst?ncia de la classe Tasca per definir una
     * tasca que s'ha de fer
     *
     * @param descripcio String
     */
    public Tasca(String descripcio) {

        this.descripcio = descripcio;
    }

    /**
     * Atributs descripci? per definir una tasca observaci? no ?s una dada
     * obligat?ria, si s'ha de afegir qualque informaci? addicional.
     *
     */
    private String descripcio;
    private String observacio;

    /**
     * Ens permet afegir una descripcio d'una tasca ja que era opcional.
     *
     * @param descripcio String
     */
    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    /**
     * Per poder mostrar un llistat de les tasques i observacions.
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Tasca [descripcio=" + descripcio + ", observacio=" + observacio + "]";
    }

}

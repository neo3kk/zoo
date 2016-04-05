package zoo;

public class Espai {
    /**
     * Identificador de cada espai, independentment del tipus que sigui.
     */
    private int id;
    
    private static int contador=1;
    
    /**
     * Tipus d'espai.
     *
     */    
    private EnumeracioEspai tipus;
    
    /**
     * Constructor d'Espai amb l'enumeraci? d'espais com a par?metre. Cont? un
     * id amb increment cada vegada que es crea un nou espai.
     *
     * @param tipus
     */
    public Espai(EnumeracioEspai tipus) {

        this.tipus = tipus;
        setId(contador);
        contador++;
    }
    
    /**Afegeix el contador a id;
     * 
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**Recull el tipus d'espai
     * 
     * @return 
     * EnumeracioEspai
     */
    public EnumeracioEspai getTipus(){
        return tipus;
    }

    /**
     * Retorna l'identificador d'un espai concret.
     *
     * @return int
     */
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id=" + id + ", tipus=" + tipus + '\n';
    }

    

}

package zoo;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map.Entry;

public class Zoo {

    private String nomZoo;
    private String direccioZoo;

    private HashMap<Integer, Espai> llistatGeneralEspais;
    private HashMap<String, Cuidador> llistatCuidadors;
    private HashMap<String, Especie> llistatGeneralEspecies;
    private HashMap<Integer, Animal> llistatGeneralAnimals;
    private HashMap<String, Aliment> llistatGeneralAliments;

    public Zoo(String nomZoo, String direccioZoo) {
        this.nomZoo = nomZoo;
        this.direccioZoo = direccioZoo;
        llistatCuidadors = new HashMap<>();
        llistatGeneralEspecies = new HashMap<>();
        llistatGeneralAnimals = new HashMap<>();
        llistatGeneralEspais = new HashMap<>();
        llistatGeneralAliments = new HashMap<>();
    }

    // ------------- Creacio dels objectes del zoo i afegir a llistats --------------
    /**
     * Metode per crear els objectes del zoo
     *
     */
    public void inicialitzarZoo() {
        // Cuidadors
        Cuidador cuidador1 = new Cuidador("Pere Tomeu");
        Cuidador cuidador2 = new Cuidador("Anna Perello");
        Cuidador cuidador3 = new Cuidador("Josep Torello");
        Cuidador cuidador4 = new Cuidador("Margalida Vives");

// Afegir cuidadors
        afegirCuidador(cuidador1);
        afegirCuidador(cuidador2);
        afegirCuidador(cuidador3);
        afegirCuidador(cuidador4);

        // Especies
        Especie especie1 = new Especie("Lle?", "Panthera leo", "?s el m?s gran dels felins");
        Especie especie2 = new Especie("Tortuga", "Testudines", "Reptil amb tronc protegit per una closca");
        Especie especie3 = new Especie("Aguila", "Geranoaetus melanoleucus", "Au rapa? depredadora de gran tamany");
        Especie especie4 = new Especie("Dof?", "Delphinidae", "?s un mam?fer de gran intel?lig?ncia");

        // Afegir Especies
        afegirEspecie(especie1, cuidador1);
        afegirEspecie(especie2, cuidador2);
        afegirEspecie(especie3, cuidador3);
        afegirEspecie(especie4, cuidador4);

        // Tasques
        Tasca tasca1 = new Tasca("Netejar g?bies dels Voladors");
        Tasca tasca2 = new Tasca("Regar plantes del Tancat");
        Tasca tasca3 = new Tasca("Alimentar els peixos tropicals");
        Tasca tasca4 = new Tasca("Tallar les plantes salvatjes");

        //Afegir Tasques
        cuidador1.afegirTasca(tasca1);
        cuidador1.afegirTasca(tasca2);
        cuidador1.afegirTasca(tasca4);
        cuidador2.afegirTasca(tasca4);
        cuidador2.afegirTasca(tasca1);
        cuidador3.afegirTasca(tasca2);
        cuidador4.afegirTasca(tasca3);
        cuidador4.afegirTasca(tasca4);

        // Espais del zoo
        Espai espai1 = new Espai(EnumeracioEspai.PISCINA);
        Espai espai2 = new Espai(EnumeracioEspai.TANCAT);
        Espai espai3 = new Espai(EnumeracioEspai.ACUARI);
        Espai espai4 = new Espai(EnumeracioEspai.VOLADOR);
        Espai espai5 = new Espai(EnumeracioEspai.PISCINA);
        Espai espai6 = new Espai(EnumeracioEspai.TANCAT);
        Espai espai7 = new Espai(EnumeracioEspai.ACUARI);
        Espai espai8 = new Espai(EnumeracioEspai.VOLADOR);

        //afegir Espais
        afegirEspai(espai1, especie1);
        afegirEspai(espai2, especie1);
        afegirEspai(espai3, especie2);
        afegirEspai(espai4, especie4);
        afegirEspai(espai5, especie3);
        afegirEspai(espai6, especie2);
        afegirEspai(espai7, especie1);
        afegirEspai(espai8, especie2);

        // Animals
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Lolo");
        Animal animal3 = new Animal();
        Animal animal4 = new Animal();
        Animal animal5 = new Animal("Miquel");
        Animal animal6 = new Animal();
        Animal animal7 = new Animal("John");
        Animal animal8 = new Animal();
        Animal animal9 = new Animal();
        Animal animal10 = new Animal();

        //AfegirAnimal
        afegirAnimal(animal1, especie1);
        afegirAnimal(animal2, especie2);
        afegirAnimal(animal3, especie3);
        afegirAnimal(animal4, especie2);
        afegirAnimal(animal5, especie2);
        afegirAnimal(animal6, especie3);
        afegirAnimal(animal7, especie1);
        afegirAnimal(animal8, especie4);
        afegirAnimal(animal9, especie2);
        afegirAnimal(animal10, especie3);

        // Aliments
        Aliment aliment1 = new Aliment("carn", "200 grams de carn de porc i 300 grams de vaca.");
        Aliment aliment2 = new Aliment("peix", "20 caps de peix roquer, mig quilo de peix blau.");
        Aliment aliment3 = new Aliment("vegetals", "20 quilos de fulles d'eucaliptus i fruites com pomes o platans)");
        Aliment aliment4 = new Aliment("Pienso", "Triturat d'algues amb restes d'espines de peix");

        //Afegir Aliments
        afegirAliment(aliment1, especie1, animal1);
        afegirAliment(aliment2, especie2, animal2);
        afegirAliment(aliment3, especie2, animal4);
        afegirAliment(aliment4, especie1, animal3);
        afegirAliment(aliment1, especie4, animal8);
        afegirAliment(aliment2, especie3, animal9);
        afegirAliment(aliment1, especie1, animal5);
        afegirAliment(aliment2, especie3, animal6);
        afegirAliment(aliment1, especie3, animal7);
        afegirAliment(aliment1, especie3, animal10);

    }

    // -------------- Metodes de la clase Zoo -------------
    /**
     * Eliminar un cuidador
     *
     * @param nom String
     */
    public void eliminarCuidador(String nom) {
        llistatCuidadors.remove(nom);
    }

    /**
     *
     * @param c Cuidador
     */
    public void afegirCuidador(Cuidador c) {
        llistatCuidadors.put(c.getNom(), c);
    }

    /**
     * Afegir especie al llistat general del zoo.
     *
     * @param e Especie
     */
    public void afegirEspecie(Especie e) {
        llistatGeneralEspecies.put(e.getNom(), e);

    }

    /**
     * Afegeix especia al llistat general i a un cuidador.
     *
     * @param e Especie
     * @param c Cuidador
     */
    public void afegirEspecie(Especie e, Cuidador c) {
        llistatGeneralEspecies.put(e.getNom(), e);
        c.afegirEspecie(e);

    }

    /**
     * Per afegir un animal al zoo i a la especie
     *
     * @param a Animal
     * @param e Especie
     */
    public void afegirAnimal(Animal a, Especie e) {
        llistatGeneralAnimals.put(a.getCodiAnimal(), a);
        e.getLlistaAnimal().put(a.getCodiAnimal(), e);
    }

    /**
     * Eliminar un animal del zoo i de l'especie.
     *
     * @param id Int
     */
    public void borrarAnimal(int id) {
        Animal borrar = llistatGeneralAnimals.get(id);
        borrar.getCodiAnimal();
        llistatGeneralAnimals.remove(borrar.getCodiAnimal());
        Especie cercat = cercarEspecieAnimal(borrar);
        cercat.eliminarAnimal(id);
    }

    /**
     * Cerca un animal per saber la seva especie i poderlo borrar
     *
     * @param a Animal
     * @return Especie
     */
    public Especie cercarEspecieAnimal(Animal a) {
        for (Entry<String, Cuidador> b : llistatCuidadors.entrySet()) {
            Cuidador c = b.getValue();
            HashMap<String, Especie> llista = c.getLlistaEspecie();
            for (Entry<String, Especie> d : llista.entrySet()) {
                Especie es = d.getValue();
                HashMap<String, Animal> animals = es.getLlistaAnimal();
                if (animals.containsKey(a.getCodiAnimal())) {

                    return es;
                }

            }
        }
        return null;
    }

    /**
     * Afegir aliment al zoo
     *
     * @param a Aliment
     */
    public void afegirAliment(Aliment a) {
        llistatGeneralAliments.put(a.getNom(), a);

    }

    /**
     * Sobre-escriu afegirAliment per afegir aliment a especie.
     *
     * @param a Aliment
     * @param e Especie
     */
    public void afegirAliment(Aliment a, Especie e) {
        llistatGeneralAliments.put(a.getNom(), a);
        e.afegirAliment(a);
    }

    /**
     * Per afegir un aliment a un animal, a la especie i al zoo
     *
     * @param a Aliment
     * @param e Especie
     * @param an Animal
     */
    public void afegirAliment(Aliment a, Especie e, Animal an) {
        llistatGeneralAliments.put(a.getNom(), a);
        e.afegirAliment(a);
        an.afegirAliment(a);
    }

    /**
     * Eliminar aliment del zoo de especie i de animal.
     *
     * @param nom
     */
    public void borrarAliment(Aliment al) {
        String nom = al.getNom();
        llistatGeneralAliments.remove(nom);
        Animal a = cercarAnimalAliment(al);
        a.eliminarAliment(nom);
        Especie e = cercarEspecieAnimal(a);
        e.eliminarAliment(nom);
    }

    /**
     * Cerca quins animals menjen un aliment per poderlo borrar
     *
     * @param ali Aliment
     * @return Torna un animal
     *
     */
    public Animal cercarAnimalAliment(Aliment ali) {
        for (Entry<Integer, Animal> b : llistatGeneralAnimals.entrySet()) {
            Animal a = b.getValue();
            HashMap<String, Aliment> alim = a.getLlistaAliment();
            for (Entry<String, Aliment> c : alim.entrySet()) {
                Aliment alime = c.getValue();
                if (alime.getNom().equals(ali.getNom())) {
                    return a;
                }
            }
        }
        return null;

    }

    /**
     * Per afegir espai al llistat d'espais del zoo
     *
     * @param e
     */
    public void afegirEspai(Espai e) {
        llistatGeneralEspais.put(e.getId(), e);
    }

    /**
     * Per afegir un espai a zoo i a una especie
     *
     * @param e
     * @param es
     */
    public void afegirEspai(Espai e, Especie es) {
        llistatGeneralEspais.put(e.getId(), e);
        es.afegirEspai(e);

    }

    /**
     * Per mostrar tots els espais del zoo
     */
    public void llistarEspais() {
        System.out.println(llistatGeneralEspais.values());
    }

    public void llistarExemplarEspecie(Especie e) {
        for (Entry<String, Cuidador> b : llistatCuidadors.entrySet()) {
            Cuidador cui = b.getValue();
            HashMap<String, Especie> ellista = cui.getLlistaEspecie();
            for (Entry<String, Especie> c : ellista.entrySet()) {
                Especie es = c.getValue();
                if (es.equals(e)) {
                    System.out.println(es.getLlistaAnimal().values());
                }
            }
        }

    }

    // ----------------   Metodes demanats del projecte -----------------------
    /**
     * Llista dels cuidadors del zoo
     */
    public void llistarCuidador() {
        System.out.println(llistatCuidadors.values());
    }

    public void llistarEspaiEspecie(String especie) {
        for (Entry<String, Cuidador> b : llistatCuidadors.entrySet()) {
            Cuidador c = b.getValue();
            HashMap<String, Especie> llista = c.getLlistaEspecie();
            for (Entry<String, Especie> d : llista.entrySet()) {
                Especie es = d.getValue();
                if (es.getNom().equals(especie)) {
                    System.out.println(es.getLlistaEspai().values());
                }
            }

        }

    }

    public void llistarEspaisTipus(EnumeracioEspai e) {
        for (Entry<String, Cuidador> b : llistatCuidadors.entrySet()) {
            //System.out.println("["+b.getKey() + "=" + b.getValue()+"]");
            Cuidador c = b.getValue();
            HashMap<String, Especie> llista = c.getLlistaEspecie();
            for (Entry<String, Especie> d : llista.entrySet()) {
                Especie es = d.getValue();
                HashMap<Integer, Espai> espai = es.getLlistaEspai();
                for (Entry<Integer, Espai> f : espai.entrySet()) {
                    Espai un = f.getValue();
                    if (un.getTipus().equals(e)) {
                        System.out.println(un.getTipus() + " " + un.getId());
                    }
                }
            }
        }
    }

    public void llistarCuidadorsEspecie(String especie) {
        for (Entry<String, Cuidador> b : llistatCuidadors.entrySet()) {
            Cuidador c = b.getValue();
            HashMap<String, Especie> llista = c.getLlistaEspecie();
            for (Entry<String, Especie> d : llista.entrySet()) {
                Especie e = d.getValue();
                if (e.getNom().equals(especie)) {
                    System.out.println("El cuidador es :" + c.getNom());
                }
            }
        }

    }

    public void llistarExemplarAliment(String aliment) {
        for (Entry<Integer, Animal> b : llistatGeneralAnimals.entrySet()) {
            Animal a = b.getValue();
            HashMap<String, Aliment> alim = a.getLlistaAliment();
            for (Entry<String, Aliment> c : alim.entrySet()) {
                Aliment alime = c.getValue();
                if (alime.getNom().equals(aliment)) {
                    System.out.println("En " + a.getNom() +" amb codi "+a.getCodiAnimal()+ " menja " + aliment);
                
            }
            }     
        }
    }

    // -------------   Llistats per fer proves de les clases ---------------
    /**
     * Per llistar les Tasques
     *
     */
    public void llistarTasca() {
        for (Entry<String, Cuidador> b : llistatCuidadors.entrySet()) {
            Cuidador cu = b.getValue();
            ArrayDeque<Tasca> llista = cu.getLlistatTasca();
            System.out.println(llista.toString());
        }

    }


    /**
     * Per llistar totes les especies
     *
     */
    public void llistarEspecie() {
        System.out.println(llistatGeneralEspecies.values());

    }

    /**
     * Per fer llistat de tots els espais
     */
    public void llistarEspai() {
        System.out.println(llistatGeneralEspais.values());
    }

    /**
     * Per llistar tots els animals.
     */
    public void llistarAnimal() {
        System.out.println(llistatGeneralAnimals.values());
        for (Entry<String, Cuidador> b : llistatCuidadors.entrySet()) {
            //System.out.println("["+b.getKey() + "=" + b.getValue()+"]");
            Cuidador c = b.getValue();
            HashMap<String, Especie> llista = c.getLlistaEspecie();
            for (Entry<String, Especie> d : llista.entrySet()) {
                Especie es = d.getValue();
                HashMap<String, Animal> animals = es.getLlistaAnimal();
                animals.values();

            }
        }
    }

    /**
     * Per llistar tots els aliments del zoo.
     */
    public void llistarAlimentZoo() {
        System.out.println(llistatGeneralAliments.values());

    }

// ---------------  Metode de proves -----------------------
    /**
     * Per fer proves generals(afegir, eliminar, etc.).
     *
     */
    public void proves() {
        // -------- proves Cuidador
//        llistarCuidador();
        Cuidador cuidadorProva = new Cuidador("Toni");
        afegirCuidador(cuidadorProva);
//        llistarCuidador();
//        eliminarCuidador(cuidadorProva.getNom());
//        llistarCuidador();

        // ----- ----proves Especie -------
        // afegir a llistat general
        Especie provaEspecie = new Especie("Orca", "Orco Orus", "Peix molt gros");
//        llistarEspecie();
        afegirEspecie(provaEspecie, cuidadorProva);
//        llistarEspecie();

        // afegir a llista general, i a un cuidador
//        llistarEspecie();
        //afegirEspecie(provaEspecie, cuidadorProva);
        //llistarEspecie();
        //llistarCuidadorsEspecie("Orca");
        // -------- proves Animal -----------
        // afegir un animal al zoo i a Especie i borrar
        Animal animalProva = new Animal("Lluis");
//        llistarAnimal();
        afegirAnimal(animalProva, provaEspecie);
//        llistarAnimal();
//        borrarAnimal(2);
//        llistarAnimal();
        //Cercar l'especie d'un animal
        //System.out.println(cercarEspecieAnimal(animalProva));
        //llistarExemplarEspecie(provaEspecie);
        // -------- proves Aliment ------
        // afegir aliment a llistat general del zoo
        Aliment alimentProva = new Aliment("Per provar", "No es bo");
//        llistarAlimentZoo();
//        afegirAliment(alimentProva);
//        llistarAlimentZoo();
        // afegir aliment a Especie i a Zoo
//        System.out.println(provaEspecie.getLlistatAliments().values());
//        afegirAliment(alimentProva, provaEspecie);
//        System.out.println(provaEspecie.getLlistatAliments().values());
        // afegir aliment a Animal a Especie i a Zoo
        //System.out.println(animalProva.getLlistaAliment().values());
        afegirAliment(alimentProva, provaEspecie, animalProva);
        //System.out.println(animalProva.getLlistaAliment().values());

        // --- proves Tasca -----
        // afegir tasca
        Tasca tascaProva = new Tasca("Fer proves");
//                tascaProva.setDescripcio("Descripcio tasca de prova");
        cuidadorProva.afegirTasca(tascaProva);
//        System.out.println( cuidadorProva.getLlistatTasca().getLast());

        // ----- proves espai -----
        // afegir espai al zoo  
        Espai espaiProva = new Espai(EnumeracioEspai.TANCAT);
//        llistarEspai();
//        afegirEspai(espaiProva);
//        llistarEspai();
        // afegir espai a especie
//        System.out.println(provaEspecie.getLlistaEspai().values());
        afegirEspai(espaiProva, provaEspecie);
//        System.out.println(provaEspecie.getLlistaEspai().values());

        // -------- Proves metodes demanats -----------------------
        // --------------------------------------------------------
        //llistarCuidador(); // llistar els cuidadors       
        //llistarEspaiEspecie("Aguila"); //llistar els espais on viu una certa esp?cie,
        //llistarEspaisTipus(EnumeracioEspai.TANCAT); //llistar els espais d'un cert tipus,
        //llistarCuidadorsEspecie("Tortuga"); //llistar els cuidadors d'una esp?cie,
        //cercarAnimalAliment(alimentProva);
        llistarExemplarAliment("carn"); //llistar els exemplars de les esp?cies que mengen un determinat aliment
    }

    // -------------------- MAIN -----------------------
    /**
     * Metode principal de la classe Zoo
     *
     * @param args Sense parametres
     */
    public static void main(String[] args) {
        Zoo meu = new Zoo("Zoolander", "c/Sense sortida n? -23");
        meu.inicialitzarZoo();
        meu.proves();
        // Per un altre zoo
        //Zoo teu = new Zoo("El teu", "Alla");
        //teu.afegirCuidador(null);
    }

} //class Zoo

package Model;

public class WordAssociation implements Comparable<WordAssociation> {
    private Assosiation<String, String> association;

    /**
     * Asocia la palabra con su valor
     * @param key palabra
     * @param value objto palabra
     */

    public WordAssociation(String key, String value) {
        this.association = new Assosiation<>(key, value);
    }

    public String getKey() {
        return association.getKey();
    }

    public String getValue() {
        return association.getValue();
    }

    /**
     * Imprime el arbol en orden
     * @return arbol en orden
     */
    public String toString(){
        return "Key: "+association.getKey().toString() + " Valores asociados: " + association.getValue().toString();
    }
    /**
     * Compara con otras palabras
     * @param other the object to be compared.
     * @return comparacion
     */
    @Override
    public int compareTo(WordAssociation other) {
        return this.getKey().compareTo(other.getKey());
    }
}

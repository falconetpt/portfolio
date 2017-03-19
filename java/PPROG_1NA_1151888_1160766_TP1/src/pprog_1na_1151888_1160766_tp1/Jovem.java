
package pprog_1na_1151888_1160766_tp1;

/**
 *
 * @author ricardo
 */
public abstract class Jovem extends Socio {
    private int numAulas;
    private static int DEFAULT_N_AULAS = 1;
    
    /**
     * Construtor default do Jovem 
     * @param identificador - id do socio 
     */
    public Jovem(String identificador) {
        super(identificador);
        numAulas = DEFAULT_N_AULAS;
    }
    
    /**
     * Construtor completo
     * @param identificador - id do socio 
     * @param nome - nome do socio
     * @param nif - numero de identificacao fiscal
     * @param anoNascimento - ano nascimento
     * @param numAulas - numero de aulas
     */
    public Jovem(String identificador, String nome, String nif,
            int anoNascimento, int numAulas) {
        super(identificador,  nome,  nif, anoNascimento);
        this.numAulas = numAulas;
    }

    /**
     * @return the numAulas
     */
    public int getNumAulas() {
        return numAulas;
    }

    /**
     * @param numAulas the numAulas to set
     */
    public void setNumAulas(int numAulas) {
        this.numAulas = numAulas;
    }

    /**
     * @return the DEFAULT_N_AULAS
     */
    public static int getDEFAULT_N_AULAS() {
        return DEFAULT_N_AULAS;
    }

    /**
     * @param aDEFAULT_N_AULAS the DEFAULT_N_AULAS to set
     */
    public static void setDEFAULT_N_AULAS(int aDEFAULT_N_AULAS) {
        DEFAULT_N_AULAS = aDEFAULT_N_AULAS;
    }
    
    @Override
    /**
     * Retorna Representação textual do Objecto
     * A DESENVOLVER
     */
    public String toString() {
        return String.format("");
    }
    
}

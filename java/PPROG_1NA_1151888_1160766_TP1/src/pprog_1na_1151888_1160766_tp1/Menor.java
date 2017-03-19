
package pprog_1na_1151888_1160766_tp1;

/**
 *
 * @author ricardo
 */
public class Menor extends Jovem {
    private static int N_JOVENS = 0;
    private static String IDENTIFICADOR = "SMENOR-";
    private static String DEFAULT_ENC_ED = "Sem encarregado";
    
    private String nomeEncEducacao;
    
    public Menor() {
        super(IDENTIFICADOR + (++N_JOVENS));
        nomeEncEducacao = DEFAULT_ENC_ED;
    }
    
    public Menor(String nome, String nif,
            int anoNascimento, int numAulas, String nomeEncEducacao) {
        super(IDENTIFICADOR + (++N_JOVENS), nome, nif,
             anoNascimento, numAulas);
        this.nomeEncEducacao = nomeEncEducacao;
    }

    /**
     * @return the N_JOVENS
     */
    public static int getN_JOVENS() {
        return N_JOVENS;
    }

    /**
     * @return the IDENTIFICADOR
     */
    public static String getIDENTIFICADOR() {
        return IDENTIFICADOR;
    }

    /**
     * @param aIDENTIFICADOR the IDENTIFICADOR to set
     */
    public static void setIDENTIFICADOR(String aIDENTIFICADOR) {
        IDENTIFICADOR = aIDENTIFICADOR;
    }

    /**
     * @return the DEFAULT_ENC_ED
     */
    public static String getDEFAULT_ENC_ED() {
        return DEFAULT_ENC_ED;
    }

    /**
     * @param aDEFAULT_ENC_ED the DEFAULT_ENC_ED to set
     */
    public static void setDEFAULT_ENC_ED(String aDEFAULT_ENC_ED) {
        DEFAULT_ENC_ED = aDEFAULT_ENC_ED;
    }

    /**
     * @return the nomeEncEducacao
     */
    public String getNomeEncEducacao() {
        return nomeEncEducacao;
    }

    /**
     * @param nomeEncEducacao the nomeEncEducacao to set
     */
    public void setNomeEncEducacao(String nomeEncEducacao) {
        this.nomeEncEducacao = nomeEncEducacao;
    }
    
    
    /**
     * Retorna Representação textual do Objecto
     * A DESENVOLVER
     */
    @Override
    public String toString() {
        return String.format("");
    }
    
    /**
     * Calculo da mensalidade, será implementado pelas subclasses
     * A DESENVOLVER
     * @return
     */
    @Override
    public double calcMensalidade() {
        return 0;
    }
}


package pprog_1na_1151888_1160766_tp1;


public class Senior extends Socio {
    private static int N_SENIOR = 0;
    private static String IDENTIFICADOR = "SSENIOR-";
    
    private static Dirige DEFAULT_DIRIGENTE = new NaoDirigente();
    private Dirige tipoSocio;
    
    public Senior() {
        super(IDENTIFICADOR + (++N_SENIOR));
        tipoSocio = DEFAULT_DIRIGENTE;
    }
    
    public Senior(String nome, String nif,
            int anoNascimento, Dirige tipoSocio) {
        super(IDENTIFICADOR + (++N_SENIOR), nome, nif,
             anoNascimento);
        this.tipoSocio = tipoSocio;
    }

    /**
     * @return the N_SENIOR
     */
    public static int getN_SENIOR() {
        return N_SENIOR;
    }

    /**
     * @return the IDENTIFICADOR
     */
    public static String getIDENTIFICADOR() {
        return IDENTIFICADOR;
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
        return 0 * tipoSocio.majorante();
    }
}

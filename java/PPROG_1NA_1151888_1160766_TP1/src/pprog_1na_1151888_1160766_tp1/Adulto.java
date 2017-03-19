/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog_1na_1151888_1160766_tp1;

/**
 *
 * @author ricardo
 */
public class Adulto extends Jovem {
    private static int N_ADULTOS = 0;
    private static String IDENTIFICADOR = "SADULTO-";
    private static Dirige DEFAULT_DIRIGENTE = new NaoDirigente();
    private Dirige tipoSocio;
    
    public Adulto() {
        super(IDENTIFICADOR + (++N_ADULTOS));
        tipoSocio = DEFAULT_DIRIGENTE;
    }
    
    public Adulto(String nome, String nif,
            int anoNascimento, int numAulas, Dirige tipoSocio) {
        super(IDENTIFICADOR + (++N_ADULTOS), nome, nif,
             anoNascimento, numAulas);
        this.tipoSocio = tipoSocio;
    }

    /**
     * @return the N_ADULTOS
     */
    public static int getN_ADULTOS() {
        return N_ADULTOS;
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

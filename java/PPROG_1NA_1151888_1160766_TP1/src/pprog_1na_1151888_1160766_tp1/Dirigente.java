
package pprog_1na_1151888_1160766_tp1;


public class Dirigente implements Dirige {
    private static double DEFAULT_PERCENT = 0;
    public static String CATEGORIA = "dirigente";

    /**
     * @return the DEFAULT_MENSALIDADE
     */
    public static double getDEFAULT_MENSALIDADE() {
        return DEFAULT_PERCENT;
    }

    /**
     * @param aDEFAULT_MENSALIDADE the DEFAULT_MENSALIDADE to set
     */
    public static void setDEFAULT_MENSALIDADE(double aDEFAULT_MENSALIDADE) {
        DEFAULT_PERCENT = aDEFAULT_MENSALIDADE;
    }
    
     /**
     * Retorna o majorante de calculo
     * @return 
     */
    public double majorante() {
        return DEFAULT_PERCENT;
    }
}

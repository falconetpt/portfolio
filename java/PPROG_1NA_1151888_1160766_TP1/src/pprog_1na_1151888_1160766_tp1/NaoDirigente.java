package pprog_1na_1151888_1160766_tp1;


public class NaoDirigente implements Dirige {
     private static double DEFAULT_PERCENT = 1;
     public static String CATEGORIA = "nao dirigente";

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
     * Retorna o valor da mensalidade a pagar por um socio 
     * @return 
     */
    public double majorante() {
        return DEFAULT_PERCENT;
    }
}

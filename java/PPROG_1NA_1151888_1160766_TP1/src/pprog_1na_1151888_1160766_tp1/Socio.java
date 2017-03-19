package pprog_1na_1151888_1160766_tp1;

import java.util.Calendar;

public abstract class Socio {
    private String identificador;
    private String nome;
    private String nif;
    private int anoNascimento;
    
    private static String DEFAULT_NOME = "Sem Nome";
    private static String DEFAULT_NIF = "Sem NIF";
    private static int DEFAULT_ANO = Calendar.getInstance().get(Calendar.YEAR);
    
    /**
     * Construtor default do socio 
     * @param identificador - id do socio 
     */
    public Socio(String identificador) {
        this.identificador = identificador;
        nome = DEFAULT_NOME;
        nif = DEFAULT_NIF;
        anoNascimento = DEFAULT_ANO;
    }
    
    /**
     * Construtor completo
     * @param identificador - id do socio 
     * @param nome - nome do socio
     * @param nif - numero de identificacao fiscal
     * @param anoNascimento - ano nascimento
     */
    public Socio(String identificador, String nome, String nif, int anoNascimento) {
        this.identificador = identificador;
        this.nome = nome;
        this.nif = nif;
        this.anoNascimento = anoNascimento;
    }

    /**
     * @return the identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador the identificador to set
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nif
     */
    public String getNif() {
        return nif;
    }

    /**
     * @param nif the nif to set
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * @return the anoNascimento
     */
    public int getAnoNascimento() {
        return anoNascimento;
    }

    /**
     * @param anoNascimento the anoNascimento to set
     */
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    /**
     * @return the DEFAULT_NOME
     */
    public static String getDEFAULT_NOME() {
        return DEFAULT_NOME;
    }

    /**
     * @param aDEFAULT_NOME the DEFAULT_NOME to set
     */
    public static void setDEFAULT_NOME(String aDEFAULT_NOME) {
        DEFAULT_NOME = aDEFAULT_NOME;
    }

    /**
     * @return the DEFAULT_NIF
     */
    public static String getDEFAULT_NIF() {
        return DEFAULT_NIF;
    }

    /**
     * @param aDEFAULT_NIF the DEFAULT_NIF to set
     */
    public static void setDEFAULT_NIF(String aDEFAULT_NIF) {
        DEFAULT_NIF = aDEFAULT_NIF;
    }

    /**
     * @return the DEFAULT_ANO
     */
    public static int getDEFAULT_ANO() {
        return DEFAULT_ANO;
    }

    /**
     * @param aDEFAULT_ANO the DEFAULT_ANO to set
     */
    public static void setDEFAULT_ANO(int aDEFAULT_ANO) {
        DEFAULT_ANO = aDEFAULT_ANO;
    }
    
    @Override
    /**
     * Retorna Representação textual do Objecto
     * A DESENVOLVER
     */
    public String toString() {
        return String.format("");
    }
    
    /**
     * Calculo da mensalidade, será implementado pelas subclasses
     * Polimorfismo
     * @return
     */
    public abstract double calcMensalidade();
}

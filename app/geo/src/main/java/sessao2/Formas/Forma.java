package sessao2.Formas;

/**
 * A classe Forma tem como objetivo criar uma representação
 * base comum das formas geométricas.
 * Relativamente às versões anteriores os pontos são representados em forma de
 * coordenadas X e Y em tipo double e não int (como na versão 1)
 * 
 * Adicionalmente os pontos são armazenados numa estrutura array double[]
 * para mais rápida manipulação
 * <ul>
 * <li>double coordenadaX</li>
 * <li>double coordenadaX</li>
 * </ul>
 *
 * É criada também uma variável interna, numeroDePonts, que permite saber quantos
 * vértices tem uma determinada forma.
 * O cálculo do perimetro e área depende da forma e por isso não é implementada
 * nesta classe
 * 
 * @author Eduardo Catarino
 * @version 1.0
 * @since 2.0
 */
public class Forma {


    private double coordenadaX[];
    private double coordenadaY[];
    private int numeroDePontos;
    private static final double PI = 3.14;
    private String nomeDaForma = "";



    /**
    * Construtor que recebe por parâmetros as coordenadas dos vértices do
    * quadrado
    * @param coordenadaX - representa o conjunto de coordenadas X dos pontos
    * @param coordenadaY - representa o conjunto de coordenadas Y dos pontos
    * @since 2.0
    */
    public Forma(double[] coordenadaX, double[] coordenadaY, String nome) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.numeroDePontos = coordenadaX.length;
        this.nomeDaForma = nome;
    }

    //Getters e setters que permitem obter/modificar o conteudo dos campos
    public double[] getCoordenadaX() {
        return coordenadaX;
    }


    public double[] getCoordenadaY() {
        return coordenadaY;
    }

    /**
    * Método que devolve o número de pontos associados à forma geométrica
    */
    public int getNumeroDePontos() {
        return numeroDePontos;
    }

    /**
    * Método que devolve o nome da forma que representa
    * @since 2.0
    * @return String - Nome da Forma Geométrica
    */
    public String nomeDaForma()
    {
        return  nomeDaForma.toUpperCase();
    }

    


}
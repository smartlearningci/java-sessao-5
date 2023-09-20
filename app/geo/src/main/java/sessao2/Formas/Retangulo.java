package sessao2.Formas;


/**
 * A classe Retangulo tem como objetivo criar uma representação
 * desta forma geométrica.
 * A classe extende a classe Forma que já define as coordenadas
 * dos pontos da forma.
 *
 * Associdado à representação dos vértices a classe possibilita
 * o cálculo de:
 * <ul>
 * <li>perímetro</li>
 * <li>área</li>
 * </ul>
 * através de dois métodos públicos com o mesmo nome.
 * <p>
 * A classe implementa o método toString para descrição do objeto.
 * @author Eduardo Catarino
 * @version 2.0
 * @since 1.0
 */
public class Retangulo extends Forma implements IForma{
    /**
    * <p>Construtor que recebe por parâmetros as coordenadas dos vértices do
    * quadrado
    * @param coordenadaX - representa o conjunto de coordenadas X dos pontos
    * @param coordenadaY - representa o conjunto de coordenadas Y dos pontos
    * @since 1.0
    */
    public Retangulo(double[] coordenadaX, double[] coordenadaY){
        super( coordenadaX, coordenadaY, "Retangulo");
        coordenadaX[1] = 10;
    }


    @Override
    public String toString() {
        return "Retangulo ";
    }


    /**
    * <p>Método que cálcula o valor do perímetro do retangulo
    * @since 1.0
    * @return int - valor do perímetro do retângulo
    */
    public double perimetro(){
        return 0;
    }

    /**
    * <p>Método que cálcula o valor sa área do retangulo
    * @since 1.0
    * @return int - valor da área do retângulo
    */
    public double area(){
        return 0;
    }



}
/**
 * @author Francis Rodríguez Calabuig
 * @version 1.2
 */
public class Rectangulo_FRC extends FiguraGeometrica_FRC {
	private double l1;
	private double l2;
	
	/**
	 * Este constructor recibe el tipo de figura desde la clase FiguraGeometrica y asigna valores a lG y lP
	 * @param tipoFigura Al recibir rectángulo, ejecuta esta clase, si recibiera otra figura, ejecutaría otra clase.
	 * @param lG Es el lado grande del rectángulo
	 * @param lP Es el lado pequeño del rectángulo
	 */
	
	public Rectangulo_FRC(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	/**
	 * Override sobrescribe el método área que se encuentra fuera de esta clase
	 * @return Calcula el area de los dos lados del rectángulo multiplicándolos.
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	/**
	 * Override sobreescribe el método perimetro que se encuentra fuera de esta clase
	 * @return Calcula el perímetro del rectángulo y devuelve el resultado.
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}

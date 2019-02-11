/**
 * @author Francis Rodr�guez Calabuig
 * @version 1.2
 */
public class Rectangulo_FRC extends FiguraGeometrica_FRC {
	private double l1;
	private double l2;
	
	/**
	 * Este constructor recibe el tipo de figura desde la clase FiguraGeometrica y asigna valores a lG y lP
	 * @param tipoFigura Al recibir rect�ngulo, ejecuta esta clase, si recibiera otra figura, ejecutar�a otra clase.
	 * @param lG Es el lado grande del rect�ngulo
	 * @param lP Es el lado peque�o del rect�ngulo
	 */
	
	public Rectangulo_FRC(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	/**
	 * Override sobrescribe el m�todo �rea que se encuentra fuera de esta clase
	 * @return Calcula el area de los dos lados del rect�ngulo multiplic�ndolos.
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	/**
	 * Override sobreescribe el m�todo perimetro que se encuentra fuera de esta clase
	 * @return Calcula el per�metro del rect�ngulo y devuelve el resultado.
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}

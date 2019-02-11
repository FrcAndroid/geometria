
public class Circulo_FRC extends FiguraGeometrica_FRC {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_FRC(double r, String tipoFigura) {
		super(tipoFigura);
		radio = r;
		
		if (radio < 0) {
			radio = 0;
		}
		
		
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}

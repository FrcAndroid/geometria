package geometria;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CirculoTestPerimetro {
	private double radio;
	static final double PI = 3.1416;
	private double resultado;

	
	public CirculoTestPerimetro (double radio, double resultado) {
		this.radio=radio;
		this.resultado= resultado;
	}
	@Parameters
	public static Collection<Object[]> datos (){
		return Arrays.asList(new Object[][] {
			{7,43.96},{0,0},{3,18.84}
		});
	}

	@Test
	public void testPerimetro() {
		CirculoTest cir=new CirculoTest(radio,resultado);
		double res= radio*2*PI;
		assertEquals(res,resultado, 0.1);
	}
}

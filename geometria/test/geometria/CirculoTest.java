package geometria;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CirculoTest {
	private double radio;
	static final double PI = 3.1416;
	private double resultado;

	
	public CirculoTest(double radio, double resultado) {
		this.radio=radio;
		this.resultado= resultado;
	}
	@Parameters
	public static Collection<Object[]> datos (){
		return Arrays.asList(new Object[][] {
			{7,153.86},{0,0},{3,28.26}
		});
	}

	@Test
	public void testArea() {
		CirculoTest cir=new CirculoTest(radio,resultado);
		double res= radio*radio*PI;
		assertEquals(res,resultado, 0.1);
	}
}

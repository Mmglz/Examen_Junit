package es.iessoterohernandez.daw.endes.Examen5.cuentas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {
	
	static Cuenta c;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		c = new Cuenta("123456789", "Pepito");
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	@Test
	void testIngresar() {
		try {
			c.ingresar("Ingreso", 500);

		} catch (Exception e) {
			fail("Ingreso realizado");
		}
		
		assertTrue(c.getSaldo() == 500);
	}

	@Test
	void testIngresarNegativoExcepcion() {
		try {
			c.ingresar("Ingreso", -100);

		} catch (Exception e) {
			fail("No se puede ingresar una cantidad negativa");
		}
		
		assertTrue(c.getSaldo() == -100);
	}
	
	@Test
	void testRetirar() {
		try {
			c.ingresar("Ingreso", 500);
			c.retirar("Retirada", 200);
		} catch (Exception e) {
		}
		
		assertTrue(c.getSaldo() == 300);
	}
	
	@Test
	void testRetirarImporteNegativoExcepcion() {
		try {
			c.ingresar("Ingreso", 600);
			c.retirar("Retiro", -100);

		} catch (Exception e) {
			fail("No se puede retirar una cantidad negativa");
		}
		
		assertTrue(c.getSaldo() == 600);
	}
	
	@Test
	void testRetirarImporteExcepcion() {
		try {
			c.ingresar("Ingreso", 800);
			c.retirar("Retiro", 900);

		} catch (Exception e) {
			fail("Saldo insuficiente");
		}
		assertTrue(c.getSaldo() == 800);
	}

	@Test
	void testGetSaldo() {
		try {
			Movimiento m = new Movimiento();
			c.ingresar("Ingreso", 100);
			m.getImporte();
		} catch (Exception e) {
		}
		assertEquals(100, c.getSaldo());
	}

}

package es.iessoterohernandez.daw.endes.Examen5.cuentas;

import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

class MovimientoTest extends CoreMatchers {
	
	static Movimiento m;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		m = new Movimiento();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testSetImporte() {
		m.setImporte(800.0);
		assertThat(800.0, is(m.getImporte()));
	}
	
	@Test
	void testSetConcepto() {
		m.setConcepto("Ingreso");
		assertThat("Ingreso", is(m.getConcepto()));
	}
	
	@Test
	void testGetImporte() {
		m.setImporte(50.0);
		assertThat(50.0, is(m.getImporte()));
	}

	@Test
	void testGetConcepto() {
		m.setConcepto("Ingreso");
		assertThat("Ingreso", is(m.getConcepto()));
	}

	

	

}

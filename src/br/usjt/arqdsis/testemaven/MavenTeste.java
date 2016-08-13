package br.usjt.arqdsis.testemaven;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.google.gson.Gson;

public class MavenTeste {

	Gson gson;
	Cliente cliente;
	String resultado;
	
	@Before
	public void testeMoven()
	{
		gson = new Gson();
		cliente = new Cliente(1, "Elcio", "456344", "elcio@teste");
		resultado = gson.toJson(cliente);
		System.out.println(resultado);
	}
	
	@Test
	public void teste()
	{
		assertEquals("Teste", resultado,"");
	}
}

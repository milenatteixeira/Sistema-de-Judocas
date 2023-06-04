package test.java.org.fpij.jitakyoei.model.beans;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.fpij.jitakyoei.model.beans.Endereco;

public class TestEndereco {
    @Test
	public void cepComLetraTest() {
		// initial setup
		Endereco endereco = new Endereco();
		String expected = endereco.getCep();
		endereco.setCep("123456mn");
		
		String curr_value = endereco.getCep();
		assertEquals(expected, curr_value);
	}
}

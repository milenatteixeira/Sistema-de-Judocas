import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.fpij.jitakyoei.model.beans.Entidade;

public class EntidadeTest {
    @Test
    public void verificarTamanhoCNPJTest() {
        // Initial setup
        Entidade entidade = new Entidade();
		String expected = "12345678910234";
        entidade.setCnpj("12345678910234");

        String curr_value = entidade.getCnpj();
        assertEquals(expected.length(), curr_value.length());
    }
}
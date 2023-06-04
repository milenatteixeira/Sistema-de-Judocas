import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.fpij.jitakyoei.model.beans.Endereco;

public class TestEndereco {
    @Test
    public void cepComLetraTest() {
        Endereco endereco = new Endereco();
        endereco.setCep("endereco qualquer");
        String enderecoTeste = "endereco qualquer";

        String curr_value = endereco.getCep();
        assertEquals(enderecoTeste, curr_value);
    }
}

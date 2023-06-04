import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.fpij.jitakyoei.model.beans.Filiado;

public class FiliadoTest {
    
    @Test
	public void emailValidoTest() {
		// initial setup
		Filiado filiado = new Filiado();
		String expected = "prikafin.jose@gmail.com";
		filiado.setEmail("prikafin.jose@gmail.com");
		
		String curr_value = filiado.getEmail();
		assertEquals(expected, curr_value);
	}

    @Test(expected = Exception.class)
	public void cpfInvalidoTest() {
		// initial setup
		Filiado filiado = new Filiado();
		filiado.setCpf("1a2.3fs.4aa-ds");
	}

    @Test
    public void cpfTamanhoTest(){
        // initial setup
        Filiado filiado = new Filiado();
		String expected = "123.456.789-12";
		filiado.setCpf("123.456.789-12"); 
		
		String curr_value = filiado.getCpf();
		assertEquals(expected.length(), curr_value.length());
    }
}
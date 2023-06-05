import org.junit.Assert;
import org.junit.Test;

public class TestEndereco {
    
    @Test
    public void testGetSetRua() {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua A");
        Assert.assertEquals("Rua A", endereco.getRua());
    }
    
    @Test
    public void testGetSetNumero() {
        Endereco endereco = new Endereco();
        endereco.setNumero("123");
        Assert.assertEquals("123", endereco.getNumero());
    }
    
    @Test
    public void testGetSetBairro() {
        Endereco endereco = new Endereco();
        endereco.setBairro("Centro");
        Assert.assertEquals("Centro", endereco.getBairro());
    }
    
    @Test
    public void testGetSetCidade() {
        Endereco endereco = new Endereco();
        endereco.setCidade("São Paulo");
        Assert.assertEquals("São Paulo", endereco.getCidade());
    }
    
    @Test
    public void testGetSetEstado() {
        Endereco endereco = new Endereco();
        endereco.setEstado("SP");
        Assert.assertEquals("SP", endereco.getEstado());
    }
    
    @Test
    public void testGetSetCep() {
        Endereco endereco = new Endereco();
        endereco.setCep("12345-678");
        Assert.assertEquals("12345-678", endereco.getCep());
    }
}

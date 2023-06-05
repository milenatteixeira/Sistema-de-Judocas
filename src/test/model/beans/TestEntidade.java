package model.beans;
import org.fpij.jitakyoei.model.beans.*;
import org.junit.Assert;
import org.junit.Test;

public class TestEntidade {
    
    @Test
    public void testGetSetNome() {
        Entidade entidade = new Entidade();
        entidade.setNome("Entidade A");
        Assert.assertEquals("Entidade A", entidade.getNome());
    }
    
    @Test
    public void testGetSetCnpj() {
        Entidade entidade = new Entidade();
        entidade.setCnpj("12345678901234");
        Assert.assertEquals("12345678901234", entidade.getCnpj());
    }
    
    @Test
    public void testGetSetTelefone1() {
        Entidade entidade = new Entidade();
        entidade.setTelefone1("123456789");
        Assert.assertEquals("123456789", entidade.getTelefone1());
    }
    
    @Test
    public void testGetSetTelefone2() {
        Entidade entidade = new Entidade();
        entidade.setTelefone2("987654321");
        Assert.assertEquals("987654321", entidade.getTelefone2());
    }
    
    @Test
    public void testGetSetEndereco() {
        Entidade entidade = new Entidade();
        Endereco endereco = new Endereco();
        endereco.setRua("Rua A");
        endereco.setNumero("123");
        entidade.setEndereco(endereco);
        Assert.assertEquals(endereco, entidade.getEndereco());
    }
    
    @Test
    public void testCopyProperties() {
        Entidade entidade1 = new Entidade();
        entidade1.setNome("Entidade A");
        entidade1.setCnpj("12345678901234");
        entidade1.setTelefone1("123456789");
        entidade1.setTelefone2("987654321");
        Endereco endereco1 = new Endereco();
        entidade1.setEndereco(endereco1);
        
        Entidade entidade2 = new Entidade();
        entidade2.setNome("Entidade B");
        entidade2.setCnpj("56789012345678");
        entidade2.setTelefone1("987654321");
        entidade2.setTelefone2("123456789");
        Endereco endereco2 = new Endereco();
        entidade2.setEndereco(endereco2);
        
        entidade1.copyProperties(entidade2);
        
        Assert.assertEquals(entidade2.getNome(), entidade1.getNome());
        Assert.assertEquals(entidade2.getCnpj(), entidade1.getCnpj());
        Assert.assertEquals(entidade2.getTelefone1(), entidade1.getTelefone1());
        Assert.assertEquals(entidade2.getTelefone2(), entidade1.getTelefone2());
        Assert.assertEquals(entidade2.getEndereco(), entidade1.getEndereco());
    }
}

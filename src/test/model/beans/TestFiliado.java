package model.beans;
import org.fpij.jitakyoei.model.beans.*;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestFiliado {

    @Test
    public void testGetSetId() {
        Filiado filiado = new Filiado();
        Long id = 1L;
        filiado.setId(id);
        Assert.assertEquals(id, filiado.getId());
    }

    @Test
    public void testGetSetNome() {
        Filiado filiado = new Filiado();
        String nome = "João";
        filiado.setNome(nome);
        Assert.assertEquals(nome, filiado.getNome());
    }

    @Test
    public void testGetSetRegistroCbj() {
        Filiado filiado = new Filiado();
        String registroCbj = "12345";
        filiado.setRegistroCbj(registroCbj);
        Assert.assertEquals(registroCbj, filiado.getRegistroCbj());
    }

    @Test
    public void testGetSetDataNascimento() {
        Filiado filiado = new Filiado();
        Date dataNascimento = new Date();
        filiado.setDataNascimento(dataNascimento);
        Assert.assertEquals(dataNascimento, filiado.getDataNascimento());
    }

    @Test
    public void testGetSetDataCadastro() {
        Filiado filiado = new Filiado();
        Date dataCadastro = new Date();
        filiado.setDataCadastro(dataCadastro);
        Assert.assertEquals(dataCadastro, filiado.getDataCadastro());
    }

    @Test
    public void testGetSetEndereco() {
        Filiado filiado = new Filiado();
        Endereco endereco = new Endereco();
        filiado.setEndereco(endereco);
        Assert.assertEquals(endereco, filiado.getEndereco());
    }

    @Test
    public void testGetSetTelefone1() {
        Filiado filiado = new Filiado();
        String telefone1 = "123456789";
        filiado.setTelefone1(telefone1);
        Assert.assertEquals(telefone1, filiado.getTelefone1());
    }

    @Test
    public void testGetSetTelefone2() {
        Filiado filiado = new Filiado();
        String telefone2 = "987654321";
        filiado.setTelefone2(telefone2);
        Assert.assertEquals(telefone2, filiado.getTelefone2());
    }

    @Test
    public void testGetSetEmail() {
        Filiado filiado = new Filiado();
        String email = "joao@example.com";
        filiado.setEmail(email);
        Assert.assertEquals(email, filiado.getEmail());
    }

    @Test
    public void testGetSetRg() {
        Filiado filiado = new Filiado();
        Rg rg = new Rg();
        rg.setId(1L);
        filiado.setRg(rg);
        Assert.assertEquals(rg, filiado.getRg());
    }

    @Test
    public void testGetSetCpf() {
        Filiado filiado = new Filiado();
        String cpf = "12345678901";
        filiado.setCpf(cpf);
        Assert.assertEquals(cpf, filiado.getCpf());
    }

    @Test
    public void testGetSetFaixas() {
        Filiado filiado = new Filiado();
        List<Faixa> faixas = new ArrayList<>();
        filiado.setFaixas(faixas);
        Assert.assertEquals(faixas, filiado.getFaixas());
    }

    @Test
    public void testGetSetObservacoes() {
        Filiado filiado = new Filiado();
        String observacoes = "Observações sobre o filiado";
        filiado.setObservacoes(observacoes);
        Assert.assertEquals(observacoes, filiado.getObservacoes());
    }
}

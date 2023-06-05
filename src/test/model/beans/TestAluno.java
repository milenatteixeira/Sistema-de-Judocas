package model.beans;

import org.fpij.jitakyoei.model.beans.*;
import org.junit.Assert;
import org.junit.Test;

public class TestAluno {
    
    @Test
    public void testGetSetFiliado() {
        Aluno aluno = new Aluno();
        Filiado filiado = new Filiado();
        filiado.setId(1L);
        aluno.setFiliado(filiado);
        Assert.assertEquals(filiado, aluno.getFiliado());
    }
    
    @Test
    public void testGetSetEntidade() {
        Aluno aluno = new Aluno();
        Entidade entidade = new Entidade();
        aluno.setEntidade(entidade);
        Assert.assertEquals(entidade, aluno.getEntidade());
    }
    
    @Test
    public void testGetSetProfessor() {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        aluno.setProfessor(professor);
        Assert.assertEquals(professor, aluno.getProfessor());
    }
    
    @Test
    public void testCopyProperties() {
        Aluno aluno1 = new Aluno();
        Filiado filiado1 = new Filiado();
        filiado1.setId(1L);
        filiado1.setNome("João");
        aluno1.setFiliado(filiado1);
        Entidade entidade1 = new Entidade();
        Professor professor1 = new Professor();
        aluno1.setEntidade(entidade1);
        aluno1.setProfessor(professor1);
        
        Aluno aluno2 = new Aluno();
        Filiado filiado2 = new Filiado();
        filiado2.setId(2L);
        filiado2.setNome("Maria");
        aluno2.setFiliado(filiado2);
        Entidade entidade2 = new Entidade();
        Professor professor2 = new Professor();
        aluno2.setEntidade(entidade2);
        aluno2.setProfessor(professor2);
        
        aluno1.copyProperties(aluno2);
        
        Assert.assertEquals(filiado2, aluno1.getFiliado());
        Assert.assertEquals(entidade2, aluno1.getEntidade());
        Assert.assertEquals(professor2, aluno1.getProfessor());
    }
}

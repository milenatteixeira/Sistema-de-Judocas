package model.beans;
import org.fpij.jitakyoei.model.beans.*;

import org.junit.Assert;
import org.junit.Test;

public class TestProfessorEntidade {

    @Test
    public void testGetSetProfessor() {
        Professor professor = new Professor();
        Entidade entidade = new Entidade();
        ProfessorEntidade professorEntidade = new ProfessorEntidade(professor, entidade);
        
        professorEntidade.setProfessor(professor);
        Assert.assertEquals(professor, professorEntidade.getProfessor());
    }

    @Test
    public void testGetSetEntidade() {
        Professor professor = new Professor();
        Entidade entidade = new Entidade();
        ProfessorEntidade professorEntidade = new ProfessorEntidade(professor, entidade);
        
        professorEntidade.setEntidade(entidade);
        Assert.assertEquals(entidade, professorEntidade.getEntidade());
    }
}

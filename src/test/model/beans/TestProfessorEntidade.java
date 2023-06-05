import org.junit.Assert;
import org.junit.Test;

public class TestProfessorEntidade {

    @Test
    public void testGetSetProfessor() {
        ProfessorEntidade professorEntidade = new ProfessorEntidade();
        Professor professor = new Professor();
        professorEntidade.setProfessor(professor);
        Assert.assertEquals(professor, professorEntidade.getProfessor());
    }

    @Test
    public void testGetSetEntidade() {
        ProfessorEntidade professorEntidade = new ProfessorEntidade();
        Entidade entidade = new Entidade();
        professorEntidade.setEntidade(entidade);
        Assert.assertEquals(entidade, professorEntidade.getEntidade());
    }
}

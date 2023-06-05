package model.beans;
import org.fpij.jitakyoei.model.beans.*;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class TestProfessor {

    @Test
    public void testGetSetFiliado() {
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        filiado.setNome("Filiado 2");
        professor.setFiliado(filiado);
        Assert.assertEquals(filiado.getNome(), professor.getFiliado().getNome());
    }

    @Test
    public void testGetSetEntidades() {
        Professor professor = new Professor();
        List<Entidade> entidades = new ArrayList<>();
        professor.setEntidades(entidades);
        Assert.assertEquals(entidades, professor.getEntidades());
    }
}

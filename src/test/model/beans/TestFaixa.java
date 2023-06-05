import org.junit.Assert;
import org.junit.Test;
import java.util.Date;

public class TestFaixa {

    @Test
    public void testGetSetCor() {
        Faixa faixa = new Faixa();
        CorFaixa cor = CorFaixa.AMARELA;
        faixa.setCor(cor);
        Assert.assertEquals(cor, faixa.getCor());
    }

    @Test
    public void testGetSetDataEntrega() {
        Faixa faixa = new Faixa();
        Date dataEntrega = new Date();
        faixa.setDataEntrega(dataEntrega);
        Assert.assertEquals(dataEntrega, faixa.getDataEntrega());
    }
}

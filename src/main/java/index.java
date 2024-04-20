import javax.swing.*;

public class index {

    public static void main(String[] args)
    {
        String nome = "",key="";
        FilmesDAT filme = new FilmesDAT();
        APISERVICE service = new APISERVICE();
        nome = JOptionPane.showInputDialog(null,"Movie name:");
        key = JOptionPane.showInputDialog(null,"Your key for API search");
        filme = service.getFilme(nome,key);
        if(filme.verificaVazio())
        {
            JOptionPane.showMessageDialog(null,filme.getALL());
        }
        else
        {
            JOptionPane.showMessageDialog(null,filme.getTittle());
        }

    }
}

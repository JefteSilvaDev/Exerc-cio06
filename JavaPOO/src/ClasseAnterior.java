import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

	public class ClasseAnterior extends JOptionPane {

		private static final long serialVersionUID = 1L;{
		}
				public static void main (String [] args) throws ParseException {
					
					
					String nome = JOptionPane.showInputDialog("Digite seu nome");
					double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua Altura"));
					String data_nasc = JOptionPane.showInputDialog(null, "Data de Nascimento: ","Data",JOptionPane.OK_OPTION);
					Date data = new SimpleDateFormat("dd/MM/yyyy").parse(data_nasc);
					
					
					JOptionPane.showMessageDialog(null,"Seu nome é:" +nome); 
					JOptionPane.showMessageDialog(null,"Sua Altura é:"+altura);
					JOptionPane.showMessageDialog(null,"Sua Data de Nascimento é:"+data);
					
		}
	
}
import java.util.Date;
import java.text.DateFormat;

public class PDV {

	public static void main(String[] args) {
		// Date -> trabalhar com data
		Date data = new Date();
		// Formatar a data
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL); 
			System.out.println(formatador.format(data));
	}

}

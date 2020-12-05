package bemVindo;
import javax.swing.JOptionPane;

public class BemVindo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String nome = JOptionPane.showInputDialog("Digite seu nome", "Digite Aqui Mesmo!!");
		JOptionPane.showMessageDialog(null, "Primeiro Programa!\n Hello World!!!\n" + nome.toUpperCase() + ", \n Seja Bem-Vindo!!", "Mensagem de Encerramento",0);
		System.exit(0);
		
	}

}

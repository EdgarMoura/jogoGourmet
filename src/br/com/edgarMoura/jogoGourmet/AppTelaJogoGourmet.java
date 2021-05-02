package br.com.edgarMoura.jogoGourmet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AppTelaJogoGourmet {

	   public JFrame exibirTelaInicial(JogoGourmet jogo) {
	        JFrame frame;
	        JLabel fraseInicial = new JLabel("Pense em um prato que você gosta.");
	        fraseInicial.setBounds(55, 50, 280, 50);
	        JButton botaoInicial = new JButton("OK");
	        botaoInicial.setBounds(110, 100, 95, 30);

	        botaoInicial.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                jogo.iniciar();
	            }
	        });

	        frame = new JFrame("Jogo Gourmet");
	        frame.add(botaoInicial);
	        frame.add(fraseInicial);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(330, 200);
	        frame.setLayout(null);
	        frame.setLocationRelativeTo(null);
	        
	        return frame;
	    }

	    public void exibirMensagemAcertei() {
	        JOptionPane.showMessageDialog(null,
	                "Acertei de novo!", 
	                "Jogo Gourmet",
	                JOptionPane.INFORMATION_MESSAGE
	        );
	    }
	    
	    public int exibirPerguntaPrato(String prato) {
	        return JOptionPane.showConfirmDialog(
		                null,
		                "O prato que você pensou é " + prato + "?",
		                "Confirme",
		                JOptionPane.YES_NO_OPTION
	        );
	    }
	    
	    public String exibirPerguntaNovoPrato(){
	        return JOptionPane.showInputDialog(null, 
	        			"Qual prato você pensou?", 
	        			"Desisto", 
	        			JOptionPane.QUESTION_MESSAGE
	        );
	    }
	    
	    public String exibirPerguntaNovoTipoPrato(String novoPrato, String pratoAtual){
	        return JOptionPane.showInputDialog(
		                null,
		                novoPrato + " é ________ mas " + pratoAtual + " não.", 
		                "Complete",
		                JOptionPane.QUESTION_MESSAGE
	        );
	    
	    }
	    
		public static void main(String[] args) {
	        AppTelaJogoGourmet appTelaJogoGourmet = new AppTelaJogoGourmet(); 
			JogoGourmet jg = new JogoGourmet();
	        JFrame telaInicial = appTelaJogoGourmet.exibirTelaInicial(jg);
	        telaInicial.setVisible(true);
	    }
}

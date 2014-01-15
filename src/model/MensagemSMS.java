package model;

public class MensagemSMS {

	private String codigos = "";
	private int botao;
	
	public MensagemSMS(String mensagem) {
		for(int contador = 0 ; contador < mensagem.length(); contador++){
			
			int botaoAnterior = botao;
			
			String sequencia = compila(mensagem.charAt(contador));
			int botaoAtual = botao;
			
			if((botaoAnterior == botaoAtual) && (botaoAnterior != 0)) {
				codigos = codigos + "_";
			}
			
			codigos = codigos + sequencia;
			
		}
	}
	
	public String compila(char caracter){
		switch(caracter){
			case 'A': botao = 2; return "2";
			case 'B': botao = 2; return "22";
			case 'C': botao = 2; return "222";
			case 'D': botao = 3; return "3";
			case 'E': botao = 3; return "33";
			case 'F': botao = 3; return "333";
			case 'G': botao = 4; return "4";
			case 'H': botao = 4; return "44";
			case 'I': botao = 4; return "444";
			case 'J': botao = 5; return "5";
			case 'K': botao = 5; return "55";
			case 'L': botao = 5; return "555";
			case 'M': botao = 6; return "6";
			case 'N': botao = 6; return "66";
			case 'O': botao = 6; return "666";
			case 'P': botao = 7; return "7";
			case 'Q': botao = 7; return "77";
			case 'R': botao = 7; return "777";
			case 'S': botao = 7; return "7777";
			case 'T': botao = 8; return "8";
			case 'U': botao = 8; return "88";
			case 'V': botao = 8; return "888";
			case 'W': botao = 9; return "9";
			case 'X': botao = 9; return "99";
			case 'Y': botao = 9; return "999";
			case 'Z': botao = 9; return "9999";
			case ' ': return "0";
		}
		/*return sequencia; */
		return "";
	}

	public String getCodigos() {
		return codigos;
	}

}

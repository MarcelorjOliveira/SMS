package model;

public class MensagemSMS {

	private String codigos;
	
	public MensagemSMS(String mensagem) {
		codigos = "";
		for(int contador = 0 ; contador < mensagem.length(); contador++){
			codigos = codigos + compila(mensagem.charAt(contador));
		}
	}
	
	public String compila(char caracter){
		switch(caracter){
			case 'A': return "2";
			case 'B': return "22";
			case 'C': return "222";
			case 'D': return "3";
			case 'E': return "33";
			case 'F': return "333";
			case 'G': return "4";
			case 'H': return "44";
			case 'I': return "444";
			case 'J': return "5";
			case 'K': return "55";
			case 'L': return "555";
			case 'M': return "6";
			case 'N': return "66";
			case 'O': return "666";
			case 'P': return "7";
			case 'Q': return "77";
			case 'R': return "777";
			case 'S': return "7777";
			case 'T': return "8";
			case 'U': return "88";
			case 'V': return "888";
			case 'W': return "9";
			case 'X': return "99";
			case 'Y': return "999";
			case 'Z': return "9999";
			case ' ': return "0";
		}
		/*return sequencia; */
		return "";
	}

	public String getCodigos() {
		return codigos;
	}

}

package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class SMSTest {
	
	/*@Test
	public void testaTexto(){
		MensagemSMS mensagem = new MensagemSMS("QUERO TRABALHAR NA WDEV");
		assertEquals("778833777666087772_22_25554427770662093_33888", mensagem.getCodigos());
	}*/
	
	@Test
	public void testaLetraA(){
		MensagemSMS letraA = new MensagemSMS("A");
		assertEquals("2", letraA.getCodigos());
	}
	
	@Test
	public void testaLetraB(){
		MensagemSMS letraB = new MensagemSMS("B");
		assertEquals("22", letraB.getCodigos());
	}
	
	@Test
	public void testaEspaco(){
		MensagemSMS espaco = new MensagemSMS(" ");
		assertEquals("0", espaco.getCodigos());
	}
	
	@Test
	public void testaAA(){
		MensagemSMS aa = new MensagemSMS("AA");
		assertEquals("2_2", aa.getCodigos());
	}

}

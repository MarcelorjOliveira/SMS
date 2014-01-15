package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class SMSTest {
	
	/*
	@Test
	public void testaTexto(){
		MensagemSMS mensagem = new MensagemSMS("QUERO TRABALHAR NA WDEV");
		assertEquals("778833777666087772_22_25554427770662093_33888", mensagem.getCodigos());
	}
	*/
	@Test
	
	
	public void testaLetraA(){
		MensagemSMS letraA = new MensagemSMS("A");
		assertEquals("2", letraA.getCodigos());
	}

}

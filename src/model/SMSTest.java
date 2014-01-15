package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class SMSTest {

	@Test
	public void testaTexto(){
		MensagemSMS mensagem = new MensagemSMS("QUERO TRABALHAR NA WDEV");
		assertEquals(mensagem.getCodigos(),	"778833777666087772_22_25554427770662093_33888");
	}

}

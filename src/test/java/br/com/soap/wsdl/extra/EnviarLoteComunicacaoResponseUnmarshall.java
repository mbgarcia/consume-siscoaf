package br.com.soap.wsdl.extra;

import static org.junit.Assert.assertEquals;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

public class EnviarLoteComunicacaoResponseUnmarshall {

	@Test
	public void test() throws Exception {
		JAXBContext context = JAXBContext.newInstance(Resposta.class);
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		Resposta response = (Resposta) unmarshaller.unmarshal(new File("src/test/resources/EnviarLoteComunicacaoResponse.xml"));
		
		assertEquals("2", response.getStatus());
		
		assertEquals("CNPJ Comunicante inválido", response.getMensagens().getMensagens().get(0).getDescricao());
	}	
}

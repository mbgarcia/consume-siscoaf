package br.com.soap;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import br.com.soap.wsdl.EnviarLoteComunicacao;
import br.com.soap.wsdl.EnviarLoteComunicacaoResponse;


public class EnviarLoteClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(EnviarLoteClient.class);

	public EnviarLoteComunicacaoResponse sendLote(String lote) {

		EnviarLoteComunicacao request = new EnviarLoteComunicacao();
		request.setLote(lote);

		log.info("LOTE: " + lote);

		JAXBElement<EnviarLoteComunicacaoResponse> response = (JAXBElement) getWebServiceTemplate()
				.marshalSendAndReceive("https://treina.siscoaf2.fazenda.gov.br/siscoaf-internet/ComunicacaoService", request);
		
		System.out.println(response.getValue().getReturn());

		return new EnviarLoteComunicacaoResponse();
	}

}
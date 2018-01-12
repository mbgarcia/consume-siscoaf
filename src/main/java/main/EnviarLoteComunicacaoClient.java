
package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import main.wsdl.EnviarLoteComunicacao;
import main.wsdl.EnviarLoteComunicacaoResponse;


@Component
public class EnviarLoteComunicacaoClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(EnviarLoteComunicacaoClient.class);

	public EnviarLoteComunicacaoResponse enviarLote(String lote) {

		EnviarLoteComunicacao request = new EnviarLoteComunicacao();
		
		request.setLote(lote);

		log.info("Enviar lote com: " + lote);

		EnviarLoteComunicacaoResponse response = (EnviarLoteComunicacaoResponse) getWebServiceTemplate()
				.marshalSendAndReceive("http://treina.siscoaf.serpro.gov.br/coafws/service.asmx",
						request,
						new SoapActionCallback("http://www.coaf.fazenda.gov.br/EnviarLoteComunicacao"));

		return response;
	}

}

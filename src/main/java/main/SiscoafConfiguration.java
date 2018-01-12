package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SiscoafConfiguration {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in pom.xml
		marshaller.setContextPath("main.wsdl");
		return marshaller;
	}

	@Bean
	public EnviarLoteComunicacaoClient enviarLoteComunicacaoClient(Jaxb2Marshaller marshaller) {
		EnviarLoteComunicacaoClient client = new EnviarLoteComunicacaoClient();
		client.setDefaultUri("http://treina.siscoaf.serpro.gov.br/coafws/service.asmx");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}

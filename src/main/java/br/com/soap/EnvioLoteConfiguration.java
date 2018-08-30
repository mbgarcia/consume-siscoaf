package br.com.soap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class EnvioLoteConfiguration {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("br.com.soap.wsdl");
		return marshaller;
	}

	@Bean
	public EnviarLoteClient countryClient(Jaxb2Marshaller marshaller) {
		EnviarLoteClient client = new EnviarLoteClient();
		client.setDefaultUri("https://treina.siscoaf2.fazenda.gov.br/siscoaf-internet/ComunicacaoService");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
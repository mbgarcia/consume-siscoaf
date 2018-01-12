
package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import main.wsdl.EnviarLoteComunicacaoResponse;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Application.class);
	}

	@Bean
	CommandLineRunner lookup(EnviarLoteComunicacaoClient client) {
		return args -> {
			String lote = "BR";

			if (args.length > 0) {
				lote = args[0];
			}
			

			lote = new String(Files.readAllBytes(Paths.get("xml.xml")));
			
			EnviarLoteComunicacaoResponse response = client.enviarLote(lote);
			
			System.err.println(response.getEnviarLoteComunicacaoResult());
			
			//from XML to Customer Object
			System.out.println("Convert Xml to Customer Object!");
			
//			String xml = response.getEnviarLoteComunicacaoResult();
//			
//			xml = xml.substring(xml.indexOf("<Table>"), xml.indexOf("</Table>") + 10);
//			
//			xml = xml.replaceAll("Table", "country");
//			
//			Country cust2 = (Country) xmlConverter.convertFromXMLToObject(xml);
//			System.out.println(cust2.toString());
//			System.out.println("Done");
		};
	}

}

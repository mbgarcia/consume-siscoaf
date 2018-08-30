package br.com.soap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.soap.wsdl.EnviarLoteComunicacaoResponse;

@SpringBootApplication
public class Application {
	StringBuilder lines = new StringBuilder();

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	CommandLineRunner lookup(EnviarLoteClient quoteClient) {
		return args -> {
			
			Path path = Paths.get("SISCOAF.xml");
						
			BufferedReader br = new BufferedReader(new FileReader("SISCOAF.xml"));
			
			String linha = null;
			
			while ((linha = br.readLine()) != null){
				lines.append(linha);
			}
			
			br.close();
						
			EnviarLoteComunicacaoResponse response = quoteClient.sendLote(lines.toString());
			System.err.println(response.getReturn());
		};
	}	
}

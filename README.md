## Serviço do SisCoaf

O serviço de envio de comunicações para o SisCoaf atende nas seguintes URLs

|  Ambiente   | Endereço                                                                          |
| ----------- | --------------------------------------------------------------------------------- |
| Homologação | https://treina.siscoaf2.fazenda.gov.br/siscoaf-internet/ComunicacaoService?wsdl   |
| Produção    | https://siscoaf.fazenda.gov.br/siscoaf-internet/ComunicacaoService?wsdl           |

## Geração das classes de comunicação com o serviço do Siscoaf

Para gerar os stubs utilizados para se comunicar com o serviço, use o comando maven:

```
mvn clean package
```

IMPORTANTE: As classes serão geradas e armazenadas na pasta **target/generated-sources**

## Disparando requisições para o SisCoaf

Conceitualmente, o SisCoaf trabalha as requisições como comunicações. E para fazê-las, simplesmente, monte o XML do lote e dispare o método desejado:

```
public class EnviarLoteClient extends WebServiceGatewaySupport {

	public EnviarLoteComunicacaoResponse sendLote(String lote) {
		EnviarLoteComunicacao request = new EnviarLoteComunicacao();
		request.setLote(lote);

		JAXBElement<EnviarLoteComunicacaoResponse> response = (JAXBElement) getWebServiceTemplate()
				.marshalSendAndReceive("https://treina.siscoaf2.fazenda.gov.br/siscoaf-internet/ComunicacaoService", request);
		
		return new EnviarLoteComunicacaoResponse();
	}
}
```

Provavelmente, ocorrerá o seguinte erro:

```
sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
```

O que indica ser necessário importar o certificado para o keystore

Abra o navegador (Chrome / Firefox)

Clique no cadeado ao lado da URL: https://treina.siscoaf2.fazenda.gov.br/siscoaf-internet/ComunicacaoService?wsdl

Visualize os detalhes do certificado e exporte-o. Aqui usamos o formato CER

Antes de importar o certificado para a JVM, faça um backup do arquivo original.

```
keytool -import -alias example -keystore  C:\Program Files (x86)\Java\jrexxx\lib\security\cacerts -file siscoaf.cer
```

A senha default, quando solicitada, é **changeit**


 

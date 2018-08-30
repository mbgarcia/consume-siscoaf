Ao empacotar o projeto, cheque a pasta target/generated-sources

Possivel erro:

. sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target

É necessário importar o certificado para o keystore

Abra o navegador (Chrome / Firefox)

Clique no cadeado ao lado da URL: https://treina.siscoaf2.fazenda.gov.br/siscoaf-internet/ComunicacaoService?wsdl

Visualize os detalhes do certificado e exporte-o. Aqui usamos o formato CER

Antes de importar o certificado para a JVM, faça um backup do arquivo original.

keytool -import -alias example -keystore  C:\Program Files (x86)\Java\jrexxx\lib\security\cacerts -file siscoaf.cer

You will be asked for password which default is changeit


 
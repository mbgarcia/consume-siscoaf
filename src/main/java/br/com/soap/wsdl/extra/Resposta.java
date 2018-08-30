package br.com.soap.wsdl.extra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "RESPOSTA")
public class Resposta {

    @XmlElement(name="STATUS")
    protected String status;
    
    @XmlElement(name="MENSAGENS")
    protected Mensagens mensagens;
    
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Mensagens getMensagens() {
		return mensagens;
	}
	public void setMensagens(Mensagens mensagens) {
		this.mensagens = mensagens;
	}
}
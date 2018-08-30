package br.com.soap.wsdl.extra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="MENSAGEM")
@XmlAccessorType(XmlAccessType.FIELD)
public class Mensagem {
	
	@XmlElement(name="COMUNICACAOORIGEM")
	public String comunicacaoOrigem;
	
	@XmlElement(name="ERRO")
	public String erro;
	
	@XmlElement(name="DESCRICAO")
	public String descricao;

	public String getComunicacaoOrigem() {
		return comunicacaoOrigem;
	}

	public void setComunicacaoOrigem(String comunicacaoOrigem) {
		this.comunicacaoOrigem = comunicacaoOrigem;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}

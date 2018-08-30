//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.08.28 às 10:38:04 AM GFT 
//


package br.com.soap.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.soap.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CancelarLoteComunicacao_QNAME = new QName("http://www.coaf.fazenda.gov.br/", "CancelarLoteComunicacao");
    private final static QName _CancelarLoteComunicacaoResponse_QNAME = new QName("http://www.coaf.fazenda.gov.br/", "CancelarLoteComunicacaoResponse");
    private final static QName _EnviarLoteComunicacao_QNAME = new QName("http://www.coaf.fazenda.gov.br/", "EnviarLoteComunicacao");
    private final static QName _EnviarLoteComunicacaoResponse_QNAME = new QName("http://www.coaf.fazenda.gov.br/", "EnviarLoteComunicacaoResponse");
    private final static QName _ReciboLoteComunicacao_QNAME = new QName("http://www.coaf.fazenda.gov.br/", "ReciboLoteComunicacao");
    private final static QName _ReciboLoteComunicacaoResponse_QNAME = new QName("http://www.coaf.fazenda.gov.br/", "ReciboLoteComunicacaoResponse");
    private final static QName _RetificarLoteComunicacao_QNAME = new QName("http://www.coaf.fazenda.gov.br/", "RetificarLoteComunicacao");
    private final static QName _RetificarLoteComunicacaoResponse_QNAME = new QName("http://www.coaf.fazenda.gov.br/", "RetificarLoteComunicacaoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.soap.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CancelarLoteComunicacao }
     * 
     */
    public CancelarLoteComunicacao createCancelarLoteComunicacao() {
        return new CancelarLoteComunicacao();
    }

    /**
     * Create an instance of {@link CancelarLoteComunicacaoResponse }
     * 
     */
    public CancelarLoteComunicacaoResponse createCancelarLoteComunicacaoResponse() {
        return new CancelarLoteComunicacaoResponse();
    }

    /**
     * Create an instance of {@link EnviarLoteComunicacao }
     * 
     */
    public EnviarLoteComunicacao createEnviarLoteComunicacao() {
        return new EnviarLoteComunicacao();
    }

    /**
     * Create an instance of {@link EnviarLoteComunicacaoResponse }
     * 
     */
    public EnviarLoteComunicacaoResponse createEnviarLoteComunicacaoResponse() {
        return new EnviarLoteComunicacaoResponse();
    }

    /**
     * Create an instance of {@link ReciboLoteComunicacao }
     * 
     */
    public ReciboLoteComunicacao createReciboLoteComunicacao() {
        return new ReciboLoteComunicacao();
    }

    /**
     * Create an instance of {@link ReciboLoteComunicacaoResponse }
     * 
     */
    public ReciboLoteComunicacaoResponse createReciboLoteComunicacaoResponse() {
        return new ReciboLoteComunicacaoResponse();
    }

    /**
     * Create an instance of {@link RetificarLoteComunicacao }
     * 
     */
    public RetificarLoteComunicacao createRetificarLoteComunicacao() {
        return new RetificarLoteComunicacao();
    }

    /**
     * Create an instance of {@link RetificarLoteComunicacaoResponse }
     * 
     */
    public RetificarLoteComunicacaoResponse createRetificarLoteComunicacaoResponse() {
        return new RetificarLoteComunicacaoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarLoteComunicacao }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelarLoteComunicacao }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.coaf.fazenda.gov.br/", name = "CancelarLoteComunicacao")
    public JAXBElement<CancelarLoteComunicacao> createCancelarLoteComunicacao(CancelarLoteComunicacao value) {
        return new JAXBElement<CancelarLoteComunicacao>(_CancelarLoteComunicacao_QNAME, CancelarLoteComunicacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarLoteComunicacaoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelarLoteComunicacaoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.coaf.fazenda.gov.br/", name = "CancelarLoteComunicacaoResponse")
    public JAXBElement<CancelarLoteComunicacaoResponse> createCancelarLoteComunicacaoResponse(CancelarLoteComunicacaoResponse value) {
        return new JAXBElement<CancelarLoteComunicacaoResponse>(_CancelarLoteComunicacaoResponse_QNAME, CancelarLoteComunicacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarLoteComunicacao }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnviarLoteComunicacao }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.coaf.fazenda.gov.br/", name = "EnviarLoteComunicacao")
    public JAXBElement<EnviarLoteComunicacao> createEnviarLoteComunicacao(EnviarLoteComunicacao value) {
        return new JAXBElement<EnviarLoteComunicacao>(_EnviarLoteComunicacao_QNAME, EnviarLoteComunicacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarLoteComunicacaoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnviarLoteComunicacaoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.coaf.fazenda.gov.br/", name = "EnviarLoteComunicacaoResponse")
    public JAXBElement<EnviarLoteComunicacaoResponse> createEnviarLoteComunicacaoResponse(EnviarLoteComunicacaoResponse value) {
        return new JAXBElement<EnviarLoteComunicacaoResponse>(_EnviarLoteComunicacaoResponse_QNAME, EnviarLoteComunicacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReciboLoteComunicacao }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReciboLoteComunicacao }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.coaf.fazenda.gov.br/", name = "ReciboLoteComunicacao")
    public JAXBElement<ReciboLoteComunicacao> createReciboLoteComunicacao(ReciboLoteComunicacao value) {
        return new JAXBElement<ReciboLoteComunicacao>(_ReciboLoteComunicacao_QNAME, ReciboLoteComunicacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReciboLoteComunicacaoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReciboLoteComunicacaoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.coaf.fazenda.gov.br/", name = "ReciboLoteComunicacaoResponse")
    public JAXBElement<ReciboLoteComunicacaoResponse> createReciboLoteComunicacaoResponse(ReciboLoteComunicacaoResponse value) {
        return new JAXBElement<ReciboLoteComunicacaoResponse>(_ReciboLoteComunicacaoResponse_QNAME, ReciboLoteComunicacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetificarLoteComunicacao }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetificarLoteComunicacao }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.coaf.fazenda.gov.br/", name = "RetificarLoteComunicacao")
    public JAXBElement<RetificarLoteComunicacao> createRetificarLoteComunicacao(RetificarLoteComunicacao value) {
        return new JAXBElement<RetificarLoteComunicacao>(_RetificarLoteComunicacao_QNAME, RetificarLoteComunicacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetificarLoteComunicacaoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetificarLoteComunicacaoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.coaf.fazenda.gov.br/", name = "RetificarLoteComunicacaoResponse")
    public JAXBElement<RetificarLoteComunicacaoResponse> createRetificarLoteComunicacaoResponse(RetificarLoteComunicacaoResponse value) {
        return new JAXBElement<RetificarLoteComunicacaoResponse>(_RetificarLoteComunicacaoResponse_QNAME, RetificarLoteComunicacaoResponse.class, null, value);
    }

}

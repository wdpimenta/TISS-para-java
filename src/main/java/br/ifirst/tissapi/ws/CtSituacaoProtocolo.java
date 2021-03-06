
package br.ifirst.tissapi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_situacaoProtocolo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_situacaoProtocolo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
 *         &lt;element name="situacaoDoProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_protocoloStatus"/>
 *         &lt;element name="situacaoProtocoloAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_protocoloAnexoStatus"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_situacaoProtocolo", propOrder = {
    "mensagemErro",
    "situacaoDoProtocolo",
    "situacaoProtocoloAnexo"
})
public class CtSituacaoProtocolo {

    protected CtMotivoGlosa mensagemErro;
    protected CtProtocoloStatus situacaoDoProtocolo;
    protected CtProtocoloAnexoStatus situacaoProtocoloAnexo;

    /**
     * Obtém o valor da propriedade mensagemErro.
     * 
     * @return
     *     possible object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public CtMotivoGlosa getMensagemErro() {
        return mensagemErro;
    }

    /**
     * Define o valor da propriedade mensagemErro.
     * 
     * @param value
     *     allowed object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public void setMensagemErro(CtMotivoGlosa value) {
        this.mensagemErro = value;
    }

    /**
     * Obtém o valor da propriedade situacaoDoProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link CtProtocoloStatus }
     *     
     */
    public CtProtocoloStatus getSituacaoDoProtocolo() {
        return situacaoDoProtocolo;
    }

    /**
     * Define o valor da propriedade situacaoDoProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProtocoloStatus }
     *     
     */
    public void setSituacaoDoProtocolo(CtProtocoloStatus value) {
        this.situacaoDoProtocolo = value;
    }

    /**
     * Obtém o valor da propriedade situacaoProtocoloAnexo.
     * 
     * @return
     *     possible object is
     *     {@link CtProtocoloAnexoStatus }
     *     
     */
    public CtProtocoloAnexoStatus getSituacaoProtocoloAnexo() {
        return situacaoProtocoloAnexo;
    }

    /**
     * Define o valor da propriedade situacaoProtocoloAnexo.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProtocoloAnexoStatus }
     *     
     */
    public void setSituacaoProtocoloAnexo(CtProtocoloAnexoStatus value) {
        this.situacaoProtocoloAnexo = value;
    }

}

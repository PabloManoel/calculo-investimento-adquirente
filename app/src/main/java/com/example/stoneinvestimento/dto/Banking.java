package com.example.stoneinvestimento.dto;

public class Banking {

    private Float mensalidadeConta;
    private Float pixMensal;
    private Float portalIntegrado;
    private Float conciliacaoVendas;

    public Banking(){
        mensalidadeConta = new Float(0);
        pixMensal = new Float(0);
        portalIntegrado = new Float(0);
        conciliacaoVendas = new Float(0);
    }

    public Float getMensalidadeConta() {
        return mensalidadeConta;
    }

    public void setMensalidadeConta(Float mensalidadeConta) {
        this.mensalidadeConta = mensalidadeConta;
    }

    public Float getPixMensal() {
        return pixMensal;
    }

    public void setPixMensal(Float pixMensal) {
        this.pixMensal = pixMensal;
    }

    public Float getPortalIntegrado() {
        return portalIntegrado;
    }

    public void setPortalIntegrado(Float portalIntegrado) {
        this.portalIntegrado = portalIntegrado;
    }

    public Float getConciliacaoVendas() {
        return conciliacaoVendas;
    }

    public void setConciliacaoVendas(Float conciliacaoVendas) {
        this.conciliacaoVendas = conciliacaoVendas;
    }

    public Float calculateTotal(){
        return mensalidadeConta
                + pixMensal
                + portalIntegrado
                + conciliacaoVendas;
    }
}

package com.example.stoneinvestimento.dto;

public class Payment {

    private Float tpv;
    private Float share;
    private Float debito;
    private Float creditoAVista;
    private Float parcelamento2a6;
    private Float parcelamento7a12;
    private Float antecipacao;
    private Float mensalidade;

    public Float getTpv() {
        return tpv;
    }

    public void setTpv(Float tpv) {
        this.tpv = tpv;
    }

    public Float getShare() {
        return share;
    }

    public void setShare(Float share) {
        this.share = share;
    }

    public Float getDebito() {
        return debito;
    }

    public void setDebito(Float debito) {
        this.debito = debito;
    }

    public Float getCreditoAVista() {
        return creditoAVista;
    }

    public void setCreditoAVista(Float creditoAVista) {
        this.creditoAVista = creditoAVista;
    }

    public Float getParcelamento2a6() {
        return parcelamento2a6;
    }

    public void setParcelamento2a6(Float parcelamento2a6) {
        this.parcelamento2a6 = parcelamento2a6;
    }

    public Float getParcelamento7a12() {
        return parcelamento7a12;
    }

    public void setParcelamento7a12(Float parcelamento7a12) {
        this.parcelamento7a12 = parcelamento7a12;
    }

    public Float getAntecipacao() {
        return antecipacao;
    }

    public void setAntecipacao(Float antecipacao) {
        this.antecipacao = antecipacao;
    }

    public Float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Float mensalidade) {
        this.mensalidade = mensalidade;
    }
}

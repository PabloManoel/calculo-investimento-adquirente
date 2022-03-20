package com.example.stoneinvestimento.dto;

public class Seguro {

    private Float vida;
    private Float patrimonial;

    public Seguro(){
        vida = new Float(0);
        patrimonial = new Float(0);
    }

    public Float getVida() {
        return vida;
    }

    public void setVida(Float vida) {
        this.vida = vida;
    }

    public Float getPatrimonial() {
        return patrimonial;
    }

    public void setPatrimonial(Float patrimonial) {
        this.patrimonial = patrimonial;
    }

    public Float calculateTotal(){
        return vida + patrimonial;
    }

}

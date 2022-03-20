package com.example.stoneinvestimento.service;

import com.example.stoneinvestimento.dto.Seguro;
import com.example.stoneinvestimento.interfaces.SeguroServiceInterface;

public class SeguroService implements SeguroServiceInterface {

    @Override
    public Float calculateVida(Seguro currentSeguro, Seguro stoneSeguro) {
        return currentSeguro.getVida() - stoneSeguro.getVida();
    }

    @Override
    public Float calculatePatrimonial(Seguro currentSeguro, Seguro stoneSeguro) {
        return currentSeguro.getPatrimonial() - stoneSeguro.getPatrimonial();
    }

    @Override
    public Float compareTotal(Seguro currentSeguro, Seguro stoneSeguro) {
        return calculateVida(currentSeguro, stoneSeguro)
            + calculatePatrimonial(currentSeguro, stoneSeguro);
    }
}

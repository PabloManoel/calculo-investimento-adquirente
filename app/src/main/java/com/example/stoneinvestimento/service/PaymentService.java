package com.example.stoneinvestimento.service;

import com.example.stoneinvestimento.dto.Payment;
import com.example.stoneinvestimento.interfaces.PaymentServiceInterface;

public class PaymentService implements PaymentServiceInterface {

    @Override
    public Float calculateDebito(Payment currentPayment, Payment stonePayment) {
        return currentPayment.getDebito() - stonePayment.getDebito();
    }

    @Override
    public Float calculateCreditoVista(Payment currentPayment, Payment stonePayment) {
        return currentPayment.getCreditoAVista() - stonePayment.getCreditoAVista();
    }

    @Override
    public Float calculateParcelamento2a6(Payment currentPayment, Payment stonePayment) {
        return currentPayment.getParcelamento2a6() - stonePayment.getParcelamento2a6();
    }

    @Override
    public Float calculateParcelamento7a12(Payment currentPayment, Payment stonePayment) {
        return currentPayment.getParcelamento2a6() - stonePayment.getParcelamento2a6();
    }

    @Override
    public Float calculateAntecipacao(Payment currentPayment, Payment stonePayment) {
        return currentPayment.getAntecipacao() - stonePayment.getAntecipacao();
    }

    @Override
    public Float calculateMensalidade(Payment currentPayment, Payment stonePayment) {
        return currentPayment.getMensalidade() - stonePayment.getMensalidade();
    }

    @Override
    public Float compareTotal(Payment currentPayment, Payment stonePayment) {
        return calculateDebito(currentPayment, stonePayment)
            + calculateCreditoVista(currentPayment, stonePayment)
            + calculateParcelamento2a6(currentPayment, stonePayment)
            + calculateParcelamento7a12(currentPayment, stonePayment)
            + calculateAntecipacao(currentPayment, stonePayment)
            + calculateMensalidade(currentPayment, stonePayment);
    }
}

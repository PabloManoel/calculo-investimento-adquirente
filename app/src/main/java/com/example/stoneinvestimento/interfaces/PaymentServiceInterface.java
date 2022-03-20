package com.example.stoneinvestimento.interfaces;

import com.example.stoneinvestimento.dto.Payment;

public interface PaymentServiceInterface {

    Float calculateDebito(Payment currentPayment, Payment stonePayment);
    Float calculateCreditoVista(Payment currentPayment, Payment stonePayment);
    Float calculateParcelamento2a6(Payment currentPayment, Payment stonePayment);
    Float calculateParcelamento7a12(Payment currentPayment, Payment stonePayment);
    Float calculateAntecipacao(Payment currentPayment, Payment stonePayment);
    Float calculateMensalidade(Payment currentPayment, Payment stonePayment);
    Float compareTotal(Payment currentPayment, Payment stonePayment);
}

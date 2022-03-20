package com.example.stoneinvestimento.interfaces;

import com.example.stoneinvestimento.dto.Seguro;

public interface SeguroServiceInterface {

    Float calculateVida(Seguro currentSeguro, Seguro stoneSeguro);
    Float calculatePatrimonial(Seguro currentSeguro, Seguro stoneSeguro);
    Float compareTotal(Seguro currentSeguro, Seguro stoneSeguro);
}

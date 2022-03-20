package com.example.stoneinvestimento.interfaces;

import com.example.stoneinvestimento.dto.Banking;

public interface BankingServiceInterface {

    Float calculateMensalidadeConta(Banking currentBanking, Banking stoneBanking);
    Float calculatePixMensal(Banking currentBanking, Banking stoneBanking);
    Float calculatePortalIntegrado(Banking currentBanking, Banking stoneBanking);
    Float calculateConciliacaoVendas(Banking currentBanking, Banking stoneBanking);
    Float compareTotal(Banking currentBanking, Banking stoneBanking);
}

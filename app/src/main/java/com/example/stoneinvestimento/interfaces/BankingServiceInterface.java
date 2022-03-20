package com.example.stoneinvestimento.interfaces;

import com.example.stoneinvestimento.dto.Banking;

public interface BankingServiceInterface {

    static Float calculateMensalidadeConta(Banking currentBanking, Banking stoneBanking) {
        return currentBanking.getMensalidadeConta() - stoneBanking.getMensalidadeConta();
    }

    static Float calculatePixMensal(Banking currentBanking, Banking stoneBanking) {
        return currentBanking.getPixMensal() - stoneBanking.getPixMensal();
    }

    static Float calculatePortalIntegrado(Banking currentBanking, Banking stoneBanking) {
        return currentBanking.getPortalIntegrado() - stoneBanking.getPortalIntegrado();
    }

    static Float calculateConciliacaoVendas(Banking currentBanking, Banking stoneBanking) {
        return currentBanking.getConciliacaoVendas() - stoneBanking.getConciliacaoVendas();
    }

    static Float compareTotal(Banking currentBanking, Banking stoneBanking) {
        return calculateMensalidadeConta(currentBanking, stoneBanking)
                + calculatePixMensal(currentBanking, stoneBanking)
                + calculatePortalIntegrado(currentBanking, stoneBanking)
                + calculateConciliacaoVendas(currentBanking, stoneBanking);
    }
}

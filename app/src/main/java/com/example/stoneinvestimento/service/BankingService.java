package com.example.stoneinvestimento.service;

import com.example.stoneinvestimento.dto.Banking;
import com.example.stoneinvestimento.interfaces.BankingServiceInterface;

public class BankingService implements BankingServiceInterface {

    @Override
    public Float calculateMensalidadeConta(Banking currentBanking, Banking stoneBanking) {
        return currentBanking.getMensalidadeConta() - stoneBanking.getMensalidadeConta();
    }

    @Override
    public Float calculatePixMensal(Banking currentBanking, Banking stoneBanking) {
        return currentBanking.getPixMensal() - stoneBanking.getPixMensal();
    }

    @Override
    public Float calculatePortalIntegrado(Banking currentBanking, Banking stoneBanking) {
        return currentBanking.getPortalIntegrado() - stoneBanking.getPortalIntegrado();
    }

    @Override
    public Float calculateConciliacaoVendas(Banking currentBanking, Banking stoneBanking) {
        return currentBanking.getConciliacaoVendas() - stoneBanking.getConciliacaoVendas();
    }

    @Override
    public Float compareTotal(Banking currentBanking, Banking stoneBanking) {
        return calculateMensalidadeConta(currentBanking, stoneBanking)
                + calculatePixMensal(currentBanking, stoneBanking)
                + calculatePortalIntegrado(currentBanking, stoneBanking)
                + calculateConciliacaoVendas(currentBanking, stoneBanking);
    }
}

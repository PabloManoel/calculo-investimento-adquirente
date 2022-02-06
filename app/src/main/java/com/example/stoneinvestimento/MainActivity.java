package com.example.stoneinvestimento;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private EditText mensalidadeContaAtual;
    private EditText mensalidadeContaStone;
    private EditText mensalidadeContaTotal;
    private EditText pixMensalAtual;
    private EditText pixMensalStone;
    private EditText pixMensalTotal;
    private EditText portalIntegradoAtual;
    private EditText portalIntegradoStone;
    private EditText portalIntegradoTotal;
    private EditText conciliacaoVendasAtual;
    private EditText conciliacaoVendasStone;
    private EditText conciliacaoVendasTotal;
    private EditText debitoAtual;
    private EditText debitoStone;
    private EditText debitoTotal;
    private EditText debitoShare;
    private EditText creditoAVistaAtual;
    private EditText creditoAVistaStone;
    private EditText creditoAVistaTotal;
    private EditText creditoAVistaShare;
    private EditText vezes2p6Atual;
    private EditText vezes2p6Stone;
    private EditText vezes2p6Total;
    private EditText vezes2p6Share;
    private EditText vezes7p12Atual;
    private EditText vezes7p12Stone;
    private EditText vezes7p12Total;
    private EditText vezes7p12Share;
    private EditText antecipacaoAtual;
    private EditText antecipacaoStone;
    private EditText antecipacaoTotal;
    private EditText antecipacaoShare;
    private EditText mensalidadeAtual;
    private EditText mensalidadeStone;
    private EditText mensalidadeTotal;
    private EditText mensalidadeShare;
    private EditText tpv;
    private ToggleButton shareType;

    private TextView txt_title_banking_id;
    private TextView txt_title_payments_id;

    private TextView txt_total_banking_id;
    private TextView txt_total_payments_id;

    private ConstraintLayout body_banking_id;
    private ConstraintLayout body_payments_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensalidadeContaAtual = (EditText) findViewById(R.id.mensalidade_conta_atual_id);
        mensalidadeContaStone = (EditText) findViewById(R.id.mensalidade_conta_stone_id);
        mensalidadeContaTotal = (EditText) findViewById(R.id.mensalidade_conta_total_id);

        pixMensalAtual = (EditText) findViewById(R.id.pix_mensal_atual_id);
        pixMensalStone = (EditText) findViewById(R.id.pix_mensal_stone_id);
        pixMensalTotal = (EditText) findViewById(R.id.pix_mensal_total_id);

        portalIntegradoAtual = (EditText) findViewById(R.id.portal_integrado_atual_id);
        portalIntegradoStone = (EditText) findViewById(R.id.portal_integrado_stone_id);
        portalIntegradoTotal = (EditText) findViewById(R.id.portal_integrado_total_id);

        conciliacaoVendasAtual = (EditText) findViewById(R.id.conciliacao_vendas_atual_id);
        conciliacaoVendasStone = (EditText) findViewById(R.id.conciliacao_vendas_stone_id);
        conciliacaoVendasTotal = (EditText) findViewById(R.id.conciliacao_vendas_total_id);

        debitoAtual = (EditText) findViewById(R.id.debito_atual_id);
        debitoStone = (EditText) findViewById(R.id.debito_stone_id);
        debitoTotal = (EditText) findViewById(R.id.debito_total_id);
        debitoShare = (EditText) findViewById(R.id.debito_share_id);

        creditoAVistaAtual = (EditText) findViewById(R.id.credito_a_vista_atual_id);
        creditoAVistaStone = (EditText) findViewById(R.id.credito_a_vista_stone_id);
        creditoAVistaTotal = (EditText) findViewById(R.id.credito_a_vista_total_id);
        creditoAVistaShare = (EditText) findViewById(R.id.credito_a_vista_share_id);

        vezes2p6Atual = (EditText) findViewById(R.id.vezes_2_6_atual_id);
        vezes2p6Stone = (EditText) findViewById(R.id.vezes_2_6_stone_id);
        vezes2p6Total = (EditText) findViewById(R.id.vezes_2_6_total_id);
        vezes2p6Share = (EditText) findViewById(R.id.vezes_2_6_share_id);

        vezes7p12Atual = (EditText) findViewById(R.id.vezes_7_12_atual_id);
        vezes7p12Stone = (EditText) findViewById(R.id.vezes_7_12_stone_id);
        vezes7p12Total = (EditText) findViewById(R.id.vezes_7_12_total_id);
        vezes7p12Share = (EditText) findViewById(R.id.vezes_7_12_share_id);

        antecipacaoAtual = (EditText) findViewById(R.id.antecipacao_atual_id);
        antecipacaoStone = (EditText) findViewById(R.id.antecipacao_stone_id);
        antecipacaoTotal = (EditText) findViewById(R.id.antecipacao_total_id);
        antecipacaoShare = (EditText) findViewById(R.id.antecipacao_share_id);

        mensalidadeAtual = (EditText) findViewById(R.id.mensalidade_atual_id);
        mensalidadeStone = (EditText) findViewById(R.id.mensalidade_stone_id);
        mensalidadeTotal = (EditText) findViewById(R.id.mensalidade_total_id);
        mensalidadeShare = (EditText) findViewById(R.id.mensalidade_share_id);

        shareType = (ToggleButton) findViewById(R.id.share_type_toggle_id);

        tpv = (EditText) findViewById(R.id.tpv_id);
        validateInputIsNotNull(tpv);

        txt_title_banking_id = (TextView) findViewById(R.id.txt_title_banking_id);
        txt_title_payments_id = (TextView) findViewById(R.id.txt_title_pagamento_id);

        txt_total_banking_id = (TextView) findViewById(R.id.txt_total_banking_id);
        txt_total_payments_id = (TextView) findViewById(R.id.txt_total_payments_id);

        body_banking_id = (ConstraintLayout) findViewById((R.id.banking_body_id));
        body_payments_id = (ConstraintLayout) findViewById((R.id.pagamentos_body_id));

        setEvents();
    }

    private void setEvents(){
        setMensalidadeContaEvent();
        setPixMensalEvent();
        setPortalIntegradoEvent();
        setConciliacaoVendasEvent();

        setDebitPaymentEvent();
        setCreditAtSightEvent();
        setTimes2p6Event();
        setTimes7p12Event();
        setAntecipacaoEvent();
        setMensalidadeEvent();

        setShareTypeEvent();

        setExpandadleHeaderTitleEvent(txt_title_banking_id, body_banking_id);
        setExpandadleHeaderTitleEvent(txt_title_payments_id, body_payments_id);
    }

    private void setExpandadleHeaderTitleEvent(TextView headerTitle, ConstraintLayout body){
        headerTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                body.setVisibility(body.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
            }
        });
    };

    private void setShareTypeEvent(){
        shareType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText[] shareInputs = {debitoShare, creditoAVistaShare, vezes2p6Share, vezes7p12Share, antecipacaoShare, mensalidadeShare};

                convertShareValues(shareInputs);

                Arrays.stream(shareInputs).forEach(EditText::performClick);
            }
        });
    }

    private void refreshBankingTotal(){
        Float totalValue = Float.parseFloat(mensalidadeContaTotal.getText().toString())
                + Float.parseFloat(pixMensalTotal.getText().toString())
                + Float.parseFloat(portalIntegradoTotal.getText().toString())
                + Float.parseFloat(conciliacaoVendasTotal.getText().toString());

        txt_total_banking_id.setText("Total = " + totalValue.toString());
    }

    private void refreshPaymentsTotal(){
        Float totalValue = Float.parseFloat(debitoTotal.getText().toString())
                + Float.parseFloat(creditoAVistaTotal.getText().toString())
                + Float.parseFloat(vezes2p6Total.getText().toString())
                + Float.parseFloat(vezes7p12Total.getText().toString())
                + Float.parseFloat(antecipacaoTotal.getText().toString())
                + Float.parseFloat(mensalidadeTotal.getText().toString());

        txt_total_payments_id.setText("Total = " + totalValue.toString());
    }

    private void setMensalidadeContaEvent(){
        mensalidadeContaAtual.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(mensalidadeContaAtual);
                compareBankingAccounts(mensalidadeContaAtual, mensalidadeContaStone, mensalidadeContaTotal);
                validateSubTotal(mensalidadeContaTotal);
            }
        });

        mensalidadeContaStone.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(mensalidadeContaStone);
                compareBankingAccounts(mensalidadeContaAtual, mensalidadeContaStone, mensalidadeContaTotal);
                validateSubTotal(mensalidadeContaTotal);
            }
        });
    }

    private void setPixMensalEvent(){
        pixMensalAtual.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(pixMensalAtual);
                compareBankingAccounts(pixMensalAtual, pixMensalStone, pixMensalTotal);
                validateSubTotal(pixMensalTotal);
            }
        });

        pixMensalStone.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(pixMensalStone);
                compareBankingAccounts(pixMensalAtual, pixMensalStone, pixMensalTotal);
                validateSubTotal(pixMensalTotal);
            }
        });
    }

    private void setPortalIntegradoEvent(){
        portalIntegradoAtual.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(portalIntegradoAtual);
                compareBankingAccounts(portalIntegradoAtual, portalIntegradoStone, portalIntegradoTotal);
                validateSubTotal(portalIntegradoTotal);
            }
        });

        portalIntegradoStone.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(portalIntegradoStone);
                compareBankingAccounts(portalIntegradoAtual, portalIntegradoStone, portalIntegradoTotal);
                validateSubTotal(portalIntegradoTotal);
            }
        });
    }

    private void setConciliacaoVendasEvent(){
        conciliacaoVendasAtual.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(conciliacaoVendasAtual);
                compareBankingAccounts(conciliacaoVendasAtual, conciliacaoVendasStone, conciliacaoVendasTotal);
                validateSubTotal(conciliacaoVendasTotal);
            }
        });

        conciliacaoVendasStone.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(conciliacaoVendasStone);
                compareBankingAccounts(conciliacaoVendasAtual, conciliacaoVendasStone, conciliacaoVendasTotal);
                validateSubTotal(conciliacaoVendasTotal);
            }
        });
    }

    private void setDebitPaymentEvent(){
        debitoAtual.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(debitoAtual);
                comparePaymentAccounts(tpv, debitoShare, debitoAtual, debitoStone, debitoTotal);
                validateSubTotal(debitoTotal);
            }
        });

        debitoStone.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(debitoStone);
                comparePaymentAccounts(tpv, debitoShare, debitoAtual, debitoStone, debitoTotal);
                validateSubTotal(debitoTotal);
            }
        });

        debitoShare.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(debitoShare);
                comparePaymentAccounts(tpv, debitoShare, debitoAtual, debitoStone, debitoTotal);
                validateSubTotal(debitoTotal);
            }
        });
    }

    private void setCreditAtSightEvent(){
        creditoAVistaAtual.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(creditoAVistaAtual);
                comparePaymentAccounts(tpv, creditoAVistaShare, creditoAVistaAtual, creditoAVistaStone, creditoAVistaTotal);
                validateSubTotal(creditoAVistaTotal);
            }
        });

        creditoAVistaStone.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(creditoAVistaStone);
                comparePaymentAccounts(tpv, creditoAVistaShare, creditoAVistaAtual, creditoAVistaStone, creditoAVistaTotal);
                validateSubTotal(creditoAVistaTotal);
            }
        });

        creditoAVistaShare.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(creditoAVistaShare);
                comparePaymentAccounts(tpv, creditoAVistaShare, creditoAVistaAtual, creditoAVistaStone, creditoAVistaTotal);
                validateSubTotal(creditoAVistaTotal);
            }
        });
    }

    private void setTimes2p6Event(){
        vezes2p6Atual.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(vezes2p6Atual);
                comparePaymentAccounts(tpv, vezes2p6Share, vezes2p6Atual, vezes2p6Stone, vezes2p6Total);
                validateSubTotal(vezes2p6Total);
            }
        });

        vezes2p6Stone.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(vezes2p6Stone);
                comparePaymentAccounts(tpv, vezes2p6Share, vezes2p6Atual, vezes2p6Stone, vezes2p6Total);
                validateSubTotal(vezes2p6Total);
            }
        });

        vezes2p6Share.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(vezes2p6Share);
                comparePaymentAccounts(tpv, vezes2p6Share, vezes2p6Atual, vezes2p6Stone, vezes2p6Total);
                validateSubTotal(vezes2p6Total);
            }
        });
    }

    private void setTimes7p12Event(){
        vezes7p12Atual.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(vezes7p12Atual);
                comparePaymentAccounts(tpv, vezes7p12Share, vezes7p12Atual, vezes7p12Stone, vezes7p12Total);
                validateSubTotal(vezes7p12Total);
            }
        });

        vezes7p12Stone.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(vezes7p12Stone);
                comparePaymentAccounts(tpv, vezes7p12Share, vezes7p12Atual, vezes7p12Stone, vezes7p12Total);
                validateSubTotal(vezes7p12Total);
            }
        });

        vezes7p12Share.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(vezes7p12Share);
                comparePaymentAccounts(tpv, vezes7p12Share, vezes7p12Atual, vezes7p12Stone, vezes7p12Total);
                validateSubTotal(vezes7p12Total);
            }
        });
    }

    private void setAntecipacaoEvent(){
        antecipacaoAtual.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(antecipacaoAtual);
                comparePaymentAccounts(tpv, antecipacaoShare, antecipacaoAtual, antecipacaoStone, antecipacaoTotal);
                validateSubTotal(antecipacaoTotal);
            }
        });

        antecipacaoStone.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(antecipacaoStone);
                comparePaymentAccounts(tpv, antecipacaoShare, antecipacaoAtual, antecipacaoStone, antecipacaoTotal);
                validateSubTotal(antecipacaoTotal);
            }
        });

        antecipacaoShare.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(antecipacaoShare);
                comparePaymentAccounts(tpv, antecipacaoShare, antecipacaoAtual, antecipacaoStone, antecipacaoTotal);
                validateSubTotal(antecipacaoTotal);
            }
        });
    }

    private void setMensalidadeEvent(){
        mensalidadeAtual.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(mensalidadeAtual);
                comparePaymentAccounts(tpv, mensalidadeShare, mensalidadeAtual, mensalidadeStone, mensalidadeTotal);
                validateSubTotal(mensalidadeTotal);
            }
        });

        mensalidadeStone.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(mensalidadeStone);
                comparePaymentAccounts(tpv, mensalidadeShare, mensalidadeAtual, mensalidadeStone, mensalidadeTotal);
                validateSubTotal(mensalidadeTotal);
            }
        });

        mensalidadeShare.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(mensalidadeShare);
                comparePaymentAccounts(tpv, mensalidadeShare, mensalidadeAtual, mensalidadeStone, mensalidadeTotal);
                validateSubTotal(mensalidadeTotal);
            }
        });
    }

    private void comparePaymentAccounts(EditText tpv, EditText share, EditText current, EditText stone, EditText total){
        Float result = calculatePayments(tpv, share, current, stone);
        addResultToTotalField(result, total);
        refreshPaymentsTotal();
    }

    private void compareBankingAccounts(EditText atual, EditText stone, EditText total){
        Float result = calculateBanking(atual, stone);
        addResultToTotalField(result, total);
        refreshBankingTotal();
    }

    private void validateSubTotal(EditText subtotal){
        Float subtotalFloat = Float.parseFloat(subtotal.getText().toString());
        if (subtotalFloat > 0){
            subtotal.setTextColor(Color.GREEN);
        } else if (subtotalFloat < 0){
            subtotal.setTextColor(Color.RED);
        } else {
            subtotal.setTextColor(Color.BLACK);
        }
    }

    private void validateInputIsNotNull(EditText input){
        if (input.getText().toString().trim().length() == 0) {
            input.setText("0.0");
        }
    }

    private Float calculateBanking (EditText first, EditText second){
        return Float.parseFloat(first.getText().toString()) - Float.parseFloat(second.getText().toString());
    }

    private Float calculatePayments(EditText tpv, EditText share, EditText current, EditText stone){

        if (shareType.isChecked()){
            System.out.println("checked");
            System.out.println(shareType.getText().toString());
            return calculatePaymentsWithNumericShare(tpv, share, current, stone);

        } else {
            System.out.println("unchecked");
            System.out.println(shareType.getText().toString());
            return calculatePaymentsWithPercentShare(tpv, share, current, stone);
        }

    }

    private Float calculatePaymentsWithPercentShare(EditText tpv, EditText share, EditText current, EditText stone){
        Float shareValue = (Float.parseFloat(share.getText().toString()) * Float.parseFloat(tpv.getText().toString())) / 100;

        Float currentValue = (Float.parseFloat(current.getText().toString()) * shareValue) / 100;

        Float stoneValue = (Float.parseFloat(stone.getText().toString()) * shareValue) / 100;

        return currentValue - stoneValue;
    }

    private Float calculatePaymentsWithNumericShare(EditText tpv, EditText share, EditText current, EditText stone){
        Float shareValue = Float.parseFloat(share.getText().toString());

        Float currentValue = (Float.parseFloat(current.getText().toString()) * shareValue) / 100;

        Float stoneValue = (Float.parseFloat(stone.getText().toString()) * shareValue) / 100;

        return currentValue - stoneValue;
    }

    private void convertShareValues(EditText[] shareInputs){
        Float newValue;
        for (EditText share: shareInputs){
            if (shareType.isChecked()){
                newValue = convertPercentShareToNumeric(share, tpv);
                share.setText(newValue.toString());
            } else {
                newValue = convertNumericShareToPercent(share, tpv);
                share.setText(newValue.toString());
            }
        }
    }

    private Float convertPercentShareToNumeric(EditText share, EditText tpv){
        return (Float.parseFloat(tpv.getText().toString()) * Float.parseFloat(share.getText().toString()) ) / 100;
    }

    private Float convertNumericShareToPercent(EditText share, EditText tpv){
        return (Float.parseFloat(share.getText().toString()) * 100) / Float.parseFloat(tpv.getText().toString());
    }

    private void addResultToTotalField(Float sum, EditText totalField){
        totalField.setText(sum.toString());
    }
}
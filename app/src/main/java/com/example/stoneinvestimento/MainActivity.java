package com.example.stoneinvestimento;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.stoneinvestimento.activity.BankingActivity;
import com.example.stoneinvestimento.activity.PaymentActivity;
import com.example.stoneinvestimento.activity.PaymentShareActivity;
import com.example.stoneinvestimento.activity.SeguroActivity;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    
    private TextView txt_title_banking_id;
    private TextView txt_title_payments_id;
    private TextView txt_title_seguros_id;

    private TextView txt_total_banking_id;
    private TextView txt_total_payments_id;
    private TextView txt_total_seguros_id;

    private ConstraintLayout body_banking_id;
    private ConstraintLayout body_payments_id;
    private ConstraintLayout body_seguros_id;

    private Button btn_refresh_result;

    private EditText resultado_atual_id;
    private EditText resultado_stone_id;
    private EditText resultado_total_id;

    PaymentActivity currentPaymentActivity = new PaymentActivity();
    PaymentActivity stonePaymentActivity = new PaymentActivity();
    PaymentActivity totalPaymentActivity = new PaymentActivity();
    PaymentShareActivity paymentShareActivity = new PaymentShareActivity();
    BankingActivity currentBankingActivity = new BankingActivity();
    BankingActivity stoneBankingActivity = new BankingActivity();
    BankingActivity totalBankingActivity = new BankingActivity();
    SeguroActivity currentSeguroActivity = new SeguroActivity();
    SeguroActivity stoneSeguroActivity = new SeguroActivity();
    SeguroActivity totalSeguroActivity = new SeguroActivity();

    private static String DEFAULT_VALUE = "0.0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentPaymentActivity.setMensalidade((EditText)findViewById(R.id.mensalidade_atual_id));
        currentPaymentActivity.setDebito((EditText) findViewById(R.id.debito_atual_id));
        currentPaymentActivity.setCreditoAVista((EditText) findViewById(R.id.credito_a_vista_atual_id));
        currentPaymentActivity.setAntecipacao(findViewById(R.id.antecipacao_atual_id));
        currentPaymentActivity.setParcelamento2a6((EditText) findViewById(R.id.vezes_2_6_atual_id));
        currentPaymentActivity.setParcelamento7a12((EditText) findViewById(R.id.vezes_7_12_atual_id));
        currentPaymentActivity.setEvents();

        stonePaymentActivity.setMensalidade((EditText) findViewById(R.id.mensalidade_stone_id));
        stonePaymentActivity.setDebito((EditText) findViewById(R.id.debito_stone_id));
        stonePaymentActivity.setCreditoAVista((EditText) findViewById(R.id.credito_a_vista_stone_id));
        stonePaymentActivity.setAntecipacao((EditText) findViewById(R.id.antecipacao_stone_id));
        stonePaymentActivity.setParcelamento2a6((EditText) findViewById(R.id.vezes_2_6_stone_id));
        stonePaymentActivity.setParcelamento7a12((EditText) findViewById(R.id.vezes_7_12_stone_id));
        stonePaymentActivity.setEvents();

        totalPaymentActivity.setMensalidade((EditText) findViewById(R.id.mensalidade_total_id));
        totalPaymentActivity.setDebito((EditText) findViewById(R.id.debito_total_id));
        totalPaymentActivity.setCreditoAVista((EditText) findViewById(R.id.credito_a_vista_total_id));
        totalPaymentActivity.setAntecipacao((EditText) findViewById(R.id.antecipacao_total_id));
        totalPaymentActivity.setParcelamento2a6((EditText) findViewById(R.id.vezes_2_6_total_id));
        totalPaymentActivity.setParcelamento7a12((EditText) findViewById(R.id.vezes_7_12_total_id));
        totalPaymentActivity.setEvents();

        paymentShareActivity.setDebitoShare((EditText) findViewById(R.id.debito_share_id));
        paymentShareActivity.setCreditoAVistaShare((EditText) findViewById(R.id.credito_a_vista_share_id));
        paymentShareActivity.setParcelamento2a6Share((EditText) findViewById(R.id.vezes_2_6_share_id));
        paymentShareActivity.setParcelamento7a12Share((EditText) findViewById(R.id.vezes_7_12_share_id));
        paymentShareActivity.setAntecipacaoShare((EditText) findViewById(R.id.antecipacao_share_id));
        paymentShareActivity.setMensalidadeShare((EditText) findViewById(R.id.mensalidade_share_id));
        paymentShareActivity.setShareType((ToggleButton) findViewById(R.id.share_type_toggle_id));
        paymentShareActivity.setTpv((EditText) findViewById(R.id.tpv_id));
        paymentShareActivity.setEvents();
        // -- events ? //

        currentBankingActivity.setPixMensal((EditText) findViewById(R.id.pix_mensal_atual_id));
        currentBankingActivity.setPortalIntegrado((EditText) findViewById(R.id.portal_integrado_atual_id));
        currentBankingActivity.setConciliacaoVendas((EditText) findViewById(R.id.conciliacao_vendas_atual_id));
        currentBankingActivity.setMensalidadeConta((EditText) findViewById(R.id.mensalidade_conta_atual_id));
        currentBankingActivity.setEvents();

        stoneBankingActivity.setPixMensal((EditText) findViewById(R.id.pix_mensal_stone_id));
        stoneBankingActivity.setPortalIntegrado((EditText) findViewById(R.id.portal_integrado_stone_id));
        stoneBankingActivity.setConciliacaoVendas((EditText) findViewById(R.id.conciliacao_vendas_stone_id));
        stoneBankingActivity.setMensalidadeConta((EditText) findViewById(R.id.mensalidade_conta_stone_id));
        stoneBankingActivity.setEvents();

        totalBankingActivity.setPixMensal(findViewById(R.id.pix_mensal_total_id));
        totalBankingActivity.setPortalIntegrado((EditText) findViewById(R.id.portal_integrado_total_id));
        totalBankingActivity.setConciliacaoVendas((EditText) findViewById(R.id.conciliacao_vendas_total_id));
        totalBankingActivity.setMensalidadeConta((EditText) findViewById(R.id.mensalidade_conta_total_id));
        totalBankingActivity.setEvents();

        currentSeguroActivity.setVida((EditText) findViewById(R.id.vida_atual_id));
        currentSeguroActivity.setPatrimonial((EditText) findViewById(R.id.patrimonial_atual_id));
        currentSeguroActivity.setEvents();

        stoneSeguroActivity.setVida((EditText) findViewById(R.id.vida_stone_id));
        stoneSeguroActivity.setPatrimonial((EditText) findViewById(R.id.patrimonial_stone_id));
        stoneSeguroActivity.setEvents();

        totalSeguroActivity.setVida((EditText) findViewById(R.id.vida_total_id));
        totalSeguroActivity.setPatrimonial((EditText) findViewById(R.id.patrimonial_total_id));
        totalSeguroActivity.setEvents();

        // -- //


        txt_title_banking_id = (TextView) findViewById(R.id.txt_title_banking_id);
        txt_title_payments_id = (TextView) findViewById(R.id.txt_title_pagamento_id);
        txt_title_seguros_id = (TextView) findViewById(R.id.txt_title_seguros_id);

        txt_total_banking_id = (TextView) findViewById(R.id.txt_total_banking_id);
        txt_total_payments_id = (TextView) findViewById(R.id.txt_total_payments_id);
        txt_total_seguros_id = (TextView) findViewById(R.id.txt_total_seguros_id);

        body_banking_id = (ConstraintLayout) findViewById(R.id.banking_body_id);
        body_payments_id = (ConstraintLayout) findViewById(R.id.pagamentos_body_id);
        body_seguros_id = (ConstraintLayout) findViewById(R.id.seguros_body_id);

        btn_refresh_result = (Button) findViewById(R.id.btn_refresh_result);

        resultado_atual_id = (EditText) findViewById(R.id.resultado_atual_id);
        resultado_stone_id = (EditText) findViewById(R.id.resultado_stone_id);
        resultado_total_id = (EditText) findViewById(R.id.resultado_total_id);
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

//        setShareTypeEvent();

        setExpandadleHeaderTitleEvent(txt_title_banking_id, body_banking_id);
        setExpandadleHeaderTitleEvent(txt_title_payments_id, body_payments_id);
        setExpandadleHeaderTitleEvent(txt_title_seguros_id, body_seguros_id);

        setSeguroPatrimonialEvent();
        setSeguroVidaEvent();

        setButtonTotalEvent();
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

    }

    private void refreshBankingTotal(){
        Float totalValue = totalBankingActivity.getBanking().calculateTotal();
        txt_total_banking_id.setText("Total = " + totalValue.toString());
    }

    private void refreshPaymentsTotal(){
        Float totalValue = totalPaymentActivity.getPayment().calculateTotal();
        txt_total_payments_id.setText("Total = " + totalValue.toString());
    }

    private void refreshSegurosTotal(){
        Float totalValue = totalSeguroActivity.getSeguro().calculateTotal();
        txt_total_seguros_id.setText("Total = " + totalValue.toString());
    }


    private void setMensalidadeContaEvent(){

        currentBankingActivity.getMensalidadeConta().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(currentBankingActivity.getMensalidadeConta());
                compareBankingAccounts(currentBankingActivity.getMensalidadeConta(),
                        stoneBankingActivity.getMensalidadeConta(), totalBankingActivity.getMensalidadeConta());
                validateSubTotal(totalBankingActivity.getMensalidadeConta());
            }
        });

        stoneBankingActivity.getMensalidadeConta().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(stoneBankingActivity.getMensalidadeConta());
                compareBankingAccounts(currentBankingActivity.getMensalidadeConta(),
                        stoneBankingActivity.getMensalidadeConta(), totalBankingActivity.getMensalidadeConta());
                validateSubTotal(totalBankingActivity.getMensalidadeConta());
            }
        });
    }

    private void setPixMensalEvent() {
        currentBankingActivity.getPixMensal().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(currentBankingActivity.getPixMensal());
                compareBankingAccounts(currentBankingActivity.getPixMensal(),
                        stoneBankingActivity.getPixMensal(), totalBankingActivity.getPixMensal());
                validateSubTotal(totalBankingActivity.getPixMensal());
            }
        });

        stoneBankingActivity.getPixMensal().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(stoneBankingActivity.getPixMensal());
                compareBankingAccounts(currentBankingActivity.getPixMensal(),
                        stoneBankingActivity.getPixMensal(), totalBankingActivity.getPixMensal());
                validateSubTotal(totalBankingActivity.getPixMensal());
            }
        });
    }

    private void setPortalIntegradoEvent(){
        currentBankingActivity.getPortalIntegrado().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( currentBankingActivity.getPortalIntegrado() );
                compareBankingAccounts(currentBankingActivity.getPortalIntegrado(),
                        stoneBankingActivity.getPortalIntegrado(), totalBankingActivity.getPortalIntegrado());
                validateSubTotal(totalBankingActivity.getPortalIntegrado());
            }
        });

        stoneBankingActivity.getPortalIntegrado().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( stoneBankingActivity.getPortalIntegrado() );

                compareBankingAccounts(currentBankingActivity.getPortalIntegrado(),
                        stoneBankingActivity.getPortalIntegrado(), totalBankingActivity.getPortalIntegrado());
                validateSubTotal(totalBankingActivity.getPortalIntegrado());
            }
        });
    }

    private void setConciliacaoVendasEvent(){
        currentBankingActivity.getConciliacaoVendas().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( currentBankingActivity.getConciliacaoVendas() );

                compareBankingAccounts(currentBankingActivity.getConciliacaoVendas(),
                        stoneBankingActivity.getConciliacaoVendas(), totalBankingActivity.getConciliacaoVendas());
                validateSubTotal(totalBankingActivity.getConciliacaoVendas());
            }
        });

        stoneBankingActivity.getConciliacaoVendas().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( stoneBankingActivity.getConciliacaoVendas() );

                compareBankingAccounts(currentBankingActivity.getConciliacaoVendas(),
                        stoneBankingActivity.getConciliacaoVendas(), totalBankingActivity.getConciliacaoVendas());
                validateSubTotal(totalBankingActivity.getConciliacaoVendas());
            }
        });
    }

    private void setDebitPaymentEvent(){
        currentPaymentActivity.getDebito().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( currentPaymentActivity.getDebito() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getDebitoShare(), currentPaymentActivity.getDebito(),
                        stonePaymentActivity.getDebito(), totalPaymentActivity.getDebito());
                validateSubTotal(totalPaymentActivity.getDebito());
            }
        });

        stonePaymentActivity.getDebito().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( stonePaymentActivity.getDebito() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getDebitoShare(), currentPaymentActivity.getDebito(),
                        stonePaymentActivity.getDebito(), totalPaymentActivity.getDebito());
                validateSubTotal(totalPaymentActivity.getDebito());
            }
        });

        paymentShareActivity.getDebitoShare().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( paymentShareActivity.getDebitoShare() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getDebitoShare(), currentPaymentActivity.getDebito(),
                        stonePaymentActivity.getDebito(), totalPaymentActivity.getDebito());
                validateSubTotal(totalPaymentActivity.getDebito());
            }
        });

        paymentShareActivity.getDebitoShare().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                validateInputIsNotNull( paymentShareActivity.getDebitoShare() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getDebitoShare(), currentPaymentActivity.getDebito(),
                        stonePaymentActivity.getDebito(), totalPaymentActivity.getDebito());
                validateSubTotal(totalPaymentActivity.getDebito());
            }
        });
    }

    private void setCreditAtSightEvent(){
        currentPaymentActivity.getCreditoAVista().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( currentPaymentActivity.getCreditoAVista() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getCreditoAVistaShare(),
                        currentPaymentActivity.getCreditoAVista(),
                        stonePaymentActivity.getCreditoAVista(), totalPaymentActivity.getCreditoAVista());
                validateSubTotal(totalPaymentActivity.getCreditoAVista());
            }
        });

        stonePaymentActivity.getCreditoAVista().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( stonePaymentActivity.getCreditoAVista() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getCreditoAVistaShare(), currentPaymentActivity.getCreditoAVista(),
                        stonePaymentActivity.getCreditoAVista(), totalPaymentActivity.getCreditoAVista());
                validateSubTotal(totalPaymentActivity.getCreditoAVista());
            }
        });

        paymentShareActivity.getCreditoAVistaShare().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( paymentShareActivity.getCreditoAVistaShare() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getCreditoAVistaShare(), currentPaymentActivity.getCreditoAVista(),
                        stonePaymentActivity.getCreditoAVista(), totalPaymentActivity.getCreditoAVista());
                validateSubTotal(totalPaymentActivity.getCreditoAVista());
            }
        });

        paymentShareActivity.getCreditoAVistaShare().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                validateInputIsNotNull( paymentShareActivity.getCreditoAVistaShare() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getCreditoAVistaShare(), currentPaymentActivity.getCreditoAVista(),
                        stonePaymentActivity.getCreditoAVista(), totalPaymentActivity.getCreditoAVista());
                validateSubTotal(totalPaymentActivity.getCreditoAVista());
            }
        });
    }

    private void setTimes2p6Event(){
        totalPaymentActivity.getParcelamento2a6().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( totalPaymentActivity.getParcelamento2a6() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getParcelamento2a6Share(), totalPaymentActivity.getParcelamento2a6(),
                        stonePaymentActivity.getParcelamento2a6(), totalPaymentActivity.getParcelamento2a6());
                validateSubTotal(totalPaymentActivity.getParcelamento2a6());
            }
        });

        stonePaymentActivity.getParcelamento2a6().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( stonePaymentActivity.getParcelamento2a6() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getParcelamento2a6Share(), totalPaymentActivity.getParcelamento2a6(),
                        stonePaymentActivity.getParcelamento2a6(), totalPaymentActivity.getParcelamento2a6());
                validateSubTotal(totalPaymentActivity.getParcelamento2a6());
            }
        });

        paymentShareActivity.getParcelamento2a6Share().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( paymentShareActivity.getParcelamento2a6Share() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getParcelamento2a6Share(), totalPaymentActivity.getParcelamento2a6(),
                        stonePaymentActivity.getParcelamento2a6(), totalPaymentActivity.getParcelamento2a6());
                validateSubTotal(totalPaymentActivity.getParcelamento2a6());
            }
        });

        paymentShareActivity.getParcelamento2a6Share().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                validateInputIsNotNull( paymentShareActivity.getParcelamento2a6Share() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getParcelamento2a6Share(), totalPaymentActivity.getParcelamento2a6(),
                        stonePaymentActivity.getParcelamento2a6(), totalPaymentActivity.getParcelamento2a6());
                validateSubTotal(totalPaymentActivity.getParcelamento2a6());
            }
        });
    }

    private void setTimes7p12Event(){
        currentPaymentActivity.getParcelamento7a12().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( currentPaymentActivity.getParcelamento7a12() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getParcelamento7a12Share(), currentPaymentActivity.getParcelamento7a12(),
                        stonePaymentActivity.getParcelamento7a12(), totalPaymentActivity.getParcelamento7a12());
                validateSubTotal(totalPaymentActivity.getParcelamento7a12());
            }
        });

        stonePaymentActivity.getParcelamento7a12().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( stonePaymentActivity.getParcelamento7a12() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getParcelamento7a12Share(), currentPaymentActivity.getParcelamento7a12(),
                        stonePaymentActivity.getParcelamento7a12(), totalPaymentActivity.getParcelamento7a12());
                validateSubTotal(totalPaymentActivity.getParcelamento7a12());
            }
        });

        paymentShareActivity.getParcelamento7a12Share().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( paymentShareActivity.getParcelamento7a12Share() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getParcelamento7a12Share(), currentPaymentActivity.getParcelamento7a12(),
                        stonePaymentActivity.getParcelamento7a12(), totalPaymentActivity.getParcelamento7a12());
                validateSubTotal(totalPaymentActivity.getParcelamento7a12());
            }
        });

        paymentShareActivity.getParcelamento7a12Share().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                validateInputIsNotNull( paymentShareActivity.getParcelamento7a12Share() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getParcelamento7a12Share(), currentPaymentActivity.getParcelamento7a12(),
                        stonePaymentActivity.getParcelamento7a12(), totalPaymentActivity.getParcelamento7a12());
                validateSubTotal(totalPaymentActivity.getParcelamento7a12());
            }
        });
    }

    private void setAntecipacaoEvent(){
        currentPaymentActivity.getAntecipacao().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( currentPaymentActivity.getAntecipacao() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getAntecipacaoShare(), currentPaymentActivity.getAntecipacao(),
                        stonePaymentActivity.getAntecipacao(), totalPaymentActivity.getAntecipacao());
                validateSubTotal(totalPaymentActivity.getAntecipacao());
            }
        });

        stonePaymentActivity.getAntecipacao().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( stonePaymentActivity.getAntecipacao() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getAntecipacaoShare(), currentPaymentActivity.getAntecipacao(),
                        stonePaymentActivity.getAntecipacao(), totalPaymentActivity.getAntecipacao());
                validateSubTotal(totalPaymentActivity.getAntecipacao());
            }
        });

        paymentShareActivity.getAntecipacaoShare().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( paymentShareActivity.getAntecipacaoShare() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getAntecipacaoShare(), currentPaymentActivity.getAntecipacao(),
                        stonePaymentActivity.getAntecipacao(), totalPaymentActivity.getAntecipacao());
                validateSubTotal(totalPaymentActivity.getAntecipacao());
            }
        });

        paymentShareActivity.getAntecipacaoShare().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                validateInputIsNotNull( paymentShareActivity.getAntecipacaoShare() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getAntecipacaoShare(), currentPaymentActivity.getAntecipacao(),
                        stonePaymentActivity.getAntecipacao(), totalPaymentActivity.getAntecipacao());
                validateSubTotal(totalPaymentActivity.getAntecipacao());
            }
        });
    }

    private void setMensalidadeEvent(){
        currentPaymentActivity.getMensalidade().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( currentPaymentActivity.getMensalidade() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getMensalidadeShare(), currentPaymentActivity.getMensalidade(),
                        stonePaymentActivity.getMensalidade(), totalPaymentActivity.getMensalidade());
                validateSubTotal(totalPaymentActivity.getMensalidade());
            }
        });

        stonePaymentActivity.getMensalidade().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( stonePaymentActivity.getMensalidade() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getMensalidadeShare(), currentPaymentActivity.getMensalidade(),
                        stonePaymentActivity.getMensalidade(), totalPaymentActivity.getMensalidade());
                validateSubTotal(totalPaymentActivity.getMensalidade());
            }
        });

        paymentShareActivity.getMensalidadeShare().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( paymentShareActivity.getMensalidadeShare() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getMensalidadeShare(), currentPaymentActivity.getMensalidade(),
                        stonePaymentActivity.getMensalidade(), totalPaymentActivity.getMensalidade());
                validateSubTotal(totalPaymentActivity.getMensalidade());
            }
        });

        paymentShareActivity.getMensalidadeShare().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                validateInputIsNotNull( paymentShareActivity.getMensalidadeShare() );

                comparePaymentAccounts(paymentShareActivity.getTpv(), paymentShareActivity.getMensalidadeShare(), currentPaymentActivity.getMensalidade(),
                        stonePaymentActivity.getMensalidade(), totalPaymentActivity.getMensalidade());
                validateSubTotal(totalPaymentActivity.getMensalidade());
            }
        });
    }

    private void setSeguroVidaEvent() {
        currentSeguroActivity.getVida().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( currentSeguroActivity.getVida() );

                compareSegurosAccounts(currentSeguroActivity.getVida(),
                        stoneSeguroActivity.getVida(), totalSeguroActivity.getVida());
                validateSubTotal(totalSeguroActivity.getVida());
            }
        });

        stoneSeguroActivity.getVida().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( stoneSeguroActivity.getVida() );

                compareSegurosAccounts(currentSeguroActivity.getVida(),
                        stoneSeguroActivity.getVida(), totalSeguroActivity.getVida());
                validateSubTotal(totalSeguroActivity.getVida());
            }
        });
    }

    private void setSeguroPatrimonialEvent() {
        currentSeguroActivity.getPatrimonial().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( currentSeguroActivity.getPatrimonial() );

                compareSegurosAccounts(currentSeguroActivity.getPatrimonial(),
                        stoneSeguroActivity.getPatrimonial(), totalSeguroActivity.getPatrimonial());
                validateSubTotal(totalSeguroActivity.getPatrimonial());
            }
        });

        stoneSeguroActivity.getPatrimonial().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull( stoneSeguroActivity.getPatrimonial() );

                compareSegurosAccounts(currentSeguroActivity.getPatrimonial(),
                        stoneSeguroActivity.getPatrimonial(), totalSeguroActivity.getPatrimonial());
                validateSubTotal(totalSeguroActivity.getPatrimonial());
            }
        });
    }

    private void setButtonTotalEvent() {
        btn_refresh_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float currentTotal = currentBankingActivity.getBanking().calculateTotal()
                        + currentPaymentActivity.getPayment().calculateTotal()
                        + currentSeguroActivity.getSeguro().calculateTotal();

                Float stoneTotal = stoneBankingActivity.getBanking().calculateTotal()
                        + stonePaymentActivity.getPayment().calculateTotal()
                        + stoneSeguroActivity.getSeguro().calculateTotal();

                Float total = currentTotal - stoneTotal;

                resultado_atual_id.setText(currentTotal.toString());
                resultado_stone_id.setText(stoneTotal.toString());
                resultado_total_id.setText(total.toString());
                validateSubTotal(resultado_total_id);
                validateSubTotal(resultado_stone_id);
                validateSubTotal(resultado_atual_id);


            }
        });
    }

    private void compareSegurosAccounts(EditText current, EditText stone, EditText total){
        Float result = calculateSeguros(current, stone);
        addResultToTotalField(result, total);
        refreshSegurosTotal();
    }

    private void comparePaymentAccounts(EditText tpv, EditText share, EditText current, EditText stone, EditText total){
        Float result = calculatePayments(paymentShareActivity.getTpv(), share, current, stone);
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

    private Float calculateBanking (EditText first, EditText second){
        return Float.parseFloat(first.getText().toString()) - Float.parseFloat(second.getText().toString());
    }

    private Float calculatePayments(EditText tpv, EditText share, EditText current, EditText stone){

        if (paymentShareActivity.getShareType().isChecked()){
            System.out.println("checked");
            System.out.println(paymentShareActivity.getShareType().getText().toString());
            return calculatePaymentsWithNumericShare(paymentShareActivity.getTpv(), share, current, stone);

        } else {
            System.out.println("unchecked");
            System.out.println(paymentShareActivity.getShareType().getText().toString());
            return calculatePaymentsWithPercentShare(paymentShareActivity.getTpv(), share, current, stone);
        }

    }

    private Float calculateSeguros(EditText current, EditText stone){
        return Float.parseFloat(current.getText().toString()) - Float.parseFloat(stone.getText().toString());
    }

    private Float calculatePaymentsWithPercentShare(EditText tpv, EditText share, EditText current, EditText stone){
        Float shareValue = (Float.parseFloat(share.getText().toString()) * Float.parseFloat(paymentShareActivity.getTpv().getText().toString())) / 100;

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

    private void addResultToTotalField(Float sum, EditText totalField){
        totalField.setText(sum.toString());
    }

    private void validateInputIsNotNull(EditText input){
        try {
            if (input.getText().toString().trim().length() == 0) {
                input.setText(DEFAULT_VALUE);
            }
        } catch (Exception ex){
            System.err.println("Erro ao validar campo não nulo");
        }
    }

}
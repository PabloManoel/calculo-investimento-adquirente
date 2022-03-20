package com.example.stoneinvestimento.activity;

import android.view.View;
import android.widget.EditText;

import com.example.stoneinvestimento.dto.Payment;

public class PaymentActivity {

    private EditText debito;
    private EditText creditoAVista;
    private EditText parcelamento2a6;
    private EditText parcelamento7a12;
    private EditText antecipacao;
    private EditText mensalidade;

    private Payment payment;

    private static String DEFAULT_VALUE = "0.0";

    public PaymentActivity(){
        payment = new Payment();
    }

    public void setEvents(){
        debito.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(debito);
                payment.setDebito(Float.parseFloat(debito.getText().toString()));
            }
        });

        creditoAVista.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(creditoAVista);
                payment.setDebito(Float.parseFloat(creditoAVista.getText().toString()));
            }
        });

        parcelamento2a6.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(parcelamento2a6);
                payment.setDebito(Float.parseFloat(parcelamento2a6.getText().toString()));
            }
        });

        parcelamento7a12.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(parcelamento7a12);
                payment.setDebito(Float.parseFloat(parcelamento7a12.getText().toString()));
            }
        });

        antecipacao.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(antecipacao);
                payment.setDebito(Float.parseFloat(antecipacao.getText().toString()));
            }
        });

        mensalidade.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(mensalidade);
                payment.setDebito(Float.parseFloat(mensalidade.getText().toString()));
            }
        });
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

    public EditText getDebito() {
        return debito;
    }

    public void setDebito(EditText debito) {
        this.debito = debito;
    }

    public EditText getCreditoAVista() {
        return creditoAVista;
    }

    public void setCreditoAVista(EditText creditoAVista) {
        this.creditoAVista = creditoAVista;
    }

    public EditText getParcelamento2a6() {
        return parcelamento2a6;
    }

    public void setParcelamento2a6(EditText parcelamento2a6) {
        this.parcelamento2a6 = parcelamento2a6;
    }

    public EditText getParcelamento7a12() {
        return parcelamento7a12;
    }

    public void setParcelamento7a12(EditText parcelamento7a12) {
        this.parcelamento7a12 = parcelamento7a12;
    }

    public EditText getAntecipacao() {
        return antecipacao;
    }

    public void setAntecipacao(EditText antecipacao) {
        this.antecipacao = antecipacao;
    }

    public EditText getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(EditText mensalidade) {
        this.mensalidade = mensalidade;
    }

    public Payment getPayment() {
        return payment;
    }
}

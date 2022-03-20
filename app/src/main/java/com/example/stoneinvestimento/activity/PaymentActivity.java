package com.example.stoneinvestimento.activity;

import android.text.Editable;
import android.text.TextWatcher;
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

    public void setEvents() {
        debito.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                payment.setDebito(Float.parseFloat(debito.getText().toString()));
            }
        });

        creditoAVista.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                payment.setCreditoAVista(Float.parseFloat(creditoAVista.getText().toString()));
            }
        });

        parcelamento2a6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                payment.setParcelamento2a6(Float.parseFloat(parcelamento2a6.getText().toString()));
            }
        });

        parcelamento7a12.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                payment.setParcelamento7a12(Float.parseFloat(parcelamento7a12.getText().toString()));
            }
        });

        antecipacao.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                payment.setAntecipacao(Float.parseFloat(antecipacao.getText().toString()));
            }
        });

        mensalidade.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                payment.setMensalidade(Float.parseFloat(mensalidade.getText().toString()));
            }
        });
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

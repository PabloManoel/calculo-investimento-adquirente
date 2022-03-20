package com.example.stoneinvestimento.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.Arrays;

public class PaymentActivity {

    private EditText debito;
    private EditText creditoAVista;
    private EditText parcelamento2a6;
    private EditText parcelamento7a12;
    private EditText antecipacao;
    private EditText mensalidade;

    private static String DEFAULT_VALUE = "0.0";


    public void setEvents(){
        debito.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(debito);
            }
        });

        creditoAVista.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(creditoAVista);
            }
        });

        parcelamento2a6.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(parcelamento2a6);
            }
        });

        parcelamento7a12.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(parcelamento7a12);
            }
        });

        antecipacao.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(antecipacao);
            }
        });

        mensalidade.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(mensalidade);
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

    public Float calculateTotal(){
        return Float.parseFloat(debito.getText().toString())
                + Float.parseFloat(creditoAVista.getText().toString())
                + Float.parseFloat(parcelamento2a6.getText().toString())
                + Float.parseFloat(parcelamento7a12.getText().toString())
                + Float.parseFloat(antecipacao.getText().toString())
                + Float.parseFloat(mensalidade.getText().toString());
    }

}

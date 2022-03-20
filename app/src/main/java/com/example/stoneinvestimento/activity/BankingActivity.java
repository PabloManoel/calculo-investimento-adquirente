package com.example.stoneinvestimento.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class BankingActivity {

    private EditText mensalidadeConta;
    private EditText pixMensal;
    private EditText portalIntegrado;
    private EditText conciliacaoVendas;

    private static String DEFAULT_VALUE = "0.0";

    public void setEvents() {
        mensalidadeConta.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(mensalidadeConta);
            }
        });
        pixMensal.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(pixMensal);
            }
        });
        portalIntegrado.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(portalIntegrado);
            }
        });
        conciliacaoVendas.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validateInputIsNotNull(conciliacaoVendas);
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

    public EditText getMensalidadeConta() {
        return mensalidadeConta;
    }

    public void setMensalidadeConta(EditText mensalidadeConta) {
        this.mensalidadeConta = mensalidadeConta;
    }

    public EditText getPixMensal() {
        return pixMensal;
    }

    public void setPixMensal(EditText pixMensal) {
        this.pixMensal = pixMensal;
    }

    public EditText getPortalIntegrado() {
        return portalIntegrado;
    }

    public void setPortalIntegrado(EditText portalIntegrado) {
        this.portalIntegrado = portalIntegrado;
    }

    public EditText getConciliacaoVendas() {
        return conciliacaoVendas;
    }

    public void setConciliacaoVendas(EditText conciliacaoVendas) {
        this.conciliacaoVendas = conciliacaoVendas;
    }

    public Float calculateTotal(){
        return Float.parseFloat(mensalidadeConta.getText().toString())
            + Float.parseFloat(pixMensal.getText().toString())
            + Float.parseFloat(portalIntegrado.getText().toString())
            + Float.parseFloat(conciliacaoVendas.getText().toString());
    }





}

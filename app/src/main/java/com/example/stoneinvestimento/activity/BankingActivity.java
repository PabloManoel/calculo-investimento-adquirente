package com.example.stoneinvestimento.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.stoneinvestimento.dto.Banking;

public class BankingActivity {

    private EditText mensalidadeConta;
    private EditText pixMensal;
    private EditText portalIntegrado;
    private EditText conciliacaoVendas;

    private Banking banking;

    private static String DEFAULT_VALUE = "0.0";

    public BankingActivity(){
        banking = new Banking();
    }

    public void setEvents() {
        mensalidadeConta.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                validateInputIsNotNull(mensalidadeConta);
                banking.setMensalidadeConta(Float.parseFloat(mensalidadeConta.getText().toString()));
            }
        });

        pixMensal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                validateInputIsNotNull(pixMensal);
                banking.setPixMensal(Float.parseFloat(pixMensal.getText().toString()));
            }
        });

        portalIntegrado.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                validateInputIsNotNull(portalIntegrado);
                banking.setPortalIntegrado(Float.parseFloat(portalIntegrado.getText().toString()));
            }
        });

        conciliacaoVendas.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                validateInputIsNotNull(conciliacaoVendas);
                banking.setConciliacaoVendas(Float.parseFloat(conciliacaoVendas.getText().toString()));
            }
        });
    }

    public Banking getBanking(){
        return banking;
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

    private void validateInputIsNotNull(EditText input){
        try {
            if (input.getText().toString().trim().length() == 0) {
                input.setText(DEFAULT_VALUE);
            }
        } catch (Exception ex){
            System.err.println("Erro ao validar campo n??o nulo");
        }
    }


}

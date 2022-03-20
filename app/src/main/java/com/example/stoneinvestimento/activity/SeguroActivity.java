package com.example.stoneinvestimento.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.stoneinvestimento.dto.Seguro;

public class SeguroActivity {

    private EditText vida;
    private EditText patrimonial;

    private Seguro seguro;

    private static String DEFAULT_VALUE = "0.0";

    public SeguroActivity(){
        seguro = new Seguro();
    }

    public void setEvents() {
        vida.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                validateInputIsNotNull(vida);
                seguro.setVida(Float.parseFloat(vida.getText().toString()));
            }
        });

        patrimonial.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                validateInputIsNotNull(patrimonial);
                seguro.setPatrimonial(Float.parseFloat(patrimonial.getText().toString()));
            }
        });

    }

    public Seguro getSeguro(){
        return seguro;
    }

    public EditText getVida() {
        return vida;
    }

    public void setVida(EditText vida) {
        this.vida = vida;
    }

    public EditText getPatrimonial() {
        return patrimonial;
    }

    public void setPatrimonial(EditText patrimonial) {
        this.patrimonial = patrimonial;
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

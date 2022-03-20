package com.example.stoneinvestimento.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ToggleButton;

import java.util.Arrays;

public class PaymentShareActivity {

    private EditText tpv;
    private EditText debitoShare;
    private EditText creditoAVistaShare;
    private EditText parcelamento2a6Share;
    private EditText parcelamento7a12Share;
    private EditText antecipacaoShare;
    private EditText mensalidadeShare;
    private ToggleButton shareType;

    private static String DEFAULT_VALUE = "0.0";

    public void setEvents(){
        shareType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText[] shareInputs = {debitoShare,
                        creditoAVistaShare,
                        parcelamento2a6Share,
                        parcelamento7a12Share,
                        antecipacaoShare,
                        mensalidadeShare};

                convertShareValues(shareInputs);

                for (EditText input : shareInputs) {
                    input.performClick();
                }
            }
        });

        tpv.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                validateInputIsNotNull(tpv);
            }

            @Override
            public void afterTextChanged(Editable editable) {}
        });
//
//        share.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                validateInputIsNotNull(share);
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {}
//        });


        debitoShare.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                validateInputIsNotNull(debitoShare);
            }

            @Override
            public void afterTextChanged(Editable editable) {}
        });

        creditoAVistaShare.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                validateInputIsNotNull(creditoAVistaShare);
            }

            @Override
            public void afterTextChanged(Editable editable) {}
        });

        parcelamento2a6Share.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                validateInputIsNotNull(parcelamento2a6Share);
            }

            @Override
            public void afterTextChanged(Editable editable) {}
        });

        parcelamento7a12Share.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                validateInputIsNotNull(parcelamento7a12Share);
            }

            @Override
            public void afterTextChanged(Editable editable) {}
        });

        antecipacaoShare.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                validateInputIsNotNull(antecipacaoShare);
            }

            @Override
            public void afterTextChanged(Editable editable) {}
        });

        mensalidadeShare.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                validateInputIsNotNull(mensalidadeShare);
            }

            @Override
            public void afterTextChanged(Editable editable) {}
        });
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


    public EditText getTpv() {
        return tpv;
    }

    public void setTpv(EditText tpv) {
        this.tpv = tpv;
    }

    public EditText getDebitoShare() {
        return debitoShare;
    }

    public void setDebitoShare(EditText debitoShare) {
        this.debitoShare = debitoShare;
    }

    public EditText getCreditoAVistaShare() {
        return creditoAVistaShare;
    }

    public void setCreditoAVistaShare(EditText creditoAVistaShare) {
        this.creditoAVistaShare = creditoAVistaShare;
    }

    public EditText getParcelamento2a6Share() {
        return parcelamento2a6Share;
    }

    public void setParcelamento2a6Share(EditText parcelamento2a6Share) {
        this.parcelamento2a6Share = parcelamento2a6Share;
    }

    public EditText getParcelamento7a12Share() {
        return parcelamento7a12Share;
    }

    public void setParcelamento7a12Share(EditText parcelamento7a12Share) {
        this.parcelamento7a12Share = parcelamento7a12Share;
    }

    public EditText getAntecipacaoShare() {
        return antecipacaoShare;
    }

    public void setAntecipacaoShare(EditText antecipacaoShare) {
        this.antecipacaoShare = antecipacaoShare;
    }

    public EditText getMensalidadeShare() {
        return mensalidadeShare;
    }

    public void setMensalidadeShare(EditText mensalidadeShare) {
        this.mensalidadeShare = mensalidadeShare;
    }

    public ToggleButton getShareType() {
        return shareType;
    }

    public void setShareType(ToggleButton shareType) {
        this.shareType = shareType;
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

package com.example.stoneinvestimento;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

import org.w3c.dom.Text;

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

    private void compareBankingAccounts(EditText atual, EditText stone, EditText total){
        Float result = subtract(atual, stone);
        addResultToTotalField(result, total);
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
            input.setText("0");
        }
    }

    private void setEvents(){
        setMensalidadeContaEvent();
        setPixMensalEvent();
        setPortalIntegradoEvent();
        setConciliacaoVendasEvent();
    }

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
        creditoAVistaStone = (EditText) findViewById(R.id.debito_stone_id);
        creditoAVistaTotal = (EditText) findViewById(R.id.debito_total_id);
        creditoAVistaShare = (EditText) findViewById(R.id.debito_share_id);

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

        tpv = (EditText) findViewById(R.id.tpv_id);
        validateInputIsNotNull(tpv);




        setEvents();
    }


    private Float subtract (EditText first, EditText second){
        return Float.parseFloat(first.getText().toString()) - Float.parseFloat(second.getText().toString());
    }

    private void addResultToTotalField(Float sum, EditText totalField){
        totalField.setText(sum.toString());
    }
}
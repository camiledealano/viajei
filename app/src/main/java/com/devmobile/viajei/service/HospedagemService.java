package com.devmobile.viajei.service;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class HospedagemService {

    /**
     * Calcula o custo total da hospedagem com base no custo médio por noite, quantidade de noites e número de quartos.
     *
     * @param custoMedio O custo médio da hospedagem por noite.
     * @param qtdNoites A quantidade de noites da estadia.
     * @param qtdQuartos A quantidade de quartos reservados.
     * @return O custo total da hospedagem.
     */
    public String calcularTotalHospedagem(Double custoMedio, Integer qtdNoites, Integer qtdQuartos) {
        double total = custoMedio * qtdNoites * qtdQuartos;
        DecimalFormat df = new DecimalFormat("###,##0.00", new DecimalFormatSymbols(Locale.getDefault()));
        return df.format(total);
    }
}
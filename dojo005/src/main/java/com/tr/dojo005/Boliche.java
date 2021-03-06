package com.tr.dojo005;

import java.util.List;

/**
 * Kata: Placar de boliche
 * 
 * @see http
 *      ://dojopi.wordpress.com/2009/09/01/problema-para-o-dojo-teresina-004-
 *      boliche
 * 
 */
public class Boliche {

    /**
     * @param jogadas
     * @return
     */
    public int calcularResultadoPlacar(List<Jogada> jogadas) {
        int soma = 0;

        boolean aconteceuSpare = false;
        boolean aconteceuStrike1 = false;
        boolean aconteceuStrike2 = false;

        for (int i = 0; i < jogadas.size(); i++) {

            Jogada jogada = jogadas.get(i);

            if (i >= 10) {
                if (aconteceuStrike2) {
                    soma += jogada.getJogada1();
                }
                soma += jogada.getJogada1() + jogada.getJogada2();
            } else {
                if (aconteceuStrike2) {
                    soma += jogada.getJogada1();
                }

                aconteceuStrike2 = false;

                if (aconteceuSpare) {
                    soma += jogada.getJogada1();
                } else if (aconteceuStrike1) {
                    soma += jogada.getJogada1() + jogada.getJogada2();
                    aconteceuStrike2 = jogada.isStrike();
                }

                soma += jogada.getJogada1() + jogada.getJogada2();
                aconteceuSpare = jogada.isSpare();
                aconteceuStrike1 = jogada.isStrike();
            }
        }

        return soma;
    }

}

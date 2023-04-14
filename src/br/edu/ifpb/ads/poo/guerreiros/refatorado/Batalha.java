package br.edu.ifpb.ads.poo.guerreiros.refatorado;

import java.util.Random;

public class Batalha implements Combatente {
    private Guerreiro guerreiro;

    public Batalha(Guerreiro guerreiro) {
        this.guerreiro = guerreiro;

    }

    @Override
    public int atacar() {
        Random dano = new Random();
        return dano.nextInt(2);
    }

    @Override
    public int lutar(Guerreiro guerreiro) {
        do {
            int dano1 = atacar();

            if (dano1 == 1) {
                guerreiro.decremento();
            }

            if (guerreiro.energia > 0) {
                int dano2 = atacar();
                if (dano2 == 1) {
                    this.guerreiro.decremento();
                }
            }
        } while ((this.guerreiro.energia > 0) && (guerreiro.energia > 0));

        if (this.guerreiro.energia == 0) {
            guerreiro.decremento();
            return 2;
        } else {
            this.guerreiro.decremento();
            return 1;
        }
    }

    @Override
    public int lutarRecursivo(Guerreiro guerreiro) {
        do {
            int dano1 = atacar();

            if (dano1 == 1) {
                guerreiro.decremento();
            }

            if (guerreiro.energia > 0) {
                int dano2 = atacar();
                if (dano2 == 1) {
                    this.guerreiro.decremento();
                }
            }
        } while ((this.guerreiro.energia > 0) && (guerreiro.energia > 0));

        if (this.guerreiro.energia == 0) {
            guerreiro.decremento();
            return 2;
        } else {
            this.guerreiro.decremento();
            return 1;
        }
    }
}

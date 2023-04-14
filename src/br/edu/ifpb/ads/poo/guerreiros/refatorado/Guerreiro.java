package br.edu.ifpb.ads.poo.guerreiros.refatorado;

public class Guerreiro extends Pessoa {
     int energia;

    public Guerreiro(String codigo, String nome, int energia) {
        super(codigo, nome);
        this.energia = 5;
    }

    public int getEnergia(){
        return energia;
    }

    public void incremento() {
        if (energia < 5) {
            energia++;
        }
    }

    public void decremento() {
        if (energia > 0) {
            energia--;
        } else {
            System.out.println("O Guerreiro " + getNome() + " está sem Energia !");
        }
    }
    
    public void alimentar_se() {
        incremento();
    }

    public void alimentar_se_Completamente() {
        if (energia == 5) {
            incremento();
        } else {
            incremento();
            alimentar_se_Completamente();
        }
    }
    
}

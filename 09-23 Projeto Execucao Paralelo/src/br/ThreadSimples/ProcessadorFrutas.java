package br.ThreadSimples;

public class ProcessadorFrutas implements Runnable{
    public String nomefruta;

    public ProcessadorFrutas(String nomefruta){
        this.nomefruta = nomefruta;
    }

    @Override
    public void run() {
        for(int i=0; i<=3; i++){
            System.out.println("Processando..."+nomefruta+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Linha de producao "+nomefruta+" interrompido");
            }
        }
        System.out.println("Fim do processamento "+nomefruta);
    }
}

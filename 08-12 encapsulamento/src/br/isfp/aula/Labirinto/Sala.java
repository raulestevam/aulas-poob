package br.Labirinto;

public class Sala {
    private String name;

    Sala norte=null, sul=null, leste=null, oeste=null;

    public Sala(String name){this.name=name;}
    //atribuicoes de sala
    public void setN(Sala sala){norte=norte;}

    public void setS(Sala sala){sul=sul;}

    public void setL(Sala sala){leste=leste;}

    public void setO(Sala sala){oeste=oeste;}

    //navegacao
    public Sala vaiN(){
        if(norte==null){
            System.out.println("sala nao existe!");
        }
        return norte;
    }
    public Sala vaiS(){
        if(sul==null){
            System.out.println("sala nao existe!");
        }
        return sul;
    }
    public Sala vaiL(){
        if(leste==null){
            System.out.println("sala nao existe!");
        }
        return leste;
    }
    public Sala vaiO(){
        if(oeste==null){
            System.out.println("sala nao existe!");
        }
        return oeste;
    }
}

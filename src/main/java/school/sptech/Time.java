package school.sptech;

public class Time {
    String nome;
    Integer vitorias=0;
    Integer empates=0;
    Integer derrotas=0;

    public Time() {
    }

    public void registrarVitoria(){
        vitorias++;
    }

    public void registrarEmpate(){
        empates++;
    }

    public void registrarDerrota(){
        derrotas++;
    }
    public Integer getPontos(){
        return (vitorias*3)+empates;
    }

    public Integer getTotalPartidas(){
        return vitorias+empates+derrotas;
    }

    public Integer getAproveitamento() {
        int total = getTotalPartidas();
        double aproveitamento = ((double) vitorias / total) * 100;
        return (int) aproveitamento;
    }


    public void compararAproveitamento(Time adversario){
    Integer timeAtual=getAproveitamento();
    Integer timeInimigo= adversario.getAproveitamento();
    String melhor;
    if(timeAtual<timeInimigo){
        melhor="o melhor time foi o: "+adversario.nome;
    }else if(timeAtual>timeInimigo){
            melhor = "o melhor time foi o: "+ nome;
        }else{
        melhor="Os dois times tiveram um aproveitamento igual de: "+ getAproveitamento();
        }
        System.out.println(melhor);
    }








}

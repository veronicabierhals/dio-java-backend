package list.OperacoesBasicas.ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private static List <Tarefa> tarefaList;

    public ListaTarefa (){
        this.tarefaList = new ArrayList<>();
    }

    public static void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        //add as tarefas que tiverem a mesma descrição que foi passada no argumento
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        //verifica cada tarefa da lista, se for igual a descrição passada no argumento add em tarefasParaRemover
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        //remove tudo que estiver em tarefasParaRemover
        tarefaList.removeAll(tarefasParaRemover);
    }

    public static int obterNumeroTotalTarefas(){
        //size retorna a quantidade de elementos que tem dentro da lista
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    //metodo para testar a solucao
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: " + ListaTarefa.obterNumeroTotalTarefas());

        ListaTarefa.adicionarTarefa("Tarefa 1");
        ListaTarefa.adicionarTarefa("Tarefa 1");
        ListaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é: " + ListaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é: " + ListaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}

package app;

import java.util.ArrayList;

public class GerenciadorDeTarefas {
	// Lista onde todas as tarefas serão armazenadas 
	private ArrayList<Tarefa> tarefas; 
   
	// Construtor da classe. Quando criamos um gerenciador, ele começa com a lista vazia
	public GerenciadorDeTarefas() {
		tarefas = new ArrayList<>();
	}
	
	// Adiciona uma nova tarefa à lista
	public void adicionarTarefa(String titulo, String descricao) {
		Tarefa nova = new Tarefa(titulo, descricao);
		tarefas.add(nova);
		System.out.println("✅ Tarefa adicionada com sucesso!");
	}
	
	// Lista todas as tarefas com seus detalhes
	public void listarTarefas() {
		if (tarefas.isEmpty()) {
			System.out.println(" ⚠️ Nenhuma tarefa encontrada.");
		} else {
			System.out.println("📋 Lista de Tarefas:");
			for (int i = 0; i < tarefas.size(); i++) {
				Tarefa t = tarefas.get(i);
				System.out.println((i + 1) + ". " + t.getTitulo() +
						" - " + t.getDescricao() +
						"  [" + (t.isConcluida() ? "Concluida  ✅ "  : "Pendente ⏳") +"]");
			}
		}
	}
    // Marca uma tarefa como concluída (a partir do índice que o usuário digita)
    public void marcarTarefaConcluida(int indice) {
		if (indice >= 0 && indice < tarefas.size()) {
			tarefas.get(indice).marcarComoConcluida(); // ← usa o método da classe Tarefa
			System.out.println(" ✅ Tarefa concluída com sucesso!"); 
	  } else {
            System.out.println(" ❌ Índice inválido.");
				}
            }
    
    // Remove uma tarefa da lista           
    public void removerTarefa(int indice) {
		if (indice >= 0 &&  indice< tarefas.size()) {
			tarefas.remove(indice);
			System.out.println(" 🗑️ Tarefa removida com sucesso!");
	} else {
			System.out.println(" ❌ Índice inválido.");
			
	
		   }
	   }		
   }

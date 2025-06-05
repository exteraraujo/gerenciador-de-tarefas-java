package app;

public class Tarefa {
	private String titulo;        // Guarda o título da tarefa. Private significa que só a própria classe acessa diretamente.
	private String descricao;    // Guarda os detalhes da tarefa
	private boolean concluida;   // Guarda de a tarefa foi concluída (true) ou não (false).
	
	public Tarefa(String titulo, String descricao) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.concluida = false; // Começa como  não concluida
	}
	
	public String getTitulo() {
		return titulo;
	}
    
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public boolean isConcluida() {
		return concluida;
	}
	
	public void marcarComoConcluida() {
		this.concluida  = true;
	}
}

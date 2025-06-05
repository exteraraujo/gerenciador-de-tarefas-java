package app;

import java.util.Scanner;

public class AppTarefas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner = new Scanner (System.in); // Cria um scanner para entrada de dados
       GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas(); // Cria o gerenciador de tarefas

       
       boolean executando = true; 
       
       while (executando) {
    	   System.out.println("\n--- GERENCIADOR DE TAREFAS ---");
           System.out.println("1. Adicionar tarefa");
           System.out.println("2. Listar tarefas");
           System.out.println("3. Marcar tarefa como concluída");
           System.out.println("4. Remover tarefa");
           System.out.println("5. Sair");
           System.out.print("Escolha uma opção: ");
       
           int opcao = scanner.nextInt();
           scanner.nextLine(); // Limpa o buffer do teclado
           
           switch (opcao) {
           case 1:
           // Adicionar tarefa
        	   System.out.print("Título da tarefa: ");
               String titulo = scanner.nextLine();

               System.out.print("Descrição da tarefa: ");
               String descricao = scanner.nextLine();

      
               gerenciador.adicionarTarefa(titulo, descricao);
               break;
           
           case 2:
           // Listar tarefas
        	   gerenciador.listarTarefas();	   
           break;
           
           
           case 3:
           // Marcar como concluída
        	   gerenciador.listarTarefas(); // Primeiro mostramos as tarefas
        	    System.out.print("Digite o número da tarefa a concluir: ");
        	    int numeroConcluir = scanner.nextInt();
        	    scanner.nextLine(); // limpa o buffer
        	    gerenciador.marcarTarefaConcluida(numeroConcluir - 1); // -1 porque começa no 0
           break;
           
           case 4:
           // Remover tarefa
        	   gerenciador.listarTarefas();
               System.out.print("Digite o número da tarefa que deseja remover: ");
               int numeroRemover = scanner.nextInt();
               scanner.nextLine();
               gerenciador.removerTarefa(numeroRemover - 1);
           break;
           
           case 5:
           executando = false;
           System.out.println("Saindo do programa...");
           break;
           
           
         default: 
           System.out.println("Opção inválida.");
           break;
           
           }
       }
         
        
       scanner.close(); // Fecha o scanner quando o programa termina

  }
}

package Exercito;

import java.util.ArrayList;
import java.util.List;

import personagem.Personagem;

public class Exercito {

	private List<Personagem> exercito = new ArrayList<>();
	private String nomeExercito;
	
	public Exercito(String nome){
		this.nomeExercito = nome;
	}
	
	public void addPersonagemNoExercito(Personagem personagem){
		
		exercito.add(personagem);
		
	}
	
	public void info(){
	
		int forcaAtaqueDoExercito = 0;
		int defesaDoExercito = 0;
		int tamanhoDoExercito = 0;
		
		int quantidadeArqueiros = 0;
		int quantidadeGuerreiro = 0;
		int quantidadeLanceiros = 0;
		
		for (Personagem personagem : exercito) {
			
			forcaAtaqueDoExercito += personagem.getPoderDeAtaque();
			defesaDoExercito += personagem.getDefesa().getValor();
			tamanhoDoExercito++;
			
			switch (personagem.getTipoPersonagem()) {
			case ARQUEIRO:
				quantidadeArqueiros++;
				break;
			case GUERREIRO:
				quantidadeGuerreiro++;
				break;
			case LANCEIRO:
				quantidadeLanceiros++;
				break;
			default:
				break;
			}
			
		}
		
		System.out.println(" -- INFO EXERCITO "+nomeExercito+" -- ");
		System.out.println("Tamanho do exercito : " + tamanhoDoExercito);
		System.out.println("    Guerreiros : "+	quantidadeGuerreiro);
		System.out.println("    Arqueiros : "+	quantidadeArqueiros);
		System.out.println("    Lanceiros : "+	quantidadeLanceiros);
		System.out.println("Força do exercito : " + forcaAtaqueDoExercito);
		System.out.println("Defesa do exercito : "+ defesaDoExercito);
		
	}
	
}

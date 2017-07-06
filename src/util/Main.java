package util;

import Exercito.Exercito;
import batalha.BatalhaController;
import factory.BarbaroFactory;
import factory.BritanicosFactory;
import factory.ExercitoFactory;
import factory.FrancesesFactory;
import observer.Ambiente;
import observer.Chuva;
import observer.Tempestade;
import observer.Ensolarado;

public class Main {

	public static void main(String[] args) {

		//GERAR EXERCITOS
		ExercitoFactory exercitoFactory = new ExercitoFactory();

		Exercito exercitoBarbaro = exercitoFactory.montarExercito(new BarbaroFactory());
		Exercito exercitoBritanico = exercitoFactory.montarExercito(new BritanicosFactory());
		Exercito exercitoFrances = exercitoFactory.montarExercito(new FrancesesFactory());

		imprimirInformacoesExercitos(exercitoBarbaro, exercitoBritanico);


		//ARMA
		exercitoBarbaro.showArmasExercito();
		exercitoBritanico.showArmasExercito();


		//AMBIENTE
		Ambiente ambiente = new Ambiente();
		ambiente.attach(exercitoBarbaro);
		ambiente.attach(exercitoBritanico);
		ambiente.attach(exercitoFrances);

		ambiente.setClima(new Ensolarado());

		imprimirInformacoesExercitos(exercitoBarbaro, exercitoBritanico);


		ambiente.setClima(new Chuva());

		imprimirInformacoesExercitos(exercitoBarbaro, exercitoBritanico);


		ambiente.setClima(new Tempestade());

		imprimirInformacoesExercitos(exercitoBarbaro, exercitoBritanico);


		//BATALHA
		new BatalhaController().batalhar(exercitoBarbaro, exercitoBritanico);

		imprimirInformacoesExercitos(exercitoBarbaro, exercitoBritanico);

	}

	private static void imprimirInformacoesExercitos(Exercito exercito1, Exercito exercito2) {
		exercito1.info();
		exercito2.info();
	}

}

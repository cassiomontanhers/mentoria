package util;

import Exercito.Exercito;
import factory.BarbaroFactory;
import factory.BritanicosFactory;
import factory.ExercitoFactory;
import factory.FrancesesFactory;
import observer.Ambiente;
import observer.Chuva;
import observer.ExercitoObserver;
import observer.Normal;

public class Main {

	public static void main(String[] args) {

		//GERAR EXERCITOS
		ExercitoFactory exercitoFactory = new ExercitoFactory();
		
		Exercito exercitoBarbaro = exercitoFactory.montarExercito(new BarbaroFactory());
		Exercito exercitoBritanico = exercitoFactory.montarExercito(new BritanicosFactory());
		Exercito exercitoFrances = exercitoFactory.montarExercito(new FrancesesFactory());
		
		exercitoBarbaro.info();
		exercitoBritanico.info();
		exercitoFrances.info();

		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////");
		
		//AMBIENTE
		Ambiente ambiente = new Ambiente();
		ambiente.attach(new ExercitoObserver(ambiente,exercitoBarbaro));
		ambiente.attach(new ExercitoObserver(ambiente,exercitoBritanico));
		ambiente.attach(new ExercitoObserver(ambiente,exercitoFrances));

		ambiente.setClima(new Chuva());
		
		exercitoBarbaro.info();
		exercitoBritanico.info();
		exercitoFrances.info();

	}

}

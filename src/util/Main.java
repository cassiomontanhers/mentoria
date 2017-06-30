package util;

import Exercito.Exercito;
import factory.BarbaroFactory;
import factory.BritanicosFactory;
import factory.ExercitoFactory;
import factory.FrancesesFactory;

public class Main {

	public static void main(String[] args) {

		ExercitoFactory exercitoFactory = new ExercitoFactory();

		Exercito exercitoBarbaro = exercitoFactory.montarExercito(new BarbaroFactory());
		Exercito exercitoBritanico = exercitoFactory.montarExercito(new BritanicosFactory());
		Exercito exercitoFrances = exercitoFactory.montarExercito(new FrancesesFactory());

		exercitoBarbaro.info();
		exercitoBarbaro.showArmasExercito();

		exercitoBritanico.info();
		exercitoBritanico.showArmasExercito();

		exercitoFrances.info();
		exercitoFrances.showArmasExercito();

	}

}

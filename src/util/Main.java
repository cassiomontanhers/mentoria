package util;

import Controller.ExercitoController;
import Exercito.Exercito;
import factory.BarbaroFactory;
import factory.BritanicosFactory;
import factory.FrancesesFactory;

public class Main {

	public static void main(String[] args) {

		ExercitoController exercitoController = new ExercitoController();

		Exercito exercitoBarbaro = exercitoController.montarExercito(new BarbaroFactory());
		Exercito exercitoBritanico = exercitoController.montarExercito(new BritanicosFactory());
		Exercito exercitoFrances = exercitoController.montarExercito(new FrancesesFactory());
		
		exercitoBarbaro.info();
		exercitoBritanico.info();
		exercitoFrances.info();
		
	}

}

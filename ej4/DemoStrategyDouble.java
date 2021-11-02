package HW5.ej4;

import HW5.ej4.Classifier.ClassifierKmeans;
import HW5.ej4.Classifier.ClassifierKnn;
import HW5.ej4.Classifier.ClassifierSOM;
import HW5.ej4.Metric.Euclidean;
import HW5.ej4.Metric.Manhattan;

public class DemoStrategyDouble {

	public static void main(String[] args) {
		System.out.println("--- KNN with Euclidean distance---");
		ContextDouble context = new ContextDouble(new ClassifierKnn(new Euclidean()));
		context.run();

		System.out.println("--- KNN with Manhattan distance---");
		context.setClassifierMetricStrategy(new Manhattan());
		context.run();

		System.out.println("--- K-means with Manhattan distance ---");
		context.setClassifierStrategy(new ClassifierKmeans(new Manhattan()));
		context.run();

		System.out.println("--- SOM  with Euclidean distance ---");
		context.setClassifierStrategy(new ClassifierSOM(new Euclidean()));
		context.run();
	}
}
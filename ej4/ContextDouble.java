package HW5.ej4;

import HW5.ej4.Classifier.Classifier;
import HW5.ej4.Metric.Metric;

public class ContextDouble {
	private Classifier classifier;

	public ContextDouble(Classifier classifier) {
		setClassifierStrategy(classifier);
	}

	public void setClassifierStrategy(Classifier classifier) {
		this.classifier = classifier;
	}

	public void setClassifierMetricStrategy(Metric metric) {this.classifier.setMetric(metric);}

	public void run() {
		classifier.execute();
	}
}

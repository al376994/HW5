package HW5.ej4.Classifier;

import HW5.ej4.Metric.Metric;

public class ClassifierKmeans implements Classifier {

	private Metric metric;

	public ClassifierKmeans(Metric metric) {
		setMetric(metric);
	}

	@Override
	public void setMetric(Metric metric) {
		this.metric = metric;
	}

	@Override
	public void execute() {
		metric.execute();
		System.out.println("ClassifierKmeans executed");
	}
}

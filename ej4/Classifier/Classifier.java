package HW5.ej4.Classifier;

import HW5.ej4.Metric.Metric;

public interface Classifier {
	public void setMetric(Metric metric);
	public void execute();
}

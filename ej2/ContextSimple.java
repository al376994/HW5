package HW5.ej2;

import HW5.ej2.Classifier.Classifier;

public class ContextSimple {
	private Classifier classifier;

	public ContextSimple(Classifier classifier) {
		setClassifierStrategy(classifier);
	}

	public void setClassifierStrategy(Classifier classifier) {
		this.classifier = classifier;
	}

	public void run() {
		classifier.execute();
	}
}

package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		
		double taxIndividual = 0.0;
		double taxHealt = healthExpenditures * 0.50;
		
		if (super.getAnualIncome() > 20000.00) {
			taxIndividual = super.getAnualIncome() * 0.25;
		} else {
			taxIndividual = super.getAnualIncome() * 0.15;
		}
		
		taxIndividual -= taxHealt;
		
		return taxIndividual;
	}

}

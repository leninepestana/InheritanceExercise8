package entities;

public class Individual extends TaxPayer{
	
	private String name;
	private Double anualIncome;
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}	

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super();
		this.name = name;
		this.anualIncome = anualIncome;
		this.healthExpenditures = healthExpenditures;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		if(getAnualIncome() >= 20000.00) {
			return getAnualIncome() * 0.25  - healthExpenditures * 0.5;
			
		}
		else {
			return getAnualIncome() * 0.15 - healthExpenditures * 0.5; 
		}
	}

}

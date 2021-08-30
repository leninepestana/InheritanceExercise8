package entities;

public class Company extends TaxPayer {
	
	private String name;
	private Double anualIncome;
	private Integer workers;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer workers) {
		super();
		this.name = name;
		this.anualIncome = anualIncome;
		this.workers = workers;
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

	public Integer getWorkers() {
		return workers;
	}

	public void setWorkers(Integer workers) {
		this.workers = workers;
	}

	@Override
	public double tax() {
		if(getWorkers() > 10) {
			return getAnualIncome() * 0.14;
		} 
		else {
			return getAnualIncome() * 0.16;
		}
	}
	
	
}

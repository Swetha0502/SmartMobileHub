public class Sim {
	String name,bandwidth;

	Sim(String name, String bandwidth)
	{
		this.name=name;
		this.bandwidth=bandwidth;
	}

	public void detailsOfSim() {
		System.out.println("Sim name : "+name);
		System.out.println("Sim bandwidth : "+bandwidth);
	}

}

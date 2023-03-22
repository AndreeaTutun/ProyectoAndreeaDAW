package datos;

public class Ciudad {
	private int id;
	private String name; 
	private String countrycode;
	private String district;
	private int population;
	
	public Ciudad() {
		 
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String district) {
		this.district = district;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

    public Ciudad(int id, String name, String countrycode, String district, int population) {
        this.id = id;
        this.name = name;
        this.countrycode = countrycode;
        this.district = district;
        this.population = population;
    }
   public Ciudad(String name, String countrycode, String district, int population) {
     //   this.id = id;
        this.name = name;
        this.countrycode = countrycode;
        this.district = district;
        this.population = population;
    }
}


public class RegistrationPlate {
	
	private final String regCode;
	private final String country;
	
	public RegistrationPlate(String regCode, String country) {
		this.regCode = regCode;
		this.country = country;
	}
	
	public String toString() {
		return country + "  " + regCode;
	}
	
	public boolean equals(Object object) {
		if (object == null) {
			return false;
		}
		if (this.getClass() != object.getClass()) {
			return false;
		}
		
		RegistrationPlate compared = (RegistrationPlate) object;
		
		if (this.regCode != compared.regCode || this.country != compared.country || this.regCode == null || this.country == null) {
			return false;
		}
		return true;
	}
	
	public int hashCode() {
		if (this.country == null || this.regCode == null) {
			return 7;
		}
		return this.country.hashCode() + this.regCode.hashCode();
	}
}

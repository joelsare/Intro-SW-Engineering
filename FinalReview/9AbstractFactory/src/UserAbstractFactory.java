
public class UserAbstractFactory {
	public User getInstance(String user) {
		if (user.equalsIgnoreCase("business"))
			return new BusinessUser();
		
		else
			return new PersonalUser();
	}
}


public class UserCreationTest {

	public static void main(String[] args) {
		//User user = new PersonalUser();
		//User user = new BusinessUser();
		
		User user = new UserAbstractFactory().getInstance("person");
		user.createUser();
	}

}

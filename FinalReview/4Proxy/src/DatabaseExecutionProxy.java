
public class DatabaseExecutionProxy implements IDatabaseExecution {

	DatabaseExecution dbquery;
	
	boolean adminFlag = false;
	
	public DatabaseExecutionProxy(String username, String password) {
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("1234")) {
			adminFlag = true;
		}
		
		dbquery = new DatabaseExecution();
		
	}

	public void executeQuery(String query) throws Exception {
		if (adminFlag) {
			dbquery.executeQuery(query);
		}
		else {
			if (query.contains("delete")) {
				throw new Exception("Delete is not allowed for non-admin users");
			}
			else {
				dbquery.executeQuery(query);
			}
		}
	}

}

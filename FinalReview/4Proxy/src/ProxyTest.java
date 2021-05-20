
public class ProxyTest {

	public static void main(String[] args) throws Exception {
		
		DatabaseExecutionProxy dbproxy1 = new DatabaseExecutionProxy("admin", "1234");
		dbproxy1.executeQuery("delete");
		
		DatabaseExecutionProxy dbproxy2 = new DatabaseExecutionProxy("non-admin", "1234");
		//dbproxy2.executeQuery("delete");
		dbproxy2.executeQuery("insert");


	}

}

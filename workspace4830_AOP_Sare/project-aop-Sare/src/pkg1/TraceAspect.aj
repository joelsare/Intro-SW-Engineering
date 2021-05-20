package pkg1;

public aspect TraceAspect {
	
	pointcut constructor2trace(): within(Circle);
	
	pointcut class2trace(): within(Circle); //within circle class
	
	pointcut method2trace(): class2trace() && execution(double area(double)); //method
	
	before(): constructor2trace() {
		System.out.println(thisJoinPointStaticPart.getSignature());
		Object[]paramValues = thisJoinPoint.getArgs();
		if (paramValues != null) {
			for (Object iParam: paramValues) {
				System.out.println(iParam);
			}
		}
	}
	
	before(): method2trace() {
		String info = thisJoinPointStaticPart.getSignature() + " , "
				+ thisJoinPointStaticPart.getSourceLocation().getFileName() + " , "
				+ thisJoinPointStaticPart.getSourceLocation().getLine();
		
		System.out.println("Before the method: " + info);
	}
	
	after(): method2trace() {
		System.out.println(thisJoinPointStaticPart.getSignature()); //method signature
	}
	
}

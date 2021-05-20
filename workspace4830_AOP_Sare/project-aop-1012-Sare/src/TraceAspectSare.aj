
public aspect TraceAspectSare {
	pointcut classToTrace(): within(ComponentApp) || within(DataApp) || within(ServiceApp);
	
	pointcut methodToTrace(): classToTrace() && execution(String getName());
	
	before(): methodToTrace() {
		String s = thisJoinPointStaticPart.getSignature() + " , "
				+ thisJoinPointStaticPart.getSourceLocation().getLine();
		System.out.println("[BGN] " + s);
	}
	
	after(): methodToTrace() {
		String s = thisJoinPointStaticPart.getSourceLocation().getFileName() + "";
		System.out.println("[END] " + s);
	}
}

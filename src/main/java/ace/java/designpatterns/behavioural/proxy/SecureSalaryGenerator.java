package ace.java.designpatterns.behavioural.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecureSalaryGenerator implements SalaryGenerator{
	private static final Logger logger = LoggerFactory.getLogger(SecureSalaryGenerator.class);
	private SalaryGenerator salaryGenerator;

	@Override
	public int getSalary(String username) {
		if(authenticationPassed(username)){
			logger.info("Authentication passed for {}",username);
			salaryGenerator= new MonthlySalaryGenerator();
			return salaryGenerator.getSalary(username);
		}
		logger.info("Authentication failed {}",username);
		return -1;
	}

	private boolean authenticationPassed(String username) {
		logger.info("Authenticating {}",username);
		return username.equalsIgnoreCase("akhi");
	}

}

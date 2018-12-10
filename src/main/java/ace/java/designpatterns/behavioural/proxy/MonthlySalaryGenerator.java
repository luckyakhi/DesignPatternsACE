package ace.java.designpatterns.behavioural.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MonthlySalaryGenerator implements SalaryGenerator{
	private static final Logger logger = LoggerFactory.getLogger(MonthlySalaryGenerator.class);

	@Override
	public int getSalary(String username) {
		logger.info("Getting salary for {}",username);
		return 1321313213;
	}

}

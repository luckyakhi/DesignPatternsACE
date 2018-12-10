package ace.java.designpatterns.behavioural.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProxyPatternDemo {
    private static final Logger loggger = LoggerFactory.getLogger(ProxyPatternDemo.class);
    public static  void main(String args[]){
        SalaryGenerator salaryGenerator = new SecureSalaryGenerator();
        loggger.info("Salary for user akhi is {}",salaryGenerator.getSalary("akhi"));
        loggger.info("Salary for user amit is {}",salaryGenerator.getSalary("amit"));
    }
}

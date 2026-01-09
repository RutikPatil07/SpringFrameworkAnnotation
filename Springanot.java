package cs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cs.bean.Emp;
import cs.repo.stdrepo;

public class Sprinanot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext a=new AnnotationConfigApplicationContext(stdrepo.class);
     Emp s=(Emp) a.getBean("emp");
     s.disp();
     
	}

}

package com.siva.empexsetters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ApplicationContext  context=new AnnotationConfigApplicationContext(Config.class);
		// setteres and getters example.....
		Emp1 emp1 = context.getBean("emp", Emp1.class);
		System.out.println("Empid = "+emp1.geteId()+" EmpName = "+emp1.geteName());
		
		Address1 ad=emp1.getAd();
		System.out.println("City = "+ad.getCity()+" Country = "+ad.getCountry());
		
		Experience1 ex=emp1.getEx();
		System.out.println(ex.getMonth()+" months   "+ex.getYear()+" years");
		
		System.out.println("application completed successfully ....");
		
		
    }
}

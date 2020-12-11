package com.xworkz.data;

import com.xworkz.data.dto.CompanyDTO;

public class CompanyTester {
	public static void main(String[] args) {
			
			CompanyDTO company=new CompanyDTO("28 June 1926");
			System.out.println(company.getFounded());
			System.out.println(company.getName());
			System.out.println("*************** ");
			
			CompanyDTO company2=new CompanyDTO("Mercedes-Benz","Ola Källenius","Stuttgart, Germany"," Producing luxury vehicles ");
			
			System.out.println(company2.getName());
			System.out.println(company2.getLocation());
			System.out.println(company2.getCeo());
			
			company2.setWebSite("www.mercedes-benz.com");
			System.out.println(company2.getWebSite());
			System.out.println(company2.getType());
}
}
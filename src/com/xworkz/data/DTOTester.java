package com.xworkz.data;
import com.xworkz.data.dto.CustomerDTO;

@SuppressWarnings("unused")
public class DTOTester {

	public static void main(String[] args) {


				
				CustomerDTO customerDTO=new CustomerDTO();
				customerDTO.setName("SAHANA");
				customerDTO.setCustomerId(123);
				customerDTO.setContactNo(8197425810l);
				customerDTO.setEmail("sahanasavur@gmail.com");
				
				System.out.println(customerDTO.getName());
				System.out.println(customerDTO.getCustomerId());
				System.out.println(customerDTO.getContactNo());
				System.out.println(customerDTO.getEmail());
				System.out.println("****************************");
				
				CustomerDTO customerDTO2=new CustomerDTO();
				customerDTO2.setName("AISHU");
				customerDTO2.setCustomerId(456);
				customerDTO2.setContactNo(6361076321l);
				customerDTO2.setEmail("aishu@gmail.com");
				
				System.out.println(customerDTO2.getName());
				System.out.println(customerDTO2.getCustomerId());
				System.out.println(customerDTO2.getContactNo());
				System.out.println(customerDTO2.getEmail());
				System.out.println("****************************");
				
				CustomerDTO customerDTO3=new CustomerDTO();
				customerDTO3.setName("ABHI");
				customerDTO3.setCustomerId(789);
				customerDTO3.setContactNo(9448390334L);
				customerDTO3.setEmail("abhi@gmail.com");
				
				System.out.println(customerDTO3.getName());
				System.out.println(customerDTO3.getCustomerId());
				System.out.println(customerDTO3.getContactNo());
				System.out.println(customerDTO3.getEmail());
			}

	}

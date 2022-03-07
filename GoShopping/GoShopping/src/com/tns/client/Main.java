package com.tns.client;

import java.util.Scanner;

import com.tns.application.*;
import com.tns.framwork.*;

public class Main 
{
	public static void main(String[] args) 
	{
	
				
			//System.out.println("Out side of while() Loop");
				
				//step 1
				ShopFactory gsf = new GSShopFactory();
				gsf.getNewPrimeAcc(1, "Gaurav", 1000, true);
				gsf.getNewNormalAcc(2, "RAhul", 500, 50);

				
					
					//step 2
					//GSPrimeAcc Constructor Calling & Object Creation
					GSPrimeAcc gsp = new GSPrimeAcc();
		
					System.out.println("Acc no\t\t: "+gsp.getAccNo());
					System.out.println("Acc Name\t: "+gsp.getAccNm());
			
					//step 4
					//Calling bookProduct()
					gsp.bookProduct(1);
			
					System.out.println("Charges\t\t: "+gsp.getCharges());
					System.out.println("isPrime\t\t: "+gsp.isPrime());
					System.out.println("Delivery Charges: "+gsp.getDeliverycharges());
				
					//step 5
					//Calling toString()
					gsp.toString();
			
	
				
						//step 3
						//GSNormalAcc Constructor Calling & Object Creation
						GSNormalAcc gsn = new GSNormalAcc();
		
						System.out.println("Acc no\t\t: "+gsn.getAccNo());
						System.out.println("Acc Name\t: "+gsn.getAccNm());
					
						//step 4
						//Calling bookProduct()
						gsn.bookProduct(1);
				
						System.out.println("Charges\t\t: "+gsn.getCharges());
						System.out.println("Delivery Charges: "+gsn.getDeliveryCharges());
						
						//step 5
						//Calling toString()
						gsn.toString();
			
						
					
				
		}
	}


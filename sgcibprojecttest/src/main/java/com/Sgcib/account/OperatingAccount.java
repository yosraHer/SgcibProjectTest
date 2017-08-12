package com.Sgcib.account;

import com.Sgcib.models.Client;

public class OperatingAccount {
	
 public double withdraw (Client client, double amountWithdrawn ) {
	 
	 client.setAccount(client.getAccount() - amountWithdrawn);
	 return client.getAccount();
	}
}

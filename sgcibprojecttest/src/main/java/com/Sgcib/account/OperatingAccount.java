package com.Sgcib.account;

import com.Sgcib.models.Client;

public class OperatingAccount {
	
 public void withdraw (Client client, double amountWithdrawn ) {
	 
	 client.setAccount(client.getAccount() - amountWithdrawn);
	 
	}
}

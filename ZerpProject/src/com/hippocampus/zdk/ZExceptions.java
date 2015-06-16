package com.hippocampus.zdk;

import java.util.Hashtable;

public class ZExceptions extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static Hashtable<String, String> zexception =  new Hashtable<String, String>();

	public ZExceptions(String exception, boolean DangerousDegre){
		//DangerousDegre level 0 ,annotation only
		//DangerousDegre level 1,needs to Exit
		
		
		super ("Oooops Quelques choses qui ne se déroule pas bien  !!!\nException Code ="+exception +"\nDescription: "+getDescription(exception) );
		//if (DangerousDegre == true )
			//System.exit(1);
	}

	private static void setup(){
		ZExceptions.zexception.put("Z000000001", "Nom de Variable érroné ne respecte pas la structure de ZERP");
		ZExceptions.zexception.put("Z000000002", "Type do not respect ZErp");
		ZExceptions.zexception.put("Z000000003", "ZObject do not starts with valid character.");
		ZExceptions.zexception.put("Z000000004", "Ztext field size");
		ZExceptions.zexception.put("Z000000005", "ZMenu could not be the child of himself dependensie conflit");
		ZExceptions.zexception.put("Z000000006", "Could note make relation Many2Many with the same Object");
		ZExceptions.zexception.put("Z000000007", "Could note make relation Many2Many with the same Component");
		ZExceptions.zexception.put("Z000000008", "Trying to add choice for a simple type of Component");
		ZExceptions.zexception.put("Z000000009", "Choice used is not an instanceOf ZChoiceWithValue");
		
	}
	private static String getDescription(String exceptionCode){
		ZExceptions.setup();
		return  ZExceptions.zexception.get(exceptionCode);
	}
}


public class Calculatrice {


	 long premiereValeur ;
	 long deuxiemeValeur ;
	
	
	public static String ajouter (long premiereValeur , long deuxiemeValeur  ) {
		
		long resultat = premiereValeur + deuxiemeValeur ;
		
		return "le r�sultat de l'op�aration est :"+resultat; 
				
	}
	
	public static String soustraire (long premiereValeur , long deuxiemeValeur  ) {
		
		long resultat = premiereValeur - deuxiemeValeur ;
		
		return "le r�sultat de l'op�aration est :"+resultat; 
		
		
	}

	public static String multiplier (long premiereValeur , long deuxiemeValeur  ) {
	
		long resultat = premiereValeur * deuxiemeValeur ;
		
		return "le r�sultat de l'op�aration est :"+resultat; 
		
}

	public static String diviser (long premiereValeur , long deuxiemeValeur  ) {
	
		long resultat = premiereValeur / deuxiemeValeur ;
		
		return "le r�sultat de l'op�aration est :"+resultat; 
		
}
}

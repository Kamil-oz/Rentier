package rentier.utils;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class FlatConditionMap {

	public static Map<String, String> getMap(){
		Map<String, String> hp = new HashMap<String, String>();
		hp.put("floor", "Panele");
		hp.put("walls", "Gładzie na ścianach");
		hp.put("painting", "Malowanie");
		hp.put("bathroom", "Łazienka");
		hp.put("kitchen", "Kuchnia");
		hp.put("frontDoor", "Drzwi wejściowe");
		hp.put("indorDoor", "Drzwi wewnętrzne");
		hp.put("window", "Okna");
		hp.put("changeHeatingSystem", "System Ogrzewania");
		hp.put("electricity", "Instalacja elektryczna");
		hp.put("balcony", "Balkon");
		
		return hp;
	}
}

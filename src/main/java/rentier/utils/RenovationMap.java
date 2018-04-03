package rentier.utils;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class RenovationMap {

	public static Map<String, String> getMap(){
		Map<String, String> hp = new HashMap<String, String>();
		hp.put("floor", "Cena za położenie paneli za m<sup>2</sup>");
		hp.put("walls", "Cena za położenie gładzi za m<sup>2</sup>");
		hp.put("painting", "Cena za malowanie za m<sup>2</sup>");
		hp.put("bathroom", "Cena za wyremontowanie łazienki");
		hp.put("kitchen", "Cena za wyremontowanie kuchni");
		hp.put("frontDoor", "Cena za wymianę drzwi wejściowych");
		hp.put("indorDoor", "Cena za wymianę drzwi wewnętrznych");
		hp.put("window", "Średnia cena za wymianę okna");
		hp.put("changeHeatingSystem", "Cena za wymianę ogrzewania");
		hp.put("electricity", "Cena za wymianę instalacji elektrycznej");
		hp.put("balcony", "Cena za remont balkonu");
		
		return hp;
	}
}

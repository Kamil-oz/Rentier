package rentier.utils;

import java.util.HashMap;
import java.util.Map;

public class HomewarePricesMap {

	public static Map<String, String> getMap(){
		Map<String, String> hp = new HashMap<String, String>();
		hp.put("bed", "Łóżko");
		hp.put("wardrobe", "Szafa");
		hp.put("chair", "Krzesło");
		hp.put("desk", "Biurko");
		hp.put("vacumcleaner", "Odkurzacz");
		hp.put("cleaningSupplies", "Srodki czystości");
		hp.put("kitchenSupplies", "Wyposażenie kuchni");
		hp.put("washingMachine", "Pralka");
		hp.put("dryier", "Suszarka");
		hp.put("owen", "Kuchenka");
		hp.put("microwave", "Mikrofalówka");
		hp.put("fidge", "Lodówka");
		hp.put("kitchenTable", "Stół");
		hp.put("kettle", "Czajnik");
		hp.put("cabinet", "Szafka");
		return hp;
	}
}

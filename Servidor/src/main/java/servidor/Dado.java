package servidor;

import com.google.gson.Gson;

/*
    Classe destinada a posteriormente tratar persistencias relevantes
 */
public class Dado {

	public static String toString(Object object) {
		Gson gson = new Gson();
		return gson.toJson(object);
	}
}

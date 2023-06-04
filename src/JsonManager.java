import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;

public class JsonManager {
    public static String buildCarsJson(ArrayList<Car> list){
        JSONArray jsonArray = new JSONArray();
        for (Car car: list){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("year", car.getYear());
            jsonObject.put("brand", car.getBrand());
            jsonObject.put("model", car.getModel());
            jsonObject.put("cost", car.getCost());
            jsonArray.add(jsonObject);
        }
        return jsonArray.toJSONString();
    }
}

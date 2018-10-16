import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class JsonObject {

    private JSONObject jsonObject;

    public JsonObject(String path) throws FileNotFoundException {
        JSONTokener parser = new JSONTokener(new FileReader(path));
        jsonObject = new JSONObject(parser);
    }

    public void readJsonObject(String path) throws FileNotFoundException {
        JSONTokener parser = new JSONTokener(new FileReader(path));
        jsonObject = new JSONObject(parser);
    }

    public ArrayList<String> getObjectArray(String fieldKey) {
        JSONArray jsonArray = this.jsonObject.getJSONArray(fieldKey);
        ArrayList<String> arrayList = (ArrayList) jsonArray.toList();
        return arrayList;
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }
}
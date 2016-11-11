import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

import java.io.File;

/**
 * Created by xiaohua on 11/11 0011.
 */
public class ParserJson {
    public void testparser() throws Exception {
        String data = FileUtils.readFileToString(new File("data.json"));
        JSONObject jsonObject = new JSONObject(data);
        String id = jsonObject.getJSONObject("LoginSeMet").getString("id");
        String button = jsonObject.getJSONObject("LoginSeMet").getString("button");



    }
}

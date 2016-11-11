import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

import java.io.File;

/**
 * Created by xiaohua on 11/11 0011.
 */
public class ParserMainPage {
    static String phone;
    public static void parser() throws Exception{
        ParserMainPage parserMainPage = new ParserMainPage();

        String data = FileUtils.readFileToString(new File("mainpage.json"),"UTF-8");
        JSONObject jsonObject = new JSONObject(data);
        phone = jsonObject.getJSONObject("MainPage").getString("phone");
        String computer = jsonObject.getJSONObject("MainPage").getString("computer");
        String smart = jsonObject.getJSONObject("MainPage").getString("smart");
        String homeElectric = jsonObject.getJSONObject("MainPage").getString("homeElectric");

    }

}

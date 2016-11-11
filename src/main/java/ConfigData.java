import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by xiaohua on 11/11 0011.
 */
public class ConfigData {
    private static ConfigData ourInstance = new ConfigData();

    public static ConfigData getInstance() {
        return ourInstance;
    }

    private ConfigData() {
    }

    private String phone;
    private String computer;
    private String smart;
    private String homeElectric;
    private String office;
    private String game;
    private String bbs;
    private String newMedia;
    private String id;
    private String button;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    public String getSmart() {
        return smart;
    }

    public void setSmart(String smart) {
        this.smart = smart;
    }

    public String getHomeElectric() {
        return homeElectric;
    }

    public void setHomeElectric(String homeElectric) {
        this.homeElectric = homeElectric;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getBbs() {
        return bbs;
    }

    public void setBbs(String bbs) {
        this.bbs = bbs;
    }

    public String getNewMedia() {
        return newMedia;
    }

    public void setNewMedia(String newMedia) {
        this.newMedia = newMedia;
    }

    public void initData() throws Exception {
        String data = null;
        try {
            data = FileUtils.readFileToString(new File("E:\\GitHub\\seleniumForNewGfan-intellij-IDEA\\src\\main\\java\\mainpage.json"));
            JSONObject jsonObject = new JSONObject(data);
            String phone = jsonObject.getJSONObject("MainPage").getString("phone");
            String computer = jsonObject.getJSONObject("MainPage").getString("computer");
            String smart = jsonObject.getJSONObject("MainPage").getString("smart");
            String homeElectric = jsonObject.getJSONObject("MainPage").getString("homeElectric");
            String office = jsonObject.getJSONObject("MainPage").getString("office");
            String game = jsonObject.getJSONObject("MainPage").getString("game");
            String bbs = jsonObject.getJSONObject("MainPage").getString("bbs");
            String newMedia = jsonObject.getJSONObject("MainPage").getString("newMedia");

            String baiduId = jsonObject.getJSONObject("baidu").getString("id");
            String baiduButn = jsonObject.getJSONObject("baidu").getString("button");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void test(){
        System.out.print(ConfigData.getInstance().getPhone());
    }


}

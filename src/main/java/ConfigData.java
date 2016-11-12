import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static org.apache.commons.io.FileUtils.*;

/**
 * Created by xiaohua on 11/11 0011.
 */
public class ConfigData {
    private static ConfigData ourInstance = new ConfigData();
    private Gson gson = new Gson();

    public DataModel getDataModel() {
        return dataModel;
    }

    public void setDataModel(DataModel dataModel) {
        this.dataModel = dataModel;
    }

    private DataModel dataModel;

    public static ConfigData getInstance() {
        return ourInstance;
    }

    private ConfigData() {
        initData();

    }


    public void initData() {
        String data = null;
        try {
            data = readFileToString(new File("/Users/klisly/workspace/seleniumForNewGfan-intellij-IDEA/Element/element.json"));
            dataModel = gson.fromJson(data,DataModel.class);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


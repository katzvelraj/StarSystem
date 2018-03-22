package com.example.administrator.starsystemssample;

import android.content.Context;


import com.example.administrator.starsystemssample.datamodel.Section;
import com.example.administrator.starsystemssample.datamodel.SectionList;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Administrator on 3/22/2018.
 * <p>
 * get the Json file from Asset Folder and do the Parsing
 */

public class Parser {
    private Context mContext;

    public Parser(Context context) {
        this.mContext = context;
    }


    //get json file from asset folder

    /**
     * @return Json String
     * get the Json file from Asset Folder
     * Convert the file to Json String
     * return Json String
     */
    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = mContext.getAssets().open("json.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }


    public List<Section> doAutoParsingJson() {
        SectionList list = new SectionList();
        List<Section> sections;
        try {
            String jsonString = loadJSONFromAsset();
            Gson gson = new Gson();
            list = gson.fromJson(jsonString, SectionList.class);
            sections = list.getPages().get(0).getSections();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return sections;
    }


}

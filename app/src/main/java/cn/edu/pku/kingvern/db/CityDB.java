package cn.edu.pku.kingvern.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import cn.edu.pku.kingvern.bean.City;

/**
<<<<<<< HEAD
 * Created by kingvern on 17/11/22.
=======
 * Created by kingvern on 17/11/1.
>>>>>>> a6aa4f8ba06c89329ee67c27a8342c4a9be797f1
 */

public class CityDB {
    public static final String CITY_DB_NAME = "city.db";
    private static final String CITY_TABLE_NAME = "city";
    private SQLiteDatabase db;
    public CityDB(Context context, String path) {

        db = context.openOrCreateDatabase(path, Context.MODE_PRIVATE, null);

    }
    public List<City> getAllCity() {
        List<City> list = new ArrayList<City>();
        Cursor c = db.rawQuery("SELECT * from " + CITY_TABLE_NAME, null);
        while (c.moveToNext()) {
            String province = c.getString(c.getColumnIndex("province"));

            String city = c.getString(c.getColumnIndex("city"));
            String number = c.getString(c.getColumnIndex("number"));
            String allPY = c.getString(c.getColumnIndex("allpy"));
            String allFirstPY = c.getString(c.getColumnIndex("allfirstpy"));
            String firstPY = c.getString(c.getColumnIndex("firstpy"));
            City item = new City(province, city, number, firstPY, allPY,allFirstPY);

            list.add(item);
        }
        return list;
    }
}

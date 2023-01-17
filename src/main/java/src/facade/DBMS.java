package src.facade;

import java.util.HashMap;
import java.util.Locale;

public class DBMS {
    private HashMap<String,Row> db = new HashMap<String,Row>();

    public DBMS() {
        db.put("jane", new Row("jane","1998-02-01","jane@naver.com"));
        db.put("kim", new Row("kim","1993-03-01","kim@naver.com"));
        db.put("bang", new Row("bang","2008-08-11","bang@naver.com"));
    }
    public Row query(String name){
        try {
            Thread.sleep(1000);

        }catch (Exception e){
            e.printStackTrace();
        }
        return db.get(name.toLowerCase());
    }
}

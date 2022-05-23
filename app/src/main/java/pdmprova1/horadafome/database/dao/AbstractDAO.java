package pdmprova1.horadafome.database.dao;

import android.database.sqlite.SQLiteDatabase;

import pdmprova1.horadafome.database.DBHelper;

public abstract class AbstractDAO {

    protected SQLiteDatabase db;
    protected DBHelper db_helper;

    protected final void open() {
        db = db_helper.getWritableDatabase();
    }

    protected final void close() {
        db_helper.close();
    }

}

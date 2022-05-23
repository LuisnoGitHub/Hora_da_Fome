package pdmprova1.horadafome.database.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import pdmprova1.horadafome.database.DBHelper;
import pdmprova1.horadafome.database.model.UsuarioModel;

import java.time.DateTimeException;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;


public class UsuarioDAO extends AbstractDAO {

    private final String[] colunas =
    {
        UsuarioModel.COLUNA_ID,
        UsuarioModel.COLUNA_NOME,
        UsuarioModel.COLUNA_TELEFONE,
		UsuarioModel.COLUNA_HORA_DA_RESERVA,
		UsuarioModel.COLUNA_N_PESSOAS,
		UsuarioModel.COLUNA_AREA_EXTERNA,
		UsuarioModel.COLUNA_RODIZIO,
		UsuarioModel.COLUNA_LA_CARTE
    };

    public UsuarioDAO(final Context context) {
        db_helper = new DBHelper(context);
    }

    public long Insert(final String nome, final String telefone, final Integer n_pessoas, final Date hora_da_reserva, final Boolean area_externa, final Boolean rodizio, final Boolean a_la_carte) {

        open();

        ContentValues values = new ContentValues();
        values.put(UsuarioModel.COLUNA_NOME, nome);
        values.put(UsuarioModel.COLUNA_TELEFONE, telefone);
		values.put(UsuarioModel.COLUNA_HORA_DA_RESERVA, hora_da_reserva);
		values.put(UsuarioModel.COLUNA_N_PESSOAS, n_pessoas);
		values.put(UsuarioModel.COLUNA_AREA_EXTERNA, area_externa);
		values.put(UsuarioModel.COLUNA_RODIZIO, rodizio);
		values.put(UsuarioModel.COLUNA_LA_CARTE, a_la_carte);

        long result = db.insert(UsuarioModel.tabela, null, values);

        close();

        return result;
    }

    public long Update(final String nome, final String telefone, final Integer n_pessoas, final Date hora_da_reserva, final Boolean area_externa, final Boolean rodizio, final Boolean a_la_carte) {

        open();

        ContentValues values = new ContentValues();
        values.put(UsuarioModel.COLUNA_TELEFONE, telefone);
		values.put(UsuarioModel.COLUNA_HORA_DA_RESERVA, hora_da_reserva);
		values.put(UsuarioModel.COLUNA_N_PESSOAS, n_pessoas);
		values.put(UsuarioModel.COLUNA_AREA_EXTERNA, area_externa);
		values.put(UsuarioModel.COLUNA_RODIZIO, rodizio);
		values.put(UsuarioModel.COLUNA_LA_CARTE, a_la_carte);

        long result = db.update(UsuarioModel.tabela, values, UsuarioModel.COLUNA_NOME + " = ?", new String[]{nome});

        close();

        return result;
    }

    public long Delete(final String usuario) {

        open();

        long result = db.delete(UsuarioModel.tabela, UsuarioModel.COLUNA_NOME + " = ?", new String[]{nome});

        close();

        return result;
    }

    public ArrayList<UsuarioModel> Select() {

        open();

        Cursor cursor = db.query
                        (
                            UsuarioModel.tabela,
                            colunas,
                            null,
                            null,
                            null,
                            null,
                            null
                        );
        cursor.moveToFirst();
        ArrayList<UsuarioModel> arl = new ArrayList<UsuarioModel>();

        while (!cursor.isAfterLast()) {
            arl.add(CursorToStructure(cursor));
            cursor.moveToNext();
        }

        close();

        return arl;
    }

    public final UsuarioModel CursorToStructure(Cursor cursor) {
        UsuarioModel model = new UsuarioModel();
        model.setId(cursor.getLong(0));
        model.setNome(cursor.getString(1));
        model.setTelefone(cursor.getString(2));
		model.setHora_da_reserva(cursor.getClass(DateTimeException);
		model.setN_pessoas(cursor.getInt(4));
		model.setArea_externa(cursor.getExtras().getBoolean(String.valueOf(5)));
		model.setRodizio(cursor.getExtras().getBoolean(String.valueOf(6)));
		model.setA_la_carte(cursor.getExtras().getBoolean(String.valueOf(7)));
        return model;
    }

}

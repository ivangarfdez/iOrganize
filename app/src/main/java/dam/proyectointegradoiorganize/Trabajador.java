package dam.proyectointegradoiorganize;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Trabajador extends AppCompatActivity {

    private ArrayList<String> trabajadores;
    private ArrayAdapter<String> adaptador1;
    private ListView lv1;
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trabajador);trabajadores=new ArrayList<String>();


        adaptador1=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,trabajadores);
        lv1=(ListView)findViewById(R.id.listView);
        lv1.setAdapter(adaptador1);

        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText3);
        et3=(EditText)findViewById(R.id.editText2);
        et4=(EditText)findViewById(R.id.editText4);

        lv1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                final int posicion=i;

                AlertDialog.Builder dialogo1 = new AlertDialog.Builder(dam.proyectointegradoiorganize.Trabajador.this);
                dialogo1.setTitle("Importante");
                dialogo1.setMessage("¿ Eliminar a este trabajador ?");
                dialogo1.setCancelable(false);
                dialogo1.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {
                        trabajadores.remove(posicion);
                        adaptador1.notifyDataSetChanged();
                    }
                });
                dialogo1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {
                    }
                });
                dialogo1.show();

                return false;
            }
        });
    }

    public void agregar(View v) {
        trabajadores.add(et2.getText().toString()+":  "+" "+et4.getText().toString()+":  "+" "+et3.getText().toString()+" Años"+"  "+" "+et1.getText().toString());
        adaptador1.notifyDataSetChanged();
        et1.setText("");
        et2.setText("");
        et3.setText("");
        et4.setText("");


    }
}




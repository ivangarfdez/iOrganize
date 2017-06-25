package dam.proyectointegradoiorganize;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Listener boton Empresa.
        Button empresa = (Button) findViewById(R.id.empresa);
        empresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Cambiamos de clase.
                Intent intent = new Intent(getApplicationContext(), Empresa.class);
                startActivity(intent);
            }
        });

        //Listener boton Servicio.
        Button servicio = (Button) findViewById(R.id.servicio);
        servicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Cambiamos de clase.
                Intent i = new Intent(getApplicationContext(), Servicio.class);
                startActivity(i);
            }
        });

        //Listener boton Servicio.
        Button trabajo = (Button) findViewById(R.id.trabajador);
        trabajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Cambiamos de clase.
                Intent i = new Intent(getApplicationContext(), Trabajador.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        return super.onOptionsItemSelected(item);
    }
}

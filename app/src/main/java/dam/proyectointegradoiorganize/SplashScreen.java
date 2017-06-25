package dam.proyectointegradoiorganize;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;


public class SplashScreen extends Activity {

    // Temporizador para la pantalla de bienvenida
    private static int ContadorTiempo = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Este es el layout que tiene que mostrar.
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {

            //Usamos un contador par poder mostrar la imagen
            //3 segundos

            @Override
            public void run() {
                // Cuando el contador del tiempo llega a cero, se ejecuta este método.
                // Cambiamos de Activity
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);

                // Finalizamos el activity
                finish();
            }
        }, ContadorTiempo);
    }
}
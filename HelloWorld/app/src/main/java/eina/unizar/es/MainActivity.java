package eina.unizar.es;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE="es.unizar.eina.myfirstapp.MESSAGE";
    public static Integer buttonValue = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Llamado cuando el usuario pulsa el boton Send */
    public void sendMessage (View view ) {
        Intent intent = new Intent(this , DisplayMessageActivity.class );
        //EditText editText = (EditText) findViewById (R.id.edit_message);
        //String message = editText.getText().toString();
        String message;
        if (buttonValue == 1) {
            message = "Se ha pulsado el boton de arriba";
        }else if (buttonValue == 2){
            message = "Se ha pulsado el boton de abajo";
        }else{
            message = "No has pulsado ningun botón";
        }
        buttonValue=0;
        intent.putExtra(EXTRA_MESSAGE, message );
        startActivity(intent);
    }

    public void onRadioButtonClicked1 (View view ) {
        buttonValue = 1;
    }
    public void onRadioButtonClicked2 (View view ) {
        buttonValue = 2;
    }

}


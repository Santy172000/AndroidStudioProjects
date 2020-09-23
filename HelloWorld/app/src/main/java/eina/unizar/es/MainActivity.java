package eina.unizar.es;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE="es.unizar.eina.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Llamado cuando el usuario pulsa el boton Send */
    public void sendMessage (View view ) {
        Intent intent = new Intent(this , DisplayMessageActivity.class );
        EditText editText = (EditText) findViewById (R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message );
        startActivity(intent);
    }
}


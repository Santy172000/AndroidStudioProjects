package eina.unizar.es;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the message from the intent
        Intent intent=getIntent();
        String message=intent.getStringExtra( MainActivity.EXTRA_MESSAGE );

        // Create the text view prueba
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        // Set the text view as the activity layout
        setContentView (textView);
    }
}
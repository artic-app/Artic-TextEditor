package anway.somani.artic_richtexteditor;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView textChange;
    EditText textHere;
    ToggleButton toggleButtonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textChange = (TextView) findViewById(R.id.texty);
        toggleButtonC = (ToggleButton) findViewById(R.id.toggleButton);
        textHere = (EditText) findViewById(R.id.texter);

        toggleButtonC.setText("B");
        int startSelection = textHere.getSelectionStart();
        int endSelection = textHere.getSelectionEnd();

        toggleButtonC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    //String selectedText = textHere.getText().toString().substring(startSelection, endSelection);
                    //selectedText.setTypeface( null, Typeface.BOLD);
                    //selectedText.;
                    textHere.setTypeface(null, Typeface.BOLD);
                    toggleButtonC.setText("NB");
                }
                else {
                    textHere.setTypeface(null, Typeface.NORMAL);
                    toggleButtonC.setText("B");
                }
            }
        });


    }
}

package sg.edu.rp.c346.simpleclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_part1);

        tvDisplay=(TextView)findViewById(R.id.textViewDisplay);
        btnDisplay=(Button)findViewById(R.id.DisplayButton);
        etInput=(EditText)findViewById(R.id.EditTextInput);
        tbtn =(ToggleButton) findViewById(R.id.toggleButtonEnabled);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);


            }
        });
        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your Code for the action here
                if (tbtn.isChecked()) {
                    etInput.setEnabled(true);

                } else {
                    etInput.setEnabled(false);

                }
            }
        });
    }
}

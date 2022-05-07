package com.binx.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {
   private Button button;
   private TextView textView;
   private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView4);
        editText=findViewById(R.id.editTextNumber);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "unit converted", Toast.LENGTH_SHORT).show();
                float i = Integer.parseInt(editText.getText().toString());
                double c=2.54*i;
                textView.setText(""+c);
            }
        });


    }
}

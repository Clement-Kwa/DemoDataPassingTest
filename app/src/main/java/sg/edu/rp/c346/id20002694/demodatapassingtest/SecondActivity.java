package sg.edu.rp.c346.id20002694.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv = findViewById(R.id. tv1);
        Intent intentReceived=getIntent();

        int value = intentReceived.getIntExtra("value",-99);
        char valueChar = intentReceived.getCharExtra("char", 'z');
        double valueDb = intentReceived.getDoubleExtra("double", -99.99);

        if(value!=-99){

            tv.setText("Integer received is "+ value);
        }
        else if(valueChar!='z'){
            tv.setText("Character value received is "+ valueChar);
        }
        else if(valueDb!=-99.99){
            tv.setText("Double value received is "+ valueDb);
        }

    }
}
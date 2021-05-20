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
        int value = intentReceived.getIntExtra("value",0);
        tv.setText("Integer value received is "+ value);

    }
}
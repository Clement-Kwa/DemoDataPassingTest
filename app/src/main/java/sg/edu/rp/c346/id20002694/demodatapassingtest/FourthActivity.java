package sg.edu.rp.c346.id20002694.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FourthActivity extends AppCompatActivity {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tv1 = findViewById(R.id. tv1);
        Intent intentReceived=getIntent();
        double dbReceived = intentReceived.getDoubleExtra("double", 99.99);
        tv1.setText("Character value received is "+ dbReceived);

    }
}
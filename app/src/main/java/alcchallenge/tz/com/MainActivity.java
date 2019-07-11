package alcchallenge.tz.com;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Type;

public class MainActivity extends AppCompatActivity {

    private Button toActivity1, toActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            toActivity1 = findViewById(R.id.toActivity1);
            toActivity2 = findViewById(R.id.toActivity2);

            toActivity1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, AboutAndela.class);
                    startActivity(i);
                }
            });

            toActivity2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, MyProfile.class);
                    startActivity(i);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

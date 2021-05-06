package gcit.edu.gcit_scan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button scan;
    static TextView showmsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scan=(Button)findViewById(R.id.button);
        showmsg=(TextView)findViewById(R.id.displaysuccess);

        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),scannerStore.class));
            }
        });

    }

    public void dash(View view) {
        Intent intent= new Intent(getApplicationContext(),dashboard.class);
        startActivity(intent);
    }
}
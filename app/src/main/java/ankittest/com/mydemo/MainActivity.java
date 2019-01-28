package ankittest.com.mydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.herba.sdk.patillib.Patil;

public class MainActivity extends AppCompatActivity {
    Patil patil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}

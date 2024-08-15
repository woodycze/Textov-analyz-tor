package dominik.majap.Matematika;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import dominik.majap.R;

public class vzorce_a_vypocty extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_vzorce_a_vypocty);
        setTitle("Vzorce a výpočty");
    }

    public void otevri_kombinatorika(View view) {
        startActivity(new Intent(this, kombinatorika.class));
    }
}

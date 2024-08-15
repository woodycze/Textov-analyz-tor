package dominik.majap.Ekonomie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import dominik.majap.R;

public class vzorce extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_vzorce);
        setTitle("Vzorce a výpočty");
    }

    public void otevri_nakladova_funkce(View view) {
        startActivity(new Intent(this, funkce_nakladova.class));
    }
}

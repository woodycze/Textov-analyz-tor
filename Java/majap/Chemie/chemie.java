package dominik.majap.Chemie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import dominik.majap.R;

public class chemie extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_chemie);
        setTitle("Chemie");
    }

    public void otevri_periodickou(View view) {
        startActivity(new Intent(this, periodicka_tabulka.class));
    }
}

package dominik.majap.Fyzika;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import dominik.majap.R;

public class tabulky extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_tabulky);
        setTitle("Fyzikální tabulky");
    }

    public void otevri_zakladni(View view) {
        startActivity(new Intent(this, zakladni_jednotky.class));
    }
}

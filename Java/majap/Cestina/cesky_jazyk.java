package dominik.majap.Cestina;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import dominik.majap.R;

public class cesky_jazyk extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_cesky_jazyk);
        setTitle("Český jazyk");
    }

    public void otevri_vyjmenovana(View view) {
        startActivity(new Intent(this, vyjmenovana_slova.class));
    }
}

package dominik.majap.Fyzika;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import dominik.majap.R;

public class fyzika extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_fyzika);
        setTitle("Fyzika");
    }

    public void otevri_tabulky(View view) {
        startActivity(new Intent(this, tabulky.class));
    }
}

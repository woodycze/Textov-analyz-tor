package dominik.majap.Matematika;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import dominik.majap.R;

public class kombinatorika extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_kombinatorika);
        setTitle("Kombinatorika");
    }

    public void otevri_variace(View view) {
        startActivity(new Intent(this, variace.class));
    }

    public void otevri_variace_s(View view) {
        startActivity(new Intent(this, variace_s.class));
    }
}

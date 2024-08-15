package dominik.majap.Informatika;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import dominik.majap.R;

public class informacni_technologie extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_informacni_technologie);
        setTitle("Informační technologie");
    }

    public void otevri_datove_typy(View view) {
        startActivity(new Intent(this, datove_typy.class));
    }
}

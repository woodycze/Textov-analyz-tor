package dominik.majap.Ekonomie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import dominik.majap.R;

public class ekonomie extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_ekonomie);
        setTitle("Ekonomie");
    }

    public void otevri_ekonom_vzorce(View view) {
        startActivity(new Intent(this, vzorce.class));
    }
}

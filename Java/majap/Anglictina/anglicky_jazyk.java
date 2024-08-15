package dominik.majap.Anglictina;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import dominik.majap.R;

public class anglicky_jazyk extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_anglicky_jazyk);
        setTitle("Anglický jazyk");
    }

    public void otevri_nepravidelna(View view) {
        startActivity(new Intent(this, nepravidelna_slovesa.class));
    }
}

package dominik.majap.Matematika;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import dominik.majap.R;

public class matematika extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_matematika);
        setTitle("Matematika");
    }

    public void otevri_kalkulackuu(View view) {
        startActivity(new Intent(this, kalkulacka.class));
    }

    public void otevri_vzorceavyp(View view) {
        startActivity(new Intent(this, vzorce_a_vypocty.class));
    }
}

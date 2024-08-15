package dominik.majap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import dominik.majap.Anglictina.anglicky_jazyk;
import dominik.majap.Cestina.cesky_jazyk;
import dominik.majap.Chemie.chemie;
import dominik.majap.Ekonomie.ekonomie;
import dominik.majap.Fyzika.fyzika;
import dominik.majap.Informatika.informacni_technologie;
import dominik.majap.Literatura.literatura;
import dominik.majap.Matematika.matematika;

public class MainActivity extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main);
    }

    public void otevri_matematiku(View view) {
        startActivity(new Intent(this, matematika.class));
    }

    public void otevri_chemii(View view) {
        startActivity(new Intent(this, chemie.class));
    }

    public void otevri_cestinu(View view) {
        startActivity(new Intent(this, cesky_jazyk.class));
    }

    public void otevri_anglictinu(View view) {
        startActivity(new Intent(this, anglicky_jazyk.class));
    }

    public void otevri_fyziku(View view) {
        startActivity(new Intent(this, fyzika.class));
    }

    public void otevri_informatiku(View view) {
        startActivity(new Intent(this, informacni_technologie.class));
    }

    public void otevri_literaturu(View view) {
        startActivity(new Intent(this, literatura.class));
    }

    public void otevri_ekonomii(View view) {
        startActivity(new Intent(this, ekonomie.class));
    }
}

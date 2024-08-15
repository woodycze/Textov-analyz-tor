package dominik.majap.Matematika;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import dominik.majap.R;

public class variace extends AppCompatActivity {
    public EditText text_k;
    public EditText text_n;
    public TextView vysledek;
    public TextView vzorec;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_variace);
        setTitle("Variace bez opakování");
        setRequestedOrientation(1);
        this.text_k = (EditText) findViewById(R.id.editText_fn);
        this.text_n = (EditText) findViewById(R.id.editText_vn);
        this.vysledek = (TextView) findViewById(R.id.textView_vysledek);
        this.vzorec = (TextView) findViewById(R.id.textView_vzorec);
    }

    public int vypoctiVariaci_n() {
        int factorial_n = 1;
        for (int i = 1; i <= Integer.parseInt(this.text_n.getText().toString()); i++) {
            factorial_n *= i;
        }
        return factorial_n;
    }

    public int vypoctiVariaci_kn() {
        int factorial_nk = 1;
        for (int i = 1; i <= Integer.parseInt(this.text_n.getText().toString()) - Integer.parseInt(this.text_k.getText().toString()); i++) {
            factorial_nk *= i;
        }
        return factorial_nk;
    }

    public void klikVysledekf(View view) {
        this.vzorec.setVisibility(0);
        this.vysledek.setVisibility(0);
        this.vzorec.setText("V(" + this.text_k.getText().toString() + "," + this.text_n.getText().toString() + ") = " + this.text_n.getText().toString() + "!/(" + this.text_n.getText().toString() + "-" + this.text_k.getText().toString() + ")!");
        this.vysledek.setText(String.valueOf(vypoctiVariaci_n() / vypoctiVariaci_kn()));
    }
}

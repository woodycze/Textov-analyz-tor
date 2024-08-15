package dominik.majap.Matematika;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import dominik.majap.R;

public class variace_s extends AppCompatActivity {
    public EditText text_k;
    public EditText text_n;
    public TextView vysledek;
    public TextView vzorec;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_variace_s);
        setRequestedOrientation(1);
        setTitle("Variace s opakováním");
        this.text_k = (EditText) findViewById(R.id.editText_fn);
        this.text_n = (EditText) findViewById(R.id.editText_vn);
        this.vysledek = (TextView) findViewById(R.id.textView_vysledek);
        this.vzorec = (TextView) findViewById(R.id.textView_vzorec);
    }

    public void klikVysledekf(View view) {
        this.vzorec.setVisibility(0);
        this.vysledek.setVisibility(0);
        this.vzorec.setText("V′(" + this.text_k.getText().toString() + "," + this.text_n.getText().toString() + ") = " + this.text_n.getText().toString() + "^" + this.text_k.getText().toString());
        this.vysledek.setText(String.valueOf(Math.pow(Double.parseDouble(this.text_n.getText().toString()), Double.parseDouble(this.text_k.getText().toString()))));
    }
}

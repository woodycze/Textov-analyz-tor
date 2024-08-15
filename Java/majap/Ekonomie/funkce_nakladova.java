package dominik.majap.Ekonomie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import dominik.majap.R;

public class funkce_nakladova extends AppCompatActivity {
    EditText text_fn;
    EditText text_vn;
    TextView vysledek;
    TextView vzorec;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_funkce_nakladova);
        setRequestedOrientation(1);
        this.text_fn = (EditText) findViewById(R.id.editText_fn);
        this.text_vn = (EditText) findViewById(R.id.editText_vn);
        this.vysledek = (TextView) findViewById(R.id.textView_vysledek);
        this.vzorec = (TextView) findViewById(R.id.textView_vzorec);
    }

    public void klikVysledekf(View view) {
        this.vzorec.setVisibility(0);
        this.vysledek.setVisibility(0);
        this.vzorec.setText("CN = " + Double.parseDouble(this.text_fn.getText().toString()) + " + " + Double.parseDouble(this.text_vn.getText().toString()));
        this.vysledek.setText(String.valueOf(Double.parseDouble(this.text_fn.getText().toString()) + Double.parseDouble(this.text_vn.getText().toString())));
    }
}

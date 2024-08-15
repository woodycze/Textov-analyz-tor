package dominik.majap.Literatura;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import dominik.majap.R;

public class autori extends AppCompatActivity {
    TextView dila;
    AdapterView.OnItemSelectedListener itemSelect = new AdapterView.OnItemSelectedListener() {
        public void onItemSelected(AdapterView<?> adapterView, View arg1, int arg2, long arg3) {
            if (autori.this.spinner.getSelectedItem().toString() == "Jindřich Šimon Baar") {
                autori.this.smaz();
                autori.this.jmeno.setText("Jindřich Šimon Baar");
                autori.this.narozen.setText("1869 - Klenčí pod Čerchovem");
                autori.this.umrti.setText("1925 - Klenčí pod Čerchovem");
                autori.this.narodnost.setText("Česká");
                autori.this.profese.setText("kaplan a farář ve Spáleném Poříčí");
                autori.this.smer.setText("Realismus, Katolická moderna");
                autori.this.nobelovka.setText("-");
                autori.this.skupina.setText("-");
                autori.this.dila.setText("Holoubek - román, Jan Cimbura, trilogie (Paní komisarka, Osmačtyřicátníci, Lůsy) ");
            }
            if (autori.this.spinner.getSelectedItem().toString() == "Johann Wolfgang Goethe") {
                autori.this.smaz();
                autori.this.jmeno.setText("Johann Wolfgang Goethe");
                autori.this.narozen.setText("1749 - Frankfurt nad Mohanem");
                autori.this.umrti.setText("1832 - Výmar");
                autori.this.narodnost.setText("Německá");
                autori.this.profese.setText("právník, státní úředník(ministr)");
                autori.this.smer.setText("Preromantismus");
                autori.this.nobelovka.setText("-");
                autori.this.skupina.setText("Sturm und Drang (Bouře a vzdor)");
                autori.this.dila.setText("Utrpení mladého Werthera, Faust");
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    };
    TextView jmeno;
    TextView narodnost;
    TextView narozen;
    TextView nobelovka;
    TextView profese;
    TextView skupina;
    TextView smer;
    Spinner spinner;
    TextView umrti;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_autori);
        setTitle("Seznam autorů");
        this.jmeno = (TextView) findViewById(R.id.textView_jmeno);
        this.narozen = (TextView) findViewById(R.id.textView_narozen);
        this.umrti = (TextView) findViewById(R.id.textView_umrti);
        this.narodnost = (TextView) findViewById(R.id.textView_narodnost);
        this.nobelovka = (TextView) findViewById(R.id.textView_nobelovka);
        this.profese = (TextView) findViewById(R.id.textView_profese);
        this.smer = (TextView) findViewById(R.id.textView_smer);
        this.skupina = (TextView) findViewById(R.id.textView_skupina);
        this.dila = (TextView) findViewById(R.id.textView_dila);
        this.spinner = (Spinner) findViewById(R.id.spinner2);
        this.spinner.setAdapter(new ArrayAdapter<>(this, 17367049, new String[]{"Jindřich Šimon Baar", "Johann Wolfgang Goethe"}));
        this.spinner.setOnItemSelectedListener(this.itemSelect);
    }

    public void smaz() {
        this.jmeno.setText("");
        this.narozen.setText("");
        this.umrti.setText("");
        this.narodnost.setText("");
        this.profese.setText("");
        this.smer.setText("");
        this.skupina.setText("");
        this.dila.setText("");
    }
}

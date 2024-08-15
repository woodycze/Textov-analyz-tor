package dominik.majap.Fyzika;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import dominik.majap.R;
import java.util.ArrayList;
import java.util.HashMap;

public class zakladni_jednotky extends AppCompatActivity {
    ListView listView;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_zakladni_jednotky);
        setRequestedOrientation(1);
        setTitle("Základní jednotky");
        this.listView = (ListView) findViewById(R.id.listView_zakladni);
        ArrayList<HashMap<String, String>> list = new ArrayList<>();
        new HashMap();
        HashMap hashmap = new HashMap();
        hashmap.put("nazev", "Obsah");
        hashmap.put("velicina", "S");
        hashmap.put("popis", "m²");
        list.add(hashmap);
        HashMap hashmap2 = new HashMap();
        hashmap2.put("nazev", "Objem");
        hashmap2.put("velicina", "V");
        hashmap2.put("popis", "m³");
        list.add(hashmap2);
        HashMap hashmap3 = new HashMap();
        hashmap3.put("nazev", "Hustota");
        hashmap3.put("velicina", "ρ");
        hashmap3.put("popis", "kg/m³");
        list.add(hashmap3);
        HashMap hashmap4 = new HashMap();
        hashmap4.put("nazev", "Dráha");
        hashmap4.put("velicina", "s");
        hashmap4.put("popis", "m");
        list.add(hashmap4);
        HashMap hashmap5 = new HashMap();
        hashmap5.put("nazev", "Rychlost");
        hashmap5.put("velicina", "v");
        hashmap5.put("popis", "m/s");
        list.add(hashmap5);
        HashMap hashmap6 = new HashMap();
        hashmap6.put("nazev", "Zrychlení");
        hashmap6.put("velicina", "a");
        hashmap6.put("popis", "m/2²");
        list.add(hashmap6);
        HashMap hashmap7 = new HashMap();
        hashmap7.put("nazev", "Síla");
        hashmap7.put("velicina", "F");
        hashmap7.put("popis", "N");
        list.add(hashmap7);
        HashMap hashmap8 = new HashMap();
        hashmap8.put("nazev", "Tíha");
        hashmap8.put("velicina", "G");
        hashmap8.put("popis", "N");
        list.add(hashmap8);
        HashMap hashmap9 = new HashMap();
        hashmap9.put("nazev", "Tlak");
        hashmap9.put("velicina", "p");
        hashmap9.put("popis", "Pa");
        list.add(hashmap9);
        HashMap hashmap10 = new HashMap();
        hashmap10.put("nazev", "Hydrostatický tlak");
        hashmap10.put("velicina", " ph");
        hashmap10.put("popis", "Pa");
        list.add(hashmap10);
        HashMap hashmap11 = new HashMap();
        hashmap11.put("nazev", "Atmosférický tlak");
        hashmap11.put("velicina", "pa");
        hashmap11.put("popis", "pa");
        list.add(hashmap11);
        HashMap hashmap12 = new HashMap();
        hashmap12.put("nazev", "Tlaková síla");
        hashmap12.put("velicina", "Ft");
        hashmap12.put("popis", "N");
        list.add(hashmap12);
        HashMap hashmap13 = new HashMap();
        hashmap13.put("nazev", "Moment síly");
        hashmap13.put("velicina", "M");
        hashmap13.put("popis", "N.m");
        list.add(hashmap13);
        HashMap hashmap14 = new HashMap();
        hashmap14.put("nazev", "Práce");
        hashmap14.put("velicina", "W");
        hashmap14.put("popis", "J");
        list.add(hashmap14);
        HashMap hashmap15 = new HashMap();
        hashmap15.put("nazev", "Výkon");
        hashmap15.put("velicina", "P");
        hashmap15.put("popis", "W");
        list.add(hashmap15);
        HashMap hashmap16 = new HashMap();
        hashmap16.put("nazev", "Teplo");
        hashmap16.put("velicina", "Q");
        hashmap16.put("popis", "J");
        list.add(hashmap16);
        HashMap hashmap17 = new HashMap();
        hashmap17.put("nazev", "Polohová energie");
        hashmap17.put("velicina", "Ep");
        hashmap17.put("popis", "J");
        list.add(hashmap17);
        HashMap hashmap18 = new HashMap();
        hashmap18.put("nazev", "Pohybová energie");
        hashmap18.put("velicina", "Ek");
        hashmap18.put("popis", "J");
        list.add(hashmap18);
        HashMap hashmap19 = new HashMap();
        hashmap19.put("nazev", "Vnitřní energie");
        hashmap19.put("velicina", "U");
        hashmap19.put("popis", "J");
        list.add(hashmap19);
        HashMap hashmap20 = new HashMap();
        hashmap20.put("nazev", "Frekvence");
        hashmap20.put("velicina", "f");
        hashmap20.put("popis", "Hz");
        list.add(hashmap20);
        HashMap hashmap21 = new HashMap();
        hashmap21.put("nazev", "Vlnová délka");
        hashmap21.put("velicina", "λ");
        hashmap21.put("popis", "m");
        list.add(hashmap21);
        HashMap hashmap22 = new HashMap();
        hashmap22.put("nazev", "Elektrický odpor");
        hashmap22.put("velicina", "R");
        hashmap22.put("popis", "Ω");
        list.add(hashmap22);
        HashMap hashmap23 = new HashMap();
        hashmap23.put("nazev", "Elektrická práce");
        hashmap23.put("velicina", "W");
        hashmap23.put("popis", "J");
        list.add(hashmap23);
        HashMap hashmap24 = new HashMap();
        hashmap24.put("nazev", "Výkon elektrického proudu");
        hashmap24.put("velicina", "P");
        hashmap24.put("popis", "W");
        list.add(hashmap24);
        HashMap hashmap25 = new HashMap();
        hashmap25.put("nazev", "Elektrické napětí");
        hashmap25.put("velicina", "U");
        hashmap25.put("popis", "V");
        list.add(hashmap25);
        this.listView.setAdapter(new SimpleAdapter(this, list, R.layout.custom_filter_tabulky, new String[]{"nazev", "velicina", "popis"}, new int[]{R.id.textView23, R.id.textView22, R.id.textView16}));
    }
}

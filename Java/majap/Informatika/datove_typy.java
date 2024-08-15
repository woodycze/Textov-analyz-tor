package dominik.majap.Informatika;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import dominik.majap.R;
import java.util.ArrayList;
import java.util.HashMap;

public class datove_typy extends AppCompatActivity {
    ListView listView;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_datove_typy);
        setRequestedOrientation(0);
        setTitle("Základní datové typy");
        this.listView = (ListView) findViewById(R.id.listView_datove_typy);
        ArrayList<HashMap<String, String>> list = new ArrayList<>();
        new HashMap();
        HashMap hashmap = new HashMap();
        hashmap.put("typ", "byte");
        hashmap.put("popis", "celé číslo");
        hashmap.put("velikost", "8 bitů");
        hashmap.put("min", "-128");
        hashmap.put("max", "+127");
        list.add(hashmap);
        HashMap hashmap2 = new HashMap();
        hashmap2.put("typ", "short");
        hashmap2.put("popis", "celé číslo");
        hashmap2.put("velikost", "16 bitů");
        hashmap2.put("min", "-32768");
        hashmap2.put("max", "+32767");
        list.add(hashmap2);
        HashMap hashmap3 = new HashMap();
        hashmap3.put("typ", "int");
        hashmap3.put("popis", "celé číslo");
        hashmap3.put("velikost", "32 bitů");
        hashmap3.put("min", "-2147483648");
        hashmap3.put("max", "+2147483647");
        list.add(hashmap3);
        HashMap hashmap4 = new HashMap();
        hashmap4.put("typ", "long");
        hashmap4.put("popis", "celé číslo");
        hashmap4.put("velikost", "64 bitů");
        hashmap4.put("min", "-9223372036854775808");
        hashmap4.put("max", "+9223372036854775807");
        list.add(hashmap4);
        HashMap hashmap5 = new HashMap();
        hashmap5.put("typ", "float");
        hashmap5.put("popis", "reálné číslo");
        hashmap5.put("velikost", "32 bitů");
        hashmap5.put("min", "-3.40282e+38");
        hashmap5.put("max", "+3.40282e+38");
        list.add(hashmap5);
        HashMap hashmap6 = new HashMap();
        hashmap6.put("typ", "double");
        hashmap6.put("popis", "reálné číslo");
        hashmap6.put("velikost", "64 bitů");
        hashmap6.put("min", "-1.79769e+308");
        hashmap6.put("max", "+1.79769e+308");
        list.add(hashmap6);
        HashMap hashmap7 = new HashMap();
        hashmap7.put("typ", "char");
        hashmap7.put("popis", "znak UNICODE");
        hashmap7.put("velikost", "16 bitů");
        hashmap7.put("min", "/u0000");
        hashmap7.put("max", "/uFFFF");
        list.add(hashmap7);
        HashMap hashmap8 = new HashMap();
        hashmap8.put("typ", "boolen");
        hashmap8.put("popis", "logická\nhodnota");
        hashmap8.put("velikost", "1 bit");
        hashmap8.put("min", "-");
        hashmap8.put("max", "-");
        list.add(hashmap8);
        this.listView.setAdapter(new SimpleAdapter(this, list, R.layout.custom_filter_dattypy, new String[]{"typ", "popis", "velikost", "min", "max"}, new int[]{R.id.textView29, R.id.textView13, R.id.textView22, R.id.textView16, R.id.textView28}));
    }
}

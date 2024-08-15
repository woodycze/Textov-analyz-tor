package dominik.majap.Cestina;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import dominik.majap.R;
import java.util.ArrayList;
import java.util.HashMap;

public class vyjmenovana_slova extends AppCompatActivity {
    ListView listView;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_vyjmenovana_slova);
        setRequestedOrientation(1);
        setTitle("Výjmenovaná slova");
        this.listView = (ListView) findViewById(R.id.listView_vyjmenovana);
        ArrayList<HashMap<String, String>> list = new ArrayList<>();
        new HashMap();
        HashMap hashmap = new HashMap();
        hashmap.put("pismeno", "b");
        hashmap.put("slova", "být, bydlit, obyvatel, byt, příbytek, nábytek, dobytek, obyčej, bystrý, bylina, kobyla, býk, Přibyslav");
        list.add(hashmap);
        HashMap hashmap2 = new HashMap();
        hashmap2.put("pismeno", "l");
        hashmap2.put("slova", "slyšet, mlýn, blýskat se, polykat, plynout, plýtvat, vzlykat, lysý, lýtko, lýko, lyže, pelyněk, plyš");
        list.add(hashmap2);
        HashMap hashmap3 = new HashMap();
        hashmap3.put("pismeno", "m");
        hashmap3.put("slova", "my, mýt, myslit, mýlit se, hmyz, myš, hlemýžď, mýtit, zamykat, smýkat, dmýchat, chmýří, nachomýtnout se, Litomyšl");
        list.add(hashmap3);
        HashMap hashmap4 = new HashMap();
        hashmap4.put("pismeno", "p");
        hashmap4.put("slova", "pýcha, pytel, pysk, netopýr, slepýš, pyl, kopyto, klopýtat, třpytit se, zpytovat, pykat, pýr, pýřit se, čepýřit se");
        list.add(hashmap4);
        HashMap hashmap5 = new HashMap();
        hashmap5.put("pismeno", "s");
        hashmap5.put("slova", "syn, sytý, sýr, syrový, sychravý, usychat, sýkora, sýček, sysel, syčet, sypat");
        list.add(hashmap5);
        HashMap hashmap6 = new HashMap();
        hashmap6.put("pismeno", "v");
        hashmap6.put("slova", "vy, vysoký, výt, výskat, zvykat, žvýkat, vydra, výr, vyžle, povyk, výheň a slova s předponou vy-, vý-");
        list.add(hashmap6);
        HashMap hashmap7 = new HashMap();
        hashmap7.put("pismeno", "z");
        hashmap7.put("slova", "brzy, jazyk, nazývat se, Ruzyně");
        list.add(hashmap7);
        this.listView.setAdapter(new SimpleAdapter(this, list, R.layout.custom_filter_vyjmenovanaslova, new String[]{"pismeno", "slova"}, new int[]{R.id.textView23, R.id.textView22}));
    }
}

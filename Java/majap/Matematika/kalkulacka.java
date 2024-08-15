package dominik.majap.Matematika;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import dominik.majap.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kalkulacka extends AppCompatActivity {
    private String displej = "";
    private TextView obraz;
    private TextView obraz_vysled;
    Button smazani;
    private String vys = "";
    private String vysledek = "";

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_kalkulacka);
        setRequestedOrientation(1);
        setTitle("Kalkulačka");
        this.obraz = (TextView) findViewById(R.id.obraz_textView);
        this.obraz.setText(this.displej);
        this.obraz_vysled = (TextView) findViewById(R.id.vysledek_textView);
        this.obraz_vysled.setText(this.vys);
        this.smazani = (Button) findViewById(R.id.button42);
    }

    private void aktualizujObraz() {
        this.obraz.setText(this.displej);
    }

    private double operace(String a, String b, String operator) {
        char c = 65535;
        switch (operator.hashCode()) {
            case 42:
                if (operator.equals("*")) {
                    c = 2;
                    break;
                }
                break;
            case 43:
                if (operator.equals("+")) {
                    c = 0;
                    break;
                }
                break;
            case 45:
                if (operator.equals("-")) {
                    c = 1;
                    break;
                }
                break;
            case 47:
                if (operator.equals("/")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Double.valueOf(a).doubleValue() + Double.valueOf(b).doubleValue();
            case 1:
                return Double.valueOf(a).doubleValue() - Double.valueOf(b).doubleValue();
            case 2:
                return Double.valueOf(a).doubleValue() * Double.valueOf(b).doubleValue();
            case 3:
                return Double.valueOf(a).doubleValue() / Double.valueOf(b).doubleValue();
            default:
                return -1.0d;
        }
    }

    private void smaz() {
        this.displej = "";
        this.vysledek = "";
    }

    public void klikCislo(View view) {
        this.displej += ((Button) view).getText();
        aktualizujObraz();
    }

    public void klikOperator(View view) {
        if (this.displej != "") {
            this.displej += ((Button) view).getText();
            aktualizujObraz();
        }
    }

    public void klikRovno(View view) {
        this.obraz_vysled.setText(vypocet(this.vysledek));
    }

    public void klikSmaz(View view) {
        smaz();
        aktualizujObraz();
    }

    public String vypocet(String cislo) {
        String[] cisla = this.displej.split("[-,+,*,/]");
        String[] znamenka = this.displej.split("[0-9,.]");
        ArrayList arrayList = new ArrayList();
        for (String str2 : znamenka) {
            if (str2 != null && str2.length() > 0) {
                arrayList.add(str2);
            }
        }
        List localList1 = Arrays.asList(cisla);
        List localList2 = Arrays.asList((String[]) arrayList.toArray(new String[arrayList.size()]));
        if (localList1.size() <= 1) {
            return (String) localList1.get(0);
        }
        String str1 = String.valueOf(operace((String) localList1.get(0), (String) localList1.get(1), (String) localList2.get(0)));
        if (localList1.size() < 1) {
            return str1;
        }
        for (int k = 2; k < localList1.size(); k++) {
            str1 = String.valueOf(operace(str1, (String) localList1.get(k), (String) localList2.get(k - 1)));
        }
        return str1;
    }
}

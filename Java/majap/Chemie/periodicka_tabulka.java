package dominik.majap.Chemie;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import dominik.majap.R;

public class periodicka_tabulka extends Activity {
    public static Button aktualni_prvek;
    public static TextView elektronegativita;
    public static TextView nazev_prvku;
    public static Button pozice_1;
    public static Button pozice_1A;
    public static Button pozice_1B;
    public static Button pozice_2;
    public static Button pozice_2A;
    public static Button pozice_2B;
    public static Button pozice_3;
    public static Button pozice_3A;
    public static Button pozice_3B;
    public static Button pozice_4;
    public static Button pozice_4A;
    public static Button pozice_4B;
    public static Button pozice_5;
    public static Button pozice_5A;
    public static Button pozice_5B;
    public static Button pozice_6;
    public static Button pozice_6A;
    public static Button pozice_6B;
    public static Button pozice_7;
    public static Button pozice_7A;
    public static Button pozice_7B;
    public static Button pozice_8A;
    public static Button pozice_8B_1;
    public static Button pozice_8B_2;
    public static Button pozice_8B_3;
    public static TextView protonove_cislo;
    public static TextView relativni_hmotnost;
    public static TextView znak_prvku;

    public void buttonClick_Tl(View view) {
        setDefault();
        protonove_cislo.setText("81");
        elektronegativita.setText("1,4");
        relativni_hmotnost.setText("204,37");
        znak_prvku.setText("Tl");
        nazev_prvku.setText("Thalium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80e17474"));
        pozice_6.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_3A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_ac(View view) {
        setDefault();
        protonove_cislo.setText("89");
        elektronegativita.setText("1");
        relativni_hmotnost.setText("227,03");
        znak_prvku.setText("Ac");
        nazev_prvku.setText("Aktinium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_7.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_3B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_ag(View view) {
        setDefault();
        protonove_cislo.setText("47");
        elektronegativita.setText("1,4");
        relativni_hmotnost.setText("107,87");
        znak_prvku.setText("Ag");
        nazev_prvku.setText("Stříbro");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_5.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_1B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_al(View view) {
        setDefault();
        protonove_cislo.setText("13");
        elektronegativita.setText("1,61");
        relativni_hmotnost.setText("26,98");
        znak_prvku.setText("Al");
        nazev_prvku.setText("Hliník");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80e17474"));
        pozice_3.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_3A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_ar(View view) {
        setDefault();
        protonove_cislo.setText("18");
        elektronegativita.setText("3,9");
        relativni_hmotnost.setText("39,95");
        znak_prvku.setText("Ar");
        nazev_prvku.setText("Argon");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80eec1ff"));
        pozice_3.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_8A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_as(View view) {
        setDefault();
        protonove_cislo.setText("33");
        elektronegativita.setText("2,2");
        relativni_hmotnost.setText("74,92");
        znak_prvku.setText("As");
        nazev_prvku.setText("Arsen");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80b0ddae"));
        pozice_4.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_5A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_at(View view) {
        setDefault();
        protonove_cislo.setText("85");
        elektronegativita.setText("1,9");
        relativni_hmotnost.setText("210");
        znak_prvku.setText("At");
        nazev_prvku.setText("Astat");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80ff8800"));
        pozice_6.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_7A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_au(View view) {
        setDefault();
        protonove_cislo.setText("79");
        elektronegativita.setText("1,4");
        relativni_hmotnost.setText("196,97");
        znak_prvku.setText("Au");
        nazev_prvku.setText("Zlato");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_6.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_1B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_b(View view) {
        setDefault();
        protonove_cislo.setText("5");
        elektronegativita.setText("2");
        relativni_hmotnost.setText("10,81");
        znak_prvku.setText("B");
        nazev_prvku.setText("Bor");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80b0ddae"));
        pozice_2.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_3A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_ba(View view) {
        setDefault();
        protonove_cislo.setText("56");
        elektronegativita.setText("0,97");
        relativni_hmotnost.setText("137,33");
        znak_prvku.setText("Ba");
        nazev_prvku.setText("Baryum");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#808d8200"));
        pozice_6.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_2A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_be(View view) {
        setDefault();
        protonove_cislo.setText("4");
        elektronegativita.setText("1,57");
        relativni_hmotnost.setText("9,01");
        znak_prvku.setText("Be");
        nazev_prvku.setText("Berylium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80e17474"));
        pozice_2.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_2A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_bh(View view) {
        setDefault();
        protonove_cislo.setText("107");
        elektronegativita.setText("");
        relativni_hmotnost.setText("272");
        znak_prvku.setText("Bh");
        nazev_prvku.setText("Bohrium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_7.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_7B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_bi(View view) {
        setDefault();
        protonove_cislo.setText("83");
        elektronegativita.setText("1,7");
        relativni_hmotnost.setText("208,98");
        znak_prvku.setText("Bi");
        nazev_prvku.setText("Bismut");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80e17474"));
        pozice_6.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_5A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_br(View view) {
        setDefault();
        protonove_cislo.setText("35");
        elektronegativita.setText("2,7");
        relativni_hmotnost.setText("79,90");
        znak_prvku.setText("Br");
        nazev_prvku.setText("Brom");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80ff8800"));
        pozice_4.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_7A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_c(View view) {
        setDefault();
        protonove_cislo.setText("6");
        elektronegativita.setText("2,5");
        relativni_hmotnost.setText("12,01");
        znak_prvku.setText("C");
        nazev_prvku.setText("Uhlík");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80fff700"));
        pozice_2.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_4A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_ca(View view) {
        setDefault();
        protonove_cislo.setText("20");
        elektronegativita.setText("1");
        relativni_hmotnost.setText("40,08");
        znak_prvku.setText("Ca");
        nazev_prvku.setText("Vápník");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#808d8200"));
        pozice_4.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_2A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_cd(View view) {
        setDefault();
        protonove_cislo.setText("48");
        elektronegativita.setText("1,5");
        relativni_hmotnost.setText("112,41");
        znak_prvku.setText("Cd");
        nazev_prvku.setText("Kadmium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_5.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_2B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_cl(View view) {
        setDefault();
        protonove_cislo.setText("17");
        elektronegativita.setText("2,8");
        relativni_hmotnost.setText("35,45");
        znak_prvku.setText("Cl");
        nazev_prvku.setText("Chlor");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80ff8800"));
        pozice_3.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_7A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_cn(View view) {
        setDefault();
        protonove_cislo.setText("112");
        elektronegativita.setText("");
        relativni_hmotnost.setText("285");
        znak_prvku.setText("Cn");
        nazev_prvku.setText("Copernicium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_7.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_2B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_co(View view) {
        setDefault();
        protonove_cislo.setText("27");
        elektronegativita.setText("1,7");
        relativni_hmotnost.setText("58,93");
        znak_prvku.setText("Co");
        nazev_prvku.setText("Kobalt");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_4.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_8B_2.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_cr(View view) {
        setDefault();
        protonove_cislo.setText("24");
        elektronegativita.setText("1,6");
        relativni_hmotnost.setText("52");
        znak_prvku.setText("Cr");
        nazev_prvku.setText("Chrom");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_4.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_6B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_cs(View view) {
        setDefault();
        protonove_cislo.setText("55");
        elektronegativita.setText("0,86");
        relativni_hmotnost.setText("132,91");
        znak_prvku.setText("Cs");
        nazev_prvku.setText("Cesium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#8017acbc"));
        pozice_6.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_1A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_cu(View view) {
        setDefault();
        protonove_cislo.setText("29");
        elektronegativita.setText("1,7");
        relativni_hmotnost.setText("63,54");
        znak_prvku.setText("Cu");
        nazev_prvku.setText("Měď");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_4.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_1B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_db(View view) {
        setDefault();
        protonove_cislo.setText("105");
        elektronegativita.setText("");
        relativni_hmotnost.setText("268");
        znak_prvku.setText("Db");
        nazev_prvku.setText("Dubnium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_7.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_5B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_ds(View view) {
        setDefault();
        protonove_cislo.setText("110");
        elektronegativita.setText("");
        relativni_hmotnost.setText("281");
        znak_prvku.setText("Ds");
        nazev_prvku.setText("Darmstadtium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_7.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_8B_3.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_f(View view) {
        setDefault();
        protonove_cislo.setText("9");
        elektronegativita.setText("3,98");
        relativni_hmotnost.setText("19");
        znak_prvku.setText("F");
        nazev_prvku.setText("Fluor");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80ff8800"));
        pozice_2.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_7A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_fe(View view) {
        setDefault();
        protonove_cislo.setText("26");
        elektronegativita.setText("1,6");
        relativni_hmotnost.setText("55,85");
        znak_prvku.setText("Fe");
        nazev_prvku.setText("Železo");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_4.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_8B_1.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_fl(View view) {
        setDefault();
        protonove_cislo.setText("114");
        elektronegativita.setText("");
        relativni_hmotnost.setText("289");
        znak_prvku.setText("Fl");
        nazev_prvku.setText("Flerovium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_7.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_4A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_fr(View view) {
        setDefault();
        protonove_cislo.setText("87");
        elektronegativita.setText("0,86");
        relativni_hmotnost.setText("223");
        znak_prvku.setText("Fr");
        nazev_prvku.setText("Francium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#8017acbc"));
        pozice_7.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_1A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_ga(View view) {
        setDefault();
        protonove_cislo.setText("31");
        elektronegativita.setText("1,8");
        relativni_hmotnost.setText("69,72");
        znak_prvku.setText("Ga");
        nazev_prvku.setText("Gallium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80e17474"));
        pozice_4.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_3A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_ge(View view) {
        setDefault();
        protonove_cislo.setText("32");
        elektronegativita.setText("2");
        relativni_hmotnost.setText("72,59");
        znak_prvku.setText("Ge");
        nazev_prvku.setText("Germanium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80b0ddae"));
        pozice_4.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_4A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_h(View view) {
        setDefault();
        protonove_cislo.setText("1");
        elektronegativita.setText("2,2");
        relativni_hmotnost.setText("1,008");
        znak_prvku.setText("H");
        nazev_prvku.setText("Vodík");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80fff700"));
        pozice_1.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_1A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_he(View view) {
        setDefault();
        protonove_cislo.setText("2");
        elektronegativita.setText("4,5");
        relativni_hmotnost.setText("4");
        znak_prvku.setText("He");
        nazev_prvku.setText("Helium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80eec1ff"));
        pozice_1.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_8A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_hf(View view) {
        setDefault();
        protonove_cislo.setText("72");
        elektronegativita.setText("1,2");
        relativni_hmotnost.setText("178,49");
        znak_prvku.setText("Hf");
        nazev_prvku.setText("Hafnium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_6.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_4B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_hg(View view) {
        setDefault();
        protonove_cislo.setText("80");
        elektronegativita.setText("1,4");
        relativni_hmotnost.setText("200,59");
        znak_prvku.setText("Hg");
        nazev_prvku.setText("Rtuť");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_6.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_2B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_hs(View view) {
        setDefault();
        protonove_cislo.setText("108");
        elektronegativita.setText("");
        relativni_hmotnost.setText("270");
        znak_prvku.setText("Hs");
        nazev_prvku.setText("Hassium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_7.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_8B_1.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_i(View view) {
        setDefault();
        protonove_cislo.setText("53");
        elektronegativita.setText("2,2");
        relativni_hmotnost.setText("126,90");
        znak_prvku.setText("I");
        nazev_prvku.setText("Jod");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80ff8800"));
        pozice_5.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_7A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_in(View view) {
        setDefault();
        protonove_cislo.setText("49");
        elektronegativita.setText("1,5");
        relativni_hmotnost.setText("114,82");
        znak_prvku.setText("In");
        nazev_prvku.setText("Indium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80e17474"));
        pozice_5.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_3A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_ir(View view) {
        setDefault();
        protonove_cislo.setText("77");
        elektronegativita.setText("1,5");
        relativni_hmotnost.setText("192,22");
        znak_prvku.setText("Ir");
        nazev_prvku.setText("Iridium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_6.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_8B_2.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_k(View view) {
        setDefault();
        protonove_cislo.setText("19");
        elektronegativita.setText("0,91");
        relativni_hmotnost.setText("39,10");
        znak_prvku.setText("K");
        nazev_prvku.setText("Draslík");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#8017acbc"));
        pozice_4.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_1A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_kr(View view) {
        setDefault();
        protonove_cislo.setText("36");
        elektronegativita.setText("3,6");
        relativni_hmotnost.setText("83,80");
        znak_prvku.setText("Kr");
        nazev_prvku.setText("Krypton");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80eec1ff"));
        pozice_4.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_8A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_la(View view) {
        setDefault();
        protonove_cislo.setText("57");
        elektronegativita.setText("1,1");
        relativni_hmotnost.setText("138,91");
        znak_prvku.setText("La");
        nazev_prvku.setText("Lanthan");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_6.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_3B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_li(View view) {
        setDefault();
        protonove_cislo.setText("3");
        elektronegativita.setText("0,97");
        relativni_hmotnost.setText("6,94");
        znak_prvku.setText("Li");
        nazev_prvku.setText("Lithium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#8017acbc"));
        pozice_2.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_1A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_lv(View view) {
        setDefault();
        protonove_cislo.setText("116");
        elektronegativita.setText("");
        relativni_hmotnost.setText("293");
        znak_prvku.setText("Lv");
        nazev_prvku.setText("Livermorium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_7.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_6A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_mc(View view) {
        setDefault();
        protonove_cislo.setText("115");
        elektronegativita.setText("");
        relativni_hmotnost.setText("289");
        znak_prvku.setText("Mc");
        nazev_prvku.setText("Moskovium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_7.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_5A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_mg(View view) {
        setDefault();
        protonove_cislo.setText("12");
        elektronegativita.setText("1,2");
        relativni_hmotnost.setText("24,31");
        znak_prvku.setText("Mg");
        nazev_prvku.setText("Hořčík");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80e17474"));
        pozice_3.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_2A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_mn(View view) {
        setDefault();
        protonove_cislo.setText("25");
        elektronegativita.setText("1,6");
        relativni_hmotnost.setText("54,94");
        znak_prvku.setText("Mn");
        nazev_prvku.setText("Mangan");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_4.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_7B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_mo(View view) {
        setDefault();
        protonove_cislo.setText("42");
        elektronegativita.setText("1,3");
        relativni_hmotnost.setText("95,94");
        znak_prvku.setText("Mo");
        nazev_prvku.setText("Molybden");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_5.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_6B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_mt(View view) {
        setDefault();
        protonove_cislo.setText("109");
        elektronegativita.setText("");
        relativni_hmotnost.setText("276");
        znak_prvku.setText("Mt");
        nazev_prvku.setText("Meitnerium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_7.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_8B_2.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_n(View view) {
        setDefault();
        protonove_cislo.setText("7");
        elektronegativita.setText("3,1");
        relativni_hmotnost.setText("14,01");
        znak_prvku.setText("N");
        nazev_prvku.setText("Dusík");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80fff700"));
        pozice_2.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_5A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_na(View view) {
        setDefault();
        protonove_cislo.setText("11");
        elektronegativita.setText("1");
        relativni_hmotnost.setText("22,99");
        znak_prvku.setText("Na");
        nazev_prvku.setText("Sodík");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#8017acbc"));
        pozice_3.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_1A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_nb(View view) {
        setDefault();
        protonove_cislo.setText("41");
        elektronegativita.setText("1,2");
        relativni_hmotnost.setText("92,91");
        znak_prvku.setText("Nb");
        nazev_prvku.setText("Niob");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_5.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_5B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_ne(View view) {
        setDefault();
        protonove_cislo.setText("10");
        elektronegativita.setText("4");
        relativni_hmotnost.setText("20,18");
        znak_prvku.setText("Ne");
        nazev_prvku.setText("Neon");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80eec1ff"));
        pozice_2.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_8A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_nh(View view) {
        setDefault();
        protonove_cislo.setText("113");
        elektronegativita.setText("");
        relativni_hmotnost.setText("286");
        znak_prvku.setText("Nh");
        nazev_prvku.setText("Nihonium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80e17474"));
        pozice_7.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_3A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_ni(View view) {
        setDefault();
        protonove_cislo.setText("28");
        elektronegativita.setText("1,7");
        relativni_hmotnost.setText("58,70");
        znak_prvku.setText("Ni");
        nazev_prvku.setText("Nikl");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_4.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_8B_3.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_o(View view) {
        setDefault();
        protonove_cislo.setText("8");
        elektronegativita.setText("3,5");
        relativni_hmotnost.setText("16");
        znak_prvku.setText("O");
        nazev_prvku.setText("Kyslík");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80fff700"));
        pozice_2.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_6A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_og(View view) {
        setDefault();
        protonove_cislo.setText("118");
        elektronegativita.setText("");
        relativni_hmotnost.setText("294");
        znak_prvku.setText("Og");
        nazev_prvku.setText("Oganesson");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80eec1ff"));
        pozice_7.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_8A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_os(View view) {
        setDefault();
        protonove_cislo.setText("76");
        elektronegativita.setText("1,5");
        relativni_hmotnost.setText("190,20");
        znak_prvku.setText("Os");
        nazev_prvku.setText("Osmium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_6.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_8B_1.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_p(View view) {
        setDefault();
        protonove_cislo.setText("15");
        elektronegativita.setText("2,1");
        relativni_hmotnost.setText("30,97");
        znak_prvku.setText("P");
        nazev_prvku.setText("Fosfor");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80fff700"));
        pozice_3.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_5A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_pb(View view) {
        setDefault();
        protonove_cislo.setText("82");
        elektronegativita.setText("1,5");
        relativni_hmotnost.setText("207,20");
        znak_prvku.setText("Pb");
        nazev_prvku.setText("Olovo");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80e17474"));
        pozice_6.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_4A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_pd(View view) {
        setDefault();
        protonove_cislo.setText("46");
        elektronegativita.setText("1,3");
        relativni_hmotnost.setText("106,42");
        znak_prvku.setText("Pd");
        nazev_prvku.setText("Palladium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_5.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_8B_3.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_po(View view) {
        setDefault();
        protonove_cislo.setText("84");
        elektronegativita.setText("1,8");
        relativni_hmotnost.setText("209");
        znak_prvku.setText("Po");
        nazev_prvku.setText("Polonium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80b0ddae"));
        pozice_6.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_6A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_pt(View view) {
        setDefault();
        protonove_cislo.setText("78");
        elektronegativita.setText("1,4");
        relativni_hmotnost.setText("195,09");
        znak_prvku.setText("Pt");
        nazev_prvku.setText("Platina");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_6.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_8B_3.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_ra(View view) {
        setDefault();
        protonove_cislo.setText("88");
        elektronegativita.setText("0,97");
        relativni_hmotnost.setText("226,03");
        znak_prvku.setText("Ra");
        nazev_prvku.setText("Radium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#808d8200"));
        pozice_7.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_2A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_rb(View view) {
        setDefault();
        protonove_cislo.setText("37");
        elektronegativita.setText("0,89");
        relativni_hmotnost.setText("85,47");
        znak_prvku.setText("Rb");
        nazev_prvku.setText("Rubidium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#8017acbc"));
        pozice_5.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_1A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_re(View view) {
        setDefault();
        protonove_cislo.setText("75");
        elektronegativita.setText("1,5");
        relativni_hmotnost.setText("186,21");
        znak_prvku.setText("Re");
        nazev_prvku.setText("Rhenium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_6.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_7B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_rf(View view) {
        setDefault();
        protonove_cislo.setText("104");
        elektronegativita.setText("");
        relativni_hmotnost.setText("261,11");
        znak_prvku.setText("Rf");
        nazev_prvku.setText("Rutherfordium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_7.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_4B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_rg(View view) {
        setDefault();
        protonove_cislo.setText("111");
        elektronegativita.setText("");
        relativni_hmotnost.setText("280");
        znak_prvku.setText("Rg");
        nazev_prvku.setText("Roentgenium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_7.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_1B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_rh(View view) {
        setDefault();
        protonove_cislo.setText("45");
        elektronegativita.setText("1,4");
        relativni_hmotnost.setText("102,91");
        znak_prvku.setText("Rh");
        nazev_prvku.setText("Rhodium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_5.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_8B_2.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_rn(View view) {
        setDefault();
        protonove_cislo.setText("86");
        elektronegativita.setText("2");
        relativni_hmotnost.setText("222");
        znak_prvku.setText("Rn");
        nazev_prvku.setText("Radon");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80eec1ff"));
        pozice_6.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_8A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_ru(View view) {
        setDefault();
        protonove_cislo.setText("44");
        elektronegativita.setText("1,4");
        relativni_hmotnost.setText("101,07");
        znak_prvku.setText("Ru");
        nazev_prvku.setText("Ruthenium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_5.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_8B_1.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_s(View view) {
        setDefault();
        protonove_cislo.setText("16");
        elektronegativita.setText("2,4");
        relativni_hmotnost.setText("32,06");
        znak_prvku.setText("S");
        nazev_prvku.setText("Síra");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80fff700"));
        pozice_3.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_6A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_sb(View view) {
        setDefault();
        protonove_cislo.setText("51");
        elektronegativita.setText("1,8");
        relativni_hmotnost.setText("121,75");
        znak_prvku.setText("Sb");
        nazev_prvku.setText("Antimon");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80b0ddae"));
        pozice_5.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_5A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_sc(View view) {
        setDefault();
        protonove_cislo.setText("21");
        elektronegativita.setText("1,2");
        relativni_hmotnost.setText("44,96");
        znak_prvku.setText("Sc");
        nazev_prvku.setText("Skandium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_4.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_3B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_se(View view) {
        setDefault();
        protonove_cislo.setText("34");
        elektronegativita.setText("2,5");
        relativni_hmotnost.setText("78,96");
        znak_prvku.setText("Se");
        nazev_prvku.setText("Selen");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80fff700"));
        pozice_4.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_6A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_sg(View view) {
        setDefault();
        protonove_cislo.setText("106");
        elektronegativita.setText("");
        relativni_hmotnost.setText("271");
        znak_prvku.setText("Sg");
        nazev_prvku.setText("Seaborgium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_7.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_6B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_si(View view) {
        setDefault();
        protonove_cislo.setText("14");
        elektronegativita.setText("1,9");
        relativni_hmotnost.setText("28,09");
        znak_prvku.setText("Si");
        nazev_prvku.setText("Křemík");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80b0ddae"));
        pozice_3.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_6A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_sn(View view) {
        setDefault();
        protonove_cislo.setText("50");
        elektronegativita.setText("1,7");
        relativni_hmotnost.setText("118,69");
        znak_prvku.setText("Sn");
        nazev_prvku.setText("Cín");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80e17474"));
        pozice_5.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_4A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_sr(View view) {
        setDefault();
        protonove_cislo.setText("38");
        elektronegativita.setText("0,99");
        relativni_hmotnost.setText("87,62");
        znak_prvku.setText("Sr");
        nazev_prvku.setText("Stroncium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#808d8200"));
        pozice_5.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_2A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_ta(View view) {
        setDefault();
        protonove_cislo.setText("73");
        elektronegativita.setText("1,3");
        relativni_hmotnost.setText("180,95");
        znak_prvku.setText("Ta");
        nazev_prvku.setText("Tantal");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_6.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_5B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_tc(View view) {
        setDefault();
        protonove_cislo.setText("43");
        elektronegativita.setText("1,4");
        relativni_hmotnost.setText("97");
        znak_prvku.setText("Tc");
        nazev_prvku.setText("Technecium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_5.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_7B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_te(View view) {
        setDefault();
        protonove_cislo.setText("52");
        elektronegativita.setText("2");
        relativni_hmotnost.setText("127,60");
        znak_prvku.setText("Te");
        nazev_prvku.setText("Tellur");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80b0ddae"));
        pozice_5.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_6A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_ti(View view) {
        setDefault();
        protonove_cislo.setText("22");
        elektronegativita.setText("1,3");
        relativni_hmotnost.setText("47,90");
        znak_prvku.setText("Ti");
        nazev_prvku.setText("Titanium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_4.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_4B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_ts(View view) {
        setDefault();
        protonove_cislo.setText("117");
        elektronegativita.setText("");
        relativni_hmotnost.setText("294");
        znak_prvku.setText("Ts");
        nazev_prvku.setText("Tennessin");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80ff8800"));
        pozice_7.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_7A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_v(View view) {
        setDefault();
        protonove_cislo.setText("23");
        elektronegativita.setText("1,5");
        relativni_hmotnost.setText("50,94");
        znak_prvku.setText("V");
        nazev_prvku.setText("Vanad");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_4.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_5B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_w(View view) {
        setDefault();
        protonove_cislo.setText("74");
        elektronegativita.setText("1,3");
        relativni_hmotnost.setText("183,85");
        znak_prvku.setText("W");
        nazev_prvku.setText("Wolfram");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_6.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_6B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_xe(View view) {
        setDefault();
        protonove_cislo.setText("54");
        elektronegativita.setText("2,2");
        relativni_hmotnost.setText("131,30");
        znak_prvku.setText("Xe");
        nazev_prvku.setText("Xenon");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80eec1ff"));
        pozice_5.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_8A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_y(View view) {
        setDefault();
        protonove_cislo.setText("39");
        elektronegativita.setText("1,1");
        relativni_hmotnost.setText("88,91");
        znak_prvku.setText("Y");
        nazev_prvku.setText("Yttrium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_5.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_3B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_zn(View view) {
        setDefault();
        protonove_cislo.setText("30");
        elektronegativita.setText("1,7");
        relativni_hmotnost.setText("65,38");
        znak_prvku.setText("Zn");
        nazev_prvku.setText("Zinek");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_4.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_2B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_zr(View view) {
        setDefault();
        protonove_cislo.setText("40");
        elektronegativita.setText("1,2");
        relativni_hmotnost.setText("91,22");
        znak_prvku.setText("Zr");
        nazev_prvku.setText("Zirkonium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80d7cd63"));
        pozice_5.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_4B.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void buttonClick_ce(View view) {
        setDefault();
        protonove_cislo.setText("58");
        elektronegativita.setText("1,1");
        relativni_hmotnost.setText("140,15");
        znak_prvku.setText("Ce");
        nazev_prvku.setText("Cer");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80006E09"));
    }

    public void buttonClick_Pr(View view) {
        setDefault();
        protonove_cislo.setText("59");
        elektronegativita.setText("1,1");
        relativni_hmotnost.setText("140,91");
        znak_prvku.setText("Pr");
        nazev_prvku.setText("Praseodym");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80006E09"));
    }

    public void buttonClick_Nd(View view) {
        setDefault();
        protonove_cislo.setText("60");
        elektronegativita.setText("1,1");
        relativni_hmotnost.setText("144,24");
        znak_prvku.setText("Nd");
        nazev_prvku.setText("Neodym");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80006E09"));
    }

    public void buttonClick_Pm(View view) {
        setDefault();
        protonove_cislo.setText("61");
        elektronegativita.setText("1,1");
        relativni_hmotnost.setText("146,92");
        znak_prvku.setText("Pm");
        nazev_prvku.setText("Promethium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80006E09"));
    }

    public void buttonClick_sm(View view) {
        setDefault();
        protonove_cislo.setText("62");
        elektronegativita.setText("1,1");
        relativni_hmotnost.setText("150,36");
        znak_prvku.setText("Sm");
        nazev_prvku.setText("Samarinum");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80006E09"));
    }

    public void buttonClick_eu(View view) {
        setDefault();
        protonove_cislo.setText("63");
        elektronegativita.setText("1");
        relativni_hmotnost.setText("151,97");
        znak_prvku.setText("Eu");
        nazev_prvku.setText("Europium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80006E09"));
    }

    public void buttonClick_gd(View view) {
        setDefault();
        protonove_cislo.setText("64");
        elektronegativita.setText("1,1");
        relativni_hmotnost.setText("157,25");
        znak_prvku.setText("Gd");
        nazev_prvku.setText("Gadolinium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80006E09"));
    }

    public void buttonClick_tb(View view) {
        setDefault();
        protonove_cislo.setText("65");
        elektronegativita.setText("1,1");
        relativni_hmotnost.setText("158,93");
        znak_prvku.setText("Tb");
        nazev_prvku.setText("Terbium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80006E09"));
    }

    public void buttonClick_dy(View view) {
        setDefault();
        protonove_cislo.setText("66");
        elektronegativita.setText("1,1");
        relativni_hmotnost.setText("162,5");
        znak_prvku.setText("Dy");
        nazev_prvku.setText("Dysprosium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80006E09"));
    }

    public void buttonClick_ho(View view) {
        setDefault();
        protonove_cislo.setText("67");
        elektronegativita.setText("1,1");
        relativni_hmotnost.setText("164,93");
        znak_prvku.setText("Ho");
        nazev_prvku.setText("Holmium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80006E09"));
    }

    public void buttonClick_er(View view) {
        setDefault();
        protonove_cislo.setText("68");
        elektronegativita.setText("1,1");
        relativni_hmotnost.setText("167,26");
        znak_prvku.setText("Er");
        nazev_prvku.setText("Erbium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80006E09"));
    }

    public void buttonClick_tm(View view) {
        setDefault();
        protonove_cislo.setText("69");
        elektronegativita.setText("1,1");
        relativni_hmotnost.setText("168,93");
        znak_prvku.setText("Tm");
        nazev_prvku.setText("Thulium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80006E09"));
    }

    public void buttonClick_yb(View view) {
        setDefault();
        protonove_cislo.setText("70");
        elektronegativita.setText("1,1");
        relativni_hmotnost.setText("173,04");
        znak_prvku.setText("Yb");
        nazev_prvku.setText("Ytterbium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80006E09"));
    }

    public void buttonClick_Lu(View view) {
        setDefault();
        protonove_cislo.setText("71");
        elektronegativita.setText("1,1");
        relativni_hmotnost.setText("174,97");
        znak_prvku.setText("Lu");
        nazev_prvku.setText("Lutecium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80006E09"));
    }

    public void buttonClick_th(View view) {
        setDefault();
        protonove_cislo.setText("90");
        elektronegativita.setText("1,1");
        relativni_hmotnost.setText("232,04");
        znak_prvku.setText("Th");
        nazev_prvku.setText("Thorium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80160057"));
    }

    public void buttonClick_pa(View view) {
        setDefault();
        protonove_cislo.setText("91");
        elektronegativita.setText("1,1");
        relativni_hmotnost.setText("231,04");
        znak_prvku.setText("Pa");
        nazev_prvku.setText("Protaktinium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80160057"));
    }

    public void buttonClick_u(View view) {
        setDefault();
        protonove_cislo.setText("92");
        elektronegativita.setText("1,2");
        relativni_hmotnost.setText("238,03");
        znak_prvku.setText("U");
        nazev_prvku.setText("Uran");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80160057"));
    }

    public void buttonClick_Np(View view) {
        setDefault();
        protonove_cislo.setText("93");
        elektronegativita.setText("1,2");
        relativni_hmotnost.setText("237,05");
        znak_prvku.setText("Np");
        nazev_prvku.setText("Neptunium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80160057"));
    }

    public void buttonClick_pu(View view) {
        setDefault();
        protonove_cislo.setText("94");
        elektronegativita.setText("1,2");
        relativni_hmotnost.setText("244,06");
        znak_prvku.setText("Pu");
        nazev_prvku.setText("Plutonium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80160057"));
    }

    public void buttonClick_am(View view) {
        setDefault();
        protonove_cislo.setText("95");
        elektronegativita.setText("1,2");
        relativni_hmotnost.setText("243,06");
        znak_prvku.setText("Am");
        nazev_prvku.setText("Americium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80160057"));
    }

    public void buttonClick_cm(View view) {
        setDefault();
        protonove_cislo.setText("96");
        elektronegativita.setText("1,2");
        relativni_hmotnost.setText("247,07");
        znak_prvku.setText("Cm");
        nazev_prvku.setText("Curium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80160057"));
    }

    public void buttonClick_bk(View view) {
        setDefault();
        protonove_cislo.setText("97");
        elektronegativita.setText("1,2");
        relativni_hmotnost.setText("247,07");
        znak_prvku.setText("Bk");
        nazev_prvku.setText("Berkelium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80160057"));
    }

    public void buttonClick_cf(View view) {
        setDefault();
        protonove_cislo.setText("98");
        elektronegativita.setText("1,2");
        relativni_hmotnost.setText("251,08");
        znak_prvku.setText("Cf");
        nazev_prvku.setText("Kalifornoim");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80160057"));
    }

    public void buttonClick_es(View view) {
        setDefault();
        protonove_cislo.setText("99");
        elektronegativita.setText("1,2");
        relativni_hmotnost.setText("252,08");
        znak_prvku.setText("Es");
        nazev_prvku.setText("Einsteinium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80160057"));
    }

    public void buttonClick_fm(View view) {
        setDefault();
        protonove_cislo.setText("100");
        elektronegativita.setText("1,2");
        relativni_hmotnost.setText("257,1");
        znak_prvku.setText("Fm");
        nazev_prvku.setText("Fermium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80160057"));
    }

    public void buttonClick_md(View view) {
        setDefault();
        protonove_cislo.setText("101");
        elektronegativita.setText("1,2");
        relativni_hmotnost.setText("258,1");
        znak_prvku.setText("Md");
        nazev_prvku.setText("Mendelevium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80160057"));
    }

    public void buttonClick_no(View view) {
        setDefault();
        protonove_cislo.setText("102");
        elektronegativita.setText("1,2");
        relativni_hmotnost.setText("259,10");
        znak_prvku.setText("No");
        nazev_prvku.setText("Nobelium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80160057"));
    }

    public void buttonClick_lr(View view) {
        setDefault();
        protonove_cislo.setText("103");
        elektronegativita.setText("1,2");
        relativni_hmotnost.setText("260,11");
        znak_prvku.setText("Lr");
        nazev_prvku.setText("Lawrencium");
        aktualni_prvek.setBackgroundColor(Color.parseColor("#80160057"));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_periodicka_tabulka);
        setRequestedOrientation(0);
        setTitle("Periodická tabulka");
        protonove_cislo = (TextView) findViewById(R.id.textView4);
        elektronegativita = (TextView) findViewById(R.id.textView7);
        relativni_hmotnost = (TextView) findViewById(R.id.textView5);
        znak_prvku = (TextView) findViewById(R.id.textView3);
        nazev_prvku = (TextView) findViewById(R.id.textView6);
        aktualni_prvek = (Button) findViewById(R.id.button196);
        pozice_1 = (Button) findViewById(R.id.button39);
        pozice_2 = (Button) findViewById(R.id.button173);
        pozice_3 = (Button) findViewById(R.id.button18);
        pozice_4 = (Button) findViewById(R.id.button175);
        pozice_5 = (Button) findViewById(R.id.button176);
        pozice_6 = (Button) findViewById(R.id.button177);
        pozice_7 = (Button) findViewById(R.id.button174);
        pozice_1A = (Button) findViewById(R.id.button178);
        pozice_2A = (Button) findViewById(R.id.button179);
        pozice_3B = (Button) findViewById(R.id.button180);
        pozice_4B = (Button) findViewById(R.id.button181);
        pozice_5B = (Button) findViewById(R.id.button182);
        pozice_6B = (Button) findViewById(R.id.button183);
        pozice_7B = (Button) findViewById(R.id.button184);
        pozice_8B_1 = (Button) findViewById(R.id.button185);
        pozice_8B_2 = (Button) findViewById(R.id.button186);
        pozice_8B_3 = (Button) findViewById(R.id.button187);
        pozice_1B = (Button) findViewById(R.id.button188);
        pozice_2B = (Button) findViewById(R.id.button189);
        pozice_3A = (Button) findViewById(R.id.button191);
        pozice_4A = (Button) findViewById(R.id.button192);
        pozice_5A = (Button) findViewById(R.id.button193);
        pozice_6A = (Button) findViewById(R.id.button194);
        pozice_7A = (Button) findViewById(R.id.button195);
        pozice_8A = (Button) findViewById(R.id.button3);
        pozice_1.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
        pozice_1A.setBackgroundResource(R.drawable.oznaceni_pozice_prvku);
    }

    public void setDefault() {
        pozice_1.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_2.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_3.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_4.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_5.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_6.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_7.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_1A.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_2A.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_3B.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_4B.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_5B.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_6B.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_7B.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_8B_1.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_8B_2.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_8B_3.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_1B.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_2B.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_3A.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_4A.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_5A.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_6A.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_7A.setBackgroundResource(R.drawable.pozice_prvku);
        pozice_8A.setBackgroundResource(R.drawable.pozice_prvku);
    }
}

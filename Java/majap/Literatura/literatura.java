package dominik.majap.Literatura;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import dominik.majap.R;

public class literatura extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_literatura);
        setTitle("Literatura");
    }

    public void otevri_autori(View view) {
        startActivity(new Intent(this, autori.class));
    }
}

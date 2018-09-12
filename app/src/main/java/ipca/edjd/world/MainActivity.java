package ipca.edjd.world;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    //just making sure this is working
    int count = 0;
    boolean tradutor = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textv = new TextView(this);
        textv.setText("hello there:");


        Button btn = new Button(this);
        btn.setText("Traduzir");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tradutor) {
                    count++;
                    textv.setText("olá mundo: " + count);
                    tradutor = false;
                } else {
                    count++;
                    textv.setText("hello there: " + count);
                    tradutor = true;
                }
            }
        });

        LinearLayout lines = new LinearLayout(this);
        lines.addView(textv);
        lines.addView(btn);

        setContentView(lines);
    }
}

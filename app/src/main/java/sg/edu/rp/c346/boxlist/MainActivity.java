package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvColour;
    ArrayList<ColourItem> alColourItem;
    CustomAdapter caColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColour = findViewById(R.id.ListViewColour);

        alColourItem = new ArrayList<>();
        ColourItem item1 = new ColourItem("Blue");
        alColourItem.add(item1);
        ColourItem item2 = new ColourItem("Orange");
        alColourItem.add(item2);
        ColourItem item3 = new ColourItem("Brown");
        alColourItem.add(item3);
        caColour = new CustomAdapter(this, R.layout.color_item, alColourItem);

        lvColour.setAdapter(caColour);

    }
}

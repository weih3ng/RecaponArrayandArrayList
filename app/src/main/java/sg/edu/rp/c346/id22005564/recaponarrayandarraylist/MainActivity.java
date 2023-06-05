package sg.edu.rp.c346.id22005564.recaponarrayandarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ArrayList<String> fruits;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);

//        fruits = new String[3];
//        fruits[0] = "apple";
//        fruits[1] = "banana";
//        fruits[2] = "cherry";
        fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        String displayText = "Fruits\n" +
                "=====\n";

        for (String fruit : fruits) {
            displayText += fruit + "\n";
        }

        tv.setText(displayText);
    }
}








package sg.edu.rp.c346.simplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<String> alMovies = new ArrayList<>();
    ArrayAdapter<String> aaMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMovie=findViewById(R.id.listViewMovie);
        alMovies.add("Avengers Infinity War Release Date: 2018.04");
        alMovies.add("Justice League Release Date: 2017.11");

        aaMovie=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,alMovies);
        lvMovie.setAdapter(aaMovie);
    }
}

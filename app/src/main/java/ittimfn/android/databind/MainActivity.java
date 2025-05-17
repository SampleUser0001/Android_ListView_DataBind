package ittimfn.android.databind;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import ittimfn.android.databind.R;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import ittimfn.android.databind.DataRecode;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Sample data
        List<DataRecode> data = new ArrayList<>();
        data.add(new DataRecode("Main 1", "Sub 1", true));
        data.add(new DataRecode("Main 2", "Sub 2", false));
        data.add(new DataRecode("Main 3", "Sub 3", true));
        data.add(new DataRecode("Main 4", "Sub 4", false));
        data.add(new DataRecode("Main 5", "Sub 5", true));

        MyAdapter adapter = new MyAdapter(data);
        recyclerView.setAdapter(adapter);
    }

    
}
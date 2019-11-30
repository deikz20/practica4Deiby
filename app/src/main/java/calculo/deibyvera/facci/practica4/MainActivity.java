package calculo.deibyvera.facci.practica4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        ArrayList<String> tareas = new ArrayList<>();
        for (int item = 0; item <= 0; item++) {
            tareas.add("Item" + item);
            tareas.add("Logan" + item);
            tareas.add("deiby" + item);
            tareas.add("juan" + item);
            tareas.add("pedro" + item);
            tareas.add("tito" + item);
            tareas.add("tinoco" + item);
        }
        TareasRecyclerViewAdapter adapter = new TareasRecyclerViewAdapter(this, tareas);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}


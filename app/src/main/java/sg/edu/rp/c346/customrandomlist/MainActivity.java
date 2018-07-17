package sg.edu.rp.c346.customrandomlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvRandom;
    ArrayList<ToDoItem> alRandom;
    CustomRandomAdapter caRandom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvRandom=findViewById(R.id.listViewRandom);
        alRandom=new ArrayList<>();

        Calendar date1= Calendar.getInstance();
        date1.set(2018,7,1);

        Calendar date2= Calendar.getInstance();
        date2.set(2018,9,22);

        ToDoItem item1=new ToDoItem("MSA",date1);
        ToDoItem item2=new ToDoItem("Go for haircut",date2);

        alRandom.add(item1);
        alRandom.add(item2);

        caRandom=new  CustomRandomAdapter(this,R.layout.random_item,alRandom);
        lvRandom.setAdapter(caRandom);

    }
}

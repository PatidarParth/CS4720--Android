package edu.virginia.cs.cs4720.uvabucketlist;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class BucketListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucket_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.addItem);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String popup = "Add an item to your BucketList";
                Snackbar.make(view, popup, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        BucketItem[] data = new BucketItem[]{
                new BucketItem("Finish MileStone 1", "9-04-2017"),
                new BucketItem("Streak the Lawn", "09-05-2017"),
                new BucketItem("Eat Roots", "09-08-2017"),
                new BucketItem("Get an A in CS4720", "12-15-2017")
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        BucketListAdapter adapter = new BucketListAdapter(data);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}

package com.aviral.foodapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.aviral.foodapp.Adapter.CategoryAdapter;
import com.aviral.foodapp.Adapter.FeedAdapter;
import com.aviral.foodapp.Domain.CategoryDomain;
import com.aviral.foodapp.Domain.FeedDomain;
import com.aviral.foodapp.R;
import com.aviral.foodapp.Utils.RecyclerViewMargin;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter recyclerViewAdapter, feedAdapter;
    private RecyclerView categoriesRecyclerView, feedRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCategory();
        feedRecyclerView();

    }

    private void recyclerViewCategory() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false);

        categoriesRecyclerView = findViewById(R.id.recyclerView2);
        categoriesRecyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category = new ArrayList<>();
        category.add(new CategoryDomain("Pizza", "cat_1"));
        category.add(new CategoryDomain("Burger", "cat_2"));
        category.add(new CategoryDomain("Hot Dog", "cat_3"));
        category.add(new CategoryDomain("Drinks", "cat_4"));
        category.add(new CategoryDomain("Donut", "cat_5"));

        recyclerViewAdapter = new CategoryAdapter(category);

        RecyclerViewMargin recyclerViewMargin = new RecyclerViewMargin(10, 5);
        categoriesRecyclerView.addItemDecoration(recyclerViewMargin);

        categoriesRecyclerView.setAdapter(recyclerViewAdapter);
    }

    private void feedRecyclerView() {
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
//                LinearLayoutManager.HORIZONTAL, false);
//
//        feedRecyclerView = findViewById(R.id.feed_recycler_view);
//        feedRecyclerView.setLayoutManager(linearLayoutManager);
//
//        ArrayList<FeedDomain> feedDomains = new ArrayList<>();
//        feedDomains.add(new FeedDomain("Pepporoni Pizza", "pop_1", "Silces of pepporoni, Cheese, Meonaze with chilli flakes and Tomoto sauce", 180.0));
//        feedDomains.add(new FeedDomain("Allo Tikki Burger", "pop_2", "Fried Burger with 2 allo tikki, panner and silces of onion, tomato and cucumber with chili and tomato sauce", 30.0));
//        feedDomains.add(new FeedDomain("Vegetable Pizza", "pop_3", "Mixed Vegetable Pizza", 260.0));
//
//        RecyclerViewMargin recyclerViewMargin = new RecyclerViewMargin(10, 5);
//        feedRecyclerView.addItemDecoration(recyclerViewMargin);
//
//        feedAdapter = new FeedAdapter(feedDomains);
//        feedRecyclerView.setAdapter(feedAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false);

        feedRecyclerView = findViewById(R.id.feed_recycler_view);
        feedRecyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<FeedDomain> feedDomains = new ArrayList<>();
        feedDomains.add(new FeedDomain("Pepporoni Pizza", "pop_1", "Silces of pepporoni, Cheese, Meonaze with chilli flakes and Tomoto sauce", 180.0));
        feedDomains.add(new FeedDomain("Allo Tikki Burger", "pop_2", "Fried Burger with 2 allo tikki, panner and silces of onion, tomato and cucumber with chili and tomato sauce", 30.0));
        feedDomains.add(new FeedDomain("Vegetable Pizza", "pop_3", "Mixed Vegetable Pizza", 260.0));


        feedAdapter = new FeedAdapter(feedDomains);

        RecyclerViewMargin recyclerViewMargin = new RecyclerViewMargin(10, 3);
        categoriesRecyclerView.addItemDecoration(recyclerViewMargin);

        feedRecyclerView.setAdapter(feedAdapter);

    }
}
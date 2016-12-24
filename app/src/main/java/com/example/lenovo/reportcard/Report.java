package com.example.lenovo.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Report extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        ArrayList<ReportCard> cards = new ArrayList<ReportCard>();

        cards.add(new ReportCard(90, 80));
        cards.add(new ReportCard(89, 76));
        cards.add(new ReportCard(96, 85));

        ReportCardAdapter adapter = new ReportCardAdapter(this, cards);

        ListView listview = (ListView) findViewById(R.id.activity_report_card);

        listview.setAdapter(adapter);

    }
}

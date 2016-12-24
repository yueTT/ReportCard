package com.example.lenovo.reportcard;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lenovo on 2016/12/24.
 */

public class ReportCardAdapter extends ArrayAdapter<ReportCard> {

    public ReportCardAdapter(Activity context, ArrayList<ReportCard> cards) {
        super(context, 0, cards);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ReportCard card = getItem(position);
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView math_score = (TextView) listItemView.findViewById(R.id.math_score);
        TextView english_score = (TextView) listItemView.findViewById(R.id.english_score);

        math_score.setText(card.getMath_score());
        english_score.setText(card.getEnglish_score());

        return listItemView;
    }
}

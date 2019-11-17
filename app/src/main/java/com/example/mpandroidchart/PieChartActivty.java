package com.example.mpandroidchart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.github.mikephil.charting.charts.PieChart;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;

import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


public class PieChartActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart_activty);

        PieChart pieChart = findViewById(R.id.piechart);
        ArrayList NoOfEmp = new ArrayList();

        NoOfEmp.add(new Entry(1111f, 0));
        NoOfEmp.add(new Entry(2222f, 1));
        NoOfEmp.add(new Entry(3333f, 2));
        NoOfEmp.add(new Entry(4444f, 3));
        NoOfEmp.add(new Entry(5555f, 4));
        NoOfEmp.add(new Entry(6666f, 5));
        NoOfEmp.add(new Entry(7777f, 6));
        NoOfEmp.add(new Entry(8888f, 7));


        PieDataSet dataSet = new PieDataSet(NoOfEmp,  "  Ko'o Nat อิอิ ");


        ArrayList year = new ArrayList();

        year.add("2008");
        year.add("2009");
        year.add("2010");
        year.add("2011");
        year.add("2012");
        year.add("2013");
        year.add("2014");
        year.add("2015");
        year.add("2016");
        year.add("2017");
        PieData data = new PieData(year, dataSet);
        pieChart.setData(data);
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieChart.animateXY(5000, 5000);
    }
}


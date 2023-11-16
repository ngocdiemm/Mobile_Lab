package com.uit.lab2_listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Q1 extends AppCompatActivity {

    ListView listView;
    TextView selectedTextView;

    String[] dataArray = {"Tèo", "Tí", "Bin", "Bo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);

        listView = findViewById(R.id.listView);
        selectedTextView = findViewById(R.id.selectedTextView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataArray);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Xử lý khi một phần tử trong ListView được chọn
                String selectedItem = dataArray[position];
                selectedTextView.setText("Vị trí: " + position + ", Giá trị: " + selectedItem);
                selectedTextView.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
            }
        });
    }
}

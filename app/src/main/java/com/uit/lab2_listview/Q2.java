package com.uit.lab2_listview;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.uit.lab2_listview.R;

import java.util.ArrayList;

public class Q2 extends AppCompatActivity {

    private ListView listView;
    private TextView selectedTextView;
    private Button btnSubmit;
    private EditText editText;
    private ArrayList<String> names;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);

        listView = findViewById(R.id.listView);
        selectedTextView = findViewById(R.id.selectedTextView);
        btnSubmit = findViewById(R.id.btnSubmit);
        editText = findViewById(R.id.editText);

        names = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, names);
        listView.setAdapter(adapter);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Thêm dữ liệu từ EditText vào ArrayList
                String inputText = editText.getText().toString();
                if (!inputText.isEmpty()) {
                    names.add(inputText);
                    //Cập nhật dữ liệu mới lên giao diện
                    adapter.notifyDataSetChanged();
                    //Xóa nội dung trong EditText sau khi thêm vào ArrayList
                    editText.getText().clear();
                }
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Xử lý khi một phần tử trong ListView được chọn
                String selectedItem = names.get(position);
                selectedTextView.setText("Vị trí: " + position + ", Giá trị: " + selectedItem);
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                // Xử lý sự kiện Long click để xóa phần tử
                names.remove(position);
                adapter.notifyDataSetChanged();

                // Hiển thị thông báo
                Toast.makeText(Q2.this, "Đã xóa phần tử", Toast.LENGTH_SHORT).show();

                return true;
            }
        });
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int before, int count) {
                // Không cần xử lý trước khi thay đổi văn bản
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                // Hiển thị văn bản đang nhập trên TextView
                selectedTextView.setText(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {
                // Không cần xử lý sau khi thay đổi văn bản
            }
        });
    }
}

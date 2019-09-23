package com.example.student.ltk_cau2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnGiai;
    EditText ea, eb, ec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGiai = findViewById(R.id.button);
        ea = findViewById(R.id.a);
        eb = findViewById(R.id.b);
        ec = findViewById(R.id.c);
        btnGiai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,KetQua.class);
                intent.putExtra("a", Float.parseFloat(ea.getText().toString()));
                intent.putExtra("b", Float.parseFloat(eb.getText().toString()));
                intent.putExtra("c", Float.parseFloat(ec.getText().toString()));
                startActivity(intent);
            }
        });
    }
}

package com.example.assignment1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int count_initial_value=0;
    TextView textView;
    Button count, toaster;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.show_count);
        count = findViewById(R.id.count);

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count_initial_value++;
                textView.setText(String.valueOf(count_initial_value));
            }
        });
        }



    public void showToast(View view) {
        String msg = "Hello Toast!";
        Toast toast = Toast.makeText(
                this, msg, Toast.LENGTH_LONG);
        toast.show();
    }
    }

package com.example.feedback_calls;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText fid,feedback,comments,sid,tid,cid;
    Button insert, list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fid = findViewById(R.id.fid);
        feedback = findViewById(R.id.feedback);
        comments=findViewById(R.id.comments);
        sid=findViewById(R.id.sid);
        tid=findViewById(R.id.tid);
        cid=findViewById(R.id.cid);
        insert=findViewById(R.id.insert);
        list=findViewById(R.id.list);


        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Insert.class);
                intent.putExtra("ID", fid.getText().toString());
                intent.putExtra("fname", feedback.getText().toString());
                intent.putExtra("lname", comments.getText().toString());
                intent.putExtra("phone", sid.getText().toString());
                intent.putExtra("address", tid.getText().toString());
                intent.putExtra("cid", cid.getText().toString());
                startActivity(intent);

            }
        });

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Feedbacklist.class);
                startActivity(intent);

            }
        });
    }
}

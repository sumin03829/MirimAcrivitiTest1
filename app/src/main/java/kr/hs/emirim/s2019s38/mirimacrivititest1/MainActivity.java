package kr.hs.emirim.s2019s38.mirimacrivititest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnNew=findViewById(R.id.btn_new_activity);
        btnNew.setOnClickListener(btnNewListener);
        RadioGroup rg=findViewById(R.id.rg);
//        RadioButton rb1=findViewById(R.id.rd1);
//        RadioButton rb2=findViewById(R.id.rd2);

        rg.setOnClickListener(radioCheckedListener);
    }
    View.OnClickListener btnNewListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getApplicationContext(),secondActivitt.class);
            startActivity(intent);
        }
    };
    View.OnClickListener radioCheckedListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (rg.get)
        }
    };



}
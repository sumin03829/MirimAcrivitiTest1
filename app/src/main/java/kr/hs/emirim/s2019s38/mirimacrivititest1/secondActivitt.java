package kr.hs.emirim.s2019s38.mirimacrivititest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class secondActivitt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activitt);
        Button btnGoBack=findViewById(R.id.btn_goback);
        btnGoBack.setOnClickListener(btnGoBackListener);
        RadioGroup rg=findViewById(R.id.rg);
        RadioButton rb1=findViewById(R.id.rd1);
        RadioButton rb2=findViewById(R.id.rd2);
    }
    View.OnClickListener btnGoBackListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    };
}
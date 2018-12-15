package com.gzeinnumer.zeinbelajar3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    private RadioGroup radioGroupMerek,radioGroupType;
    private RadioButton radioButton,radioButton2;
    private Button btnSubmit,btnReset,btnExit;
    private EditText etH;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroupMerek = (RadioGroup)findViewById(R.id.radioGroupMerek);
        radioGroupType = (RadioGroup)findViewById(R.id.radioGroupType);
        etH = (EditText)findViewById(R.id.etH);
        btnSubmit = (Button)findViewById(R.id.btnSubmit);
        btnReset = (Button) findViewById(R.id.btnReset);
        btnExit = (Button) findViewById(R.id.btnExit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = radioGroupMerek.getCheckedRadioButtonId();
                int radioId2 = radioGroupType.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(radioId);
                radioButton2 = (RadioButton) findViewById(radioId2);
                etH.setText(radioButton.getText()+" "+radioButton2.getText());
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rbReset();
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });

    }
    public void rbReset(){
        etH.setText(String.valueOf(""));
    }
    public void  checkButton(View v){
        int radioId = radioGroupMerek.getCheckedRadioButtonId();
        radioButton = (RadioButton) findViewById(radioId);
        Toast.makeText(this,"Kamu memilih Merek : " + radioButton.getText(),Toast.LENGTH_LONG).show();
    }
    public void  checkButton2(View v){
        int radioId = radioGroupType.getCheckedRadioButtonId();
        radioButton2 = (RadioButton) findViewById(radioId);
        Toast.makeText(this,"Kamu memilih Type : " + radioButton2.getText(),Toast.LENGTH_LONG).show();
    }
}

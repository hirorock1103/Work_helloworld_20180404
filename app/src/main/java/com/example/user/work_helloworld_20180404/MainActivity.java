package com.example.user.work_helloworld_20180404;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText showNameArea = findViewById(R.id.my_main_activity_edit_text_show);
        //editTextの入力を不可にする
        showNameArea.setFocusable(false);

        Button bt = findViewById(R.id.my_main_activity_button);
        //ボタン押下時の処理
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText inputNameArea = findViewById(R.id.my_main_activity_edit_text_name);
                String name = inputNameArea.getText().toString().trim();

                if(!name.isEmpty()){
                    showNameArea.setText("こんにちは、" + name + "さん");
                }else{
                    showNameArea.setText(name);
                }
            }
        });

    }
}

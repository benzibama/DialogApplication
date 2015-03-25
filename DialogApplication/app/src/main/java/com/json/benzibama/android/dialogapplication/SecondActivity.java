package com.json.benzibama.android.dialogapplication;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by bama on 3/24/2015.
 */
public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customdialog);
        final Dialog dialog=new Dialog(SecondActivity.this);
        dialog.setContentView(R.layout.customdialog);
        Button okButton=(Button)dialog.findViewById(R.id.Ok);
        okButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}

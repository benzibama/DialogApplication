package com.json.benzibama.android.dialogapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {
    private Button B1,B2;
    private EditText name,pass;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        callDialog();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText) findViewById(R.id.uname);
        pass=(EditText) findViewById(R.id.upass);
        B2=(Button) findViewById(R.id.button);
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callDialog();
            }
        });
        B1=(Button) findViewById(R.id.Okbutton);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().length() == 0 || pass.getText().length() == 0) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username or Password is Empty");
                    builder.setCancelable(true);
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            name.setText("");
                            pass.setText("");
                            name.setFocusable(true);
                            dialog.dismiss();
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username and Password is not Empty");
                    builder.setCancelable(true);
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            pass.setText("");
                            name.setText("");
                            name.setFocusable(true);
                            // dialog.dismiss();
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
            }
        });

    }
    public void callDialog() {
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.customdialog);
        dialog.setTitle("Title...");

        // set the custom dialog components - text, image and button
        TextView text = (TextView) dialog.findViewById(R.id.text1);
        text.setText("Android dialog");
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        ImageView image = (ImageView) dialog.findViewById(R.id.image1);

        image.setImageResource(R.drawable.telephone);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        Button dialogButton = (Button) dialog.findViewById(R.id.Ok);
        // if button is clicked, close the custom dialog
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }


}

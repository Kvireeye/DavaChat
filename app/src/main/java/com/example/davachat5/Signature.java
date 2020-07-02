package com.example.davachat5;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.UUID;


public class Signature extends AppCompatActivity implements View.OnClickListener {
    PaintSign paintSign;
    Button validerSign, effacer, signer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signature);

        paintSign = findViewById(R.id.PainSign);
        validerSign = findViewById(R.id.btn_valider);
        effacer = findViewById(R.id.btn_effacer);
        signer = findViewById(R.id.btn_signez);


        validerSign.setOnClickListener(this);
        effacer.setOnClickListener(this);
        signer.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if(v == signer){


        }
        if(v == effacer){
            Bitmap bitmapSign = PaintSign.getBitmapSign();
            bitmapSign.eraseColor(Color.TRANSPARENT);


        }
        if(v== validerSign){
            AlertDialog.Builder saveDialog = new AlertDialog.Builder(this);
            saveDialog.setTitle("Valider votre signature");
            saveDialog.setMessage("Signer le document?");
            saveDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    paintSign.setDrawingCacheEnabled(true);
                    String imgSaved = MediaStore.Images.Media.insertImage(
                            getContentResolver(), paintSign.getDrawingCache(),
                            UUID.randomUUID().toString()+".png", "drawing");
                    if(imgSaved!=null){
                        Toast savedToast = Toast.makeText(getApplicationContext(),
                                "Drawing saved to Gallery!", Toast.LENGTH_SHORT);
                        savedToast.show();
                    }
                    else{
                        Toast unsavedToast = Toast.makeText(getApplicationContext(),
                                "Oops! Image could not be saved.", Toast.LENGTH_SHORT);
                        unsavedToast.show();
                    }
                    paintSign.destroyDrawingCache();

                }
            });
            saveDialog.setNegativeButton("No", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    dialog.cancel();
                }
            });
            saveDialog.show();
        }

    }


    }





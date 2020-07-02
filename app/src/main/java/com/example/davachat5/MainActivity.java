package com.example.davachat5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class MainActivity extends Fondation{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_deconnexion = findViewById(R.id.acceuil_bouton_deconnexion);
        LinearLayout btn_profil = findViewById(R.id.acceuil_bouton_profil);
        LinearLayout btn_chat = findViewById(R.id.acceuil_bouton_chat);
        LinearLayout btn_qrc = findViewById(R.id.acceuil_bouton_qrc);
        LinearLayout btn_signature = findViewById(R.id.acceuil_bouton_signature);

    }

/*
    public void signOut() {
        // [START auth_fui_signout]
        AuthUI.getInstance()
                .signOut(this)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    public void onComplete(@NonNull Task<Void> task) { }
                });
        // [END auth_fui_signout]
    }
    */
    public void onClickSignature(View view) {setContentView(R.layout.activity_signature);
    }

    public void onClickPDF(View view) {setContentView(R.layout.activity_pdf_visio);
    }
}

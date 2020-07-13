package com.example.davachat5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.ErrorCodes;
import com.firebase.ui.auth.IdpResponse;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class Acceuil extends Fondation {
/*
    private static final int RC_SIGN_IN = 119;
    private static final int SIGN_OUT_TASK = 10;

    protected FirebaseAuth mAuth;

    private EditText input_user, input_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);

        mAuth = FirebaseAuth.getInstance();

        Button boutonConnexion = findViewById(R.id.portail_bouton_connexion);
        boutonConnexion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                connexion();
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        CoordinatorLayout coordinatorLayout = findViewById(R.id.activity_acceuil_coordinator);
        if (requestCode == RC_SIGN_IN) {
            IdpResponse response = IdpResponse.fromResultIntent(data);

            if (resultCode == RESULT_OK) {
                // Authentification réussie
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                showSnackBar(coordinatorLayout, getString(R.string.connection_succeed));
                setContentView(R.layout.activity_main);
            } else {
                if (response == null) { //Echec
                    showSnackBar(coordinatorLayout, getString(R.string.error_authentication_canceled));
                } else if (Objects.requireNonNull(response.getError()).getErrorCode() == ErrorCodes.NO_NETWORK) {
                    showSnackBar(coordinatorLayout, getString(R.string.error_no_internet));
                } else if (response.getError().getErrorCode() == ErrorCodes.UNKNOWN_ERROR) {
                    showSnackBar(coordinatorLayout, getString(R.string.error_unknown_error));
                }
            }
        }
    }


    //CONNEXION //
        public void connexion() {
            List<AuthUI.IdpConfig> providers = Arrays.asList(
                    new AuthUI.IdpConfig.EmailBuilder().build(),
                    new AuthUI.IdpConfig.PhoneBuilder().build(),
                    new AuthUI.IdpConfig.GoogleBuilder().build());

            if (AuthUI.canHandleIntent(getIntent())) {
                if (getIntent().getExtras() == null) {
                    return;
                }}
                // Create and launch sign-in intent
                startActivityForResult(
                        AuthUI.getInstance()
                                .createSignInIntentBuilder()
                                .setAvailableProviders(providers)
                                .setIsSmartLockEnabled(false, true)
                                .setTheme(R.style.AppTheme)
                                .setLogo(R.drawable.logo_gipfcip_v)
                                .build(),
                        RC_SIGN_IN);
            }
            // [END auth_fui_create_intent]

//FIN CONNEXION*/
 }








package com.example.davachat5;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.snackbar.Snackbar;


/* Classe permettant d'implémenter des méthodes de base pour les différentes actitivés*/

public class Fondation extends AppCompatActivity {

    //Methode pour afficher la snackbar
    public void showSnackBar(CoordinatorLayout coordinatorLayout, String message){
        Snackbar.make(coordinatorLayout, message, Snackbar.LENGTH_SHORT).show();
    }




    //Donne l'utilisateur actuellement connecté
    //protected FirebaseUser getCurrentUser(){ return FirebaseAuth.getInstance().getCurrentUser(); }
    //L'utilisateur est il connecté?
    //protected Boolean isCurrentUserLogged(){ return (this.getCurrentUser() != null); }


}

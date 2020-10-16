package com.corona.coronazp20t;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

//------jeigu raudonuoja, nera bibliotekos, ALT+Enter-----//

//------VOID - negrazinanti funkcija----------------------//


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //kodas reikalingas, kad atsidarytu tuscias langas.
        setContentView(R.layout.activity_login); //i tuscia langa, sukraunamas mano sukurtas vaizdas.
        //Visas kodas rasomas po sito komentaro.
        Button loginBtn = findViewById(R.id.loginBtn); //issitraukiame elementus ir sukurto vaizdo.
        final EditText usernametxt = findViewById(R.id.usernametxt);
        final EditText passwordtxt = findViewById(R.id.passwordtxt);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //cia bus vykdomas kodas, po mygtuko paspaudimo.
                //toast reikalingas, kad ismestu pranesima.
                Toast.makeText(LoginActivity.this,
                        "Prisijungimo Vardas:"+usernametxt.getText().toString()+"\n"+
                        "Slaptazodis:"+passwordtxt.getText().toString(),
                        Toast.LENGTH_SHORT).show();
                //ketinimas pereiti i paieskos langa.
                Intent goToSearchActivity=new Intent(LoginActivity.this, //from.
                        SearchActivity.class);//to.
                startActivity(goToSearchActivity);//cia pereina.
            }
        });
    }

    //----Overvide jei nori greiciau vel iterpt: "on destroy"---//
}


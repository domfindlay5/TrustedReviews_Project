package com.example.dom.trustedreviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String msg = "Android :";


    /* called when the activity is created */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set object
        Button writeReviewBtn = (Button)findViewById(R.id.writeReviewBtn);
        writeReviewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), ScanQRActivity.class);
                // pass info to Scan QR Activity
                startActivity(startIntent);
            }
        });

    }


    /* called when the activity is about to become visible to the user */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg,"OnStart() event");
    }


    /* called when the activity is visible */
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(msg, "On Resume() event");
    }


    /* called when the activity is not visible*/
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(msg,"On stop () event");
    }

}

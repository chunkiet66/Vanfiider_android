package com.vanfiider.login;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.vanfiider.R;

/**
 * Created by ChunKiet on 2015-09-20.
 */
public class LoginPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        TextView titleTextView = (TextView) findViewById(R.id.cover_title);
        Typeface typeFace=Typeface.createFromAsset(getAssets(), "fonts/GrandHotel-Regular.otf");
        titleTextView.setTypeface(typeFace);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user clicks the Send button */
    public void showLoginView(View view) {
        LinearLayout loginView = (LinearLayout) findViewById(R.id.login_view);
        loginView.setVisibility(View.VISIBLE);

        LinearLayout signupView = (LinearLayout) findViewById(R.id.signup_view);
        signupView.setVisibility(View.GONE);
    }

    /** Called when the user clicks the Send button */
    public void showSignUpView(View view) {
        LinearLayout loginView = (LinearLayout) findViewById(R.id.login_view);
        loginView.setVisibility(View.GONE);

        LinearLayout signupView = (LinearLayout) findViewById(R.id.signup_view);
        signupView.setVisibility(View.VISIBLE);
    }

    public void goToMainPage(View view){
        //Intent intent = new Intent(this, MainActivity.class);
        //startActivity(intent);
        //finish();
    }
}

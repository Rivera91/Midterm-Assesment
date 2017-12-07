package nyc.amy_rivera_deveoloper.midtermassessment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private static final String SHARED_PREFS_KEY ="login";
    private SharedPreferences login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText edit1 = (EditText) findViewById(R.id.edit1);
        final EditText edit2 = (EditText) findViewById(R.id.edit2);
        Button button = (Button) findViewById(R.id.login);
        final CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);

        login = getApplicationContext().getSharedPreferences(SHARED_PREFS_KEY, MODE_PRIVATE);


        button.setOnClickListener(new View.OnClickListener() {

            String email = "user@aol.com";
            String password = "password1234";
            @Override
            public void onClick(View view) {
                EditText messageView = (EditText) findViewById(R.id.message);
                String messageText = messageView.getText().toString();
                
                if((edit1.getText().toString() == email) && (edit2.getText().toString() == password)){

                    Intent intent = new Intent(this, ListActivity.class);
                    intent.putExtra(ListActivity.EXTRA_MESSAGE,messageText);
                    startActivity(intent);

                }



            }
        });



    }

}

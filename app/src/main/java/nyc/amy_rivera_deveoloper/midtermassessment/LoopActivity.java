package nyc.amy_rivera_deveoloper.midtermassessment;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop);
    }

    private class Loop extends AsyncTask<Integer, Integer, Integer> {

        @Override
        protected Integer doInBackground(Integer... integers) {
            return null;
        }

        protected void onPreExecute() {

        }



        protected int onProgessUpdate(Integer...progress){

        }


        protected void onPostExecute(Integer result){

            Intent intent = new Intent (this, LoginActivity.class);

        }
    }
}

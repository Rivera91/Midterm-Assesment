package nyc.amy_rivera_deveoloper.midtermassessment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends Fragment {

    public static final String EXTRA_MESSAGE = "message";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_list, container, false);

        Intent intent = getIntent();
        String messageText= intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView = (TextView) findViewById (R.id.message);
        messageView.setText(messageText);
    }

    // RecyclerView user interface component
    private RecyclerView recyclerView;

    // Adapter for the RecyclerView
    private RecyclerView.Adapter<ListViewHolder> adapter;

    // LayoutManager for the RecyclerView
    private RecyclerView.LayoutManager layoutManager;



    public ListActivity() {
        return List;

        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);



    }
}



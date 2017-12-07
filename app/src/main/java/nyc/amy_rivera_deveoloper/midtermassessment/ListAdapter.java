package nyc.amy_rivera_deveoloper.midtermassessment;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by AmyRivera on 12/6/17.
 */

public class ListAdapter extends RecyclerView.Adapter<ListViewHolder> {

    public ListViewHolder extends RecyclerView.ViewHolder{

        public TextView message;

        public ViewHolder (View itemView){
            super(itemView);
        }

    }
    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

package dv.android.com.customrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.ViewHolder> {

    private List<CharacterDTO> dataList;

    public CharacterAdapter(List<CharacterDTO> dataList) {
        this.dataList = dataList;
    }

    @Override
    public CharacterAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.items_character, null, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CharacterAdapter.ViewHolder viewHolder, int i) {
        viewHolder.title.setText(dataList.get(i).getName());
        viewHolder.description.setText(dataList.get(i).getDescription());
        viewHolder.image.setImageResource(dataList.get(i).getPhoto());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title;
        TextView description;

        public ViewHolder(View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.imageChar);
            title = itemView.findViewById(R.id.titleChar);
            description = itemView.findViewById(R.id.description);

        }
    }
}

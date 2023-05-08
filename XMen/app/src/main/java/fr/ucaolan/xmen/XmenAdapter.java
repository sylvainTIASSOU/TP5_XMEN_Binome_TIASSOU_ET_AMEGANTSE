package fr.ucaolan.xmen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class XmenAdapter extends RecyclerView.Adapter<XMenHolder>
{
    Context context;
    List<XMen> list;

    public XmenAdapter(Context context, List<XMen> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public XMenHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new XMenHolder(LayoutInflater.from(context).inflate(R.layout.xmen_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull XMenHolder holder, int position)
    {
        holder.name.setText(list.get(position).getName());
        holder.alias.setText(list.get(position).getAlias());
        holder.pouvoir.setText(list.get(position).getPouvoir());
        holder.description.setText(list.get(position).getDescription());
        holder.image.setImageResource(list.get(position).getIdImage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

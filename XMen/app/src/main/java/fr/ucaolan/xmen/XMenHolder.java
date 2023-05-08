package fr.ucaolan.xmen;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class XMenHolder extends RecyclerView.ViewHolder
{
    public TextView name, alias, description, pouvoir;
    public ImageView image;

    public XMenHolder(@NonNull View itemView)
    {
        super(itemView);

        name = itemView.findViewById(R.id.nom);
        alias = itemView.findViewById(R.id.alias);
        description = itemView.findViewById(R.id.description);
        pouvoir = itemView.findViewById(R.id.pouvoir);
        image = itemView.findViewById(R.id.image);

    }
}

package fr.ucaolan.xmen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    RecyclerView recyclerView;
    List<XMen> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        Resources res = getResources();
        String[] noms = res.getStringArray(R.array.noms);
        String[] alias = res.getStringArray(R.array.alias);
        String[] desc = res.getStringArray(R.array.descriptions);
        String[] pouvoir = res.getStringArray(R.array.pouvoirs);
        TypedArray images = res.obtainTypedArray(R.array.idimages);

        for (int i=0; i<noms.length; i++)
        {
            XMen xMen = new XMen(noms[i],alias[i], desc[i], pouvoir[i], images.getResourceId(i, R.drawable.undef));

            list.add(xMen);
        }
        images.recycle();



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new XmenAdapter(this, list));
    }
}
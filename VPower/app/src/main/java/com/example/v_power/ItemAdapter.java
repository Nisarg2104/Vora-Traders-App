package com.example.v_power;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemAdapter extends ArrayAdapter<Product> {
    private Context context;
    private List<Product> items;

    public ItemAdapter(Context context,List<Product> list)
    {
        super(context, R.layout.product_list_item, list);
        this.context=context;
        this.items=list;
    }
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {


            LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView == null){
            convertView = inflater.inflate(R.layout.product_list_item,parent,false);
        }



        TextView tvItemName=convertView.findViewById(R.id.tvItemName), tvMRP=convertView.findViewById(R.id.tvMRP), tvMoq=convertView.findViewById(R.id.tvMoq), tvStdPkg=convertView.findViewById(R.id.tvStdPkg);
        Button btnAddtoCart;
        btnAddtoCart = convertView.findViewById(R.id.btnAdd);
        TextView tvCategory=convertView.findViewById(R.id.tvCatergory);

            tvCategory.setText(items.get(position).getOEM());





        tvItemName.setText(items.get(position).getName());
        tvMRP.setText("Rs:"+items.get(position).getPrice());
        tvStdPkg.setText("Standard Pkg:"+items.get(position).getStdpkg());
        tvMoq.setText("MOQ:"+items.get(position).getMOQ());
        btnAddtoCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TestApplication.cart.add(items.get(position));
                Toast.makeText(context, "Item added to cart", Toast.LENGTH_SHORT).show();
            }
        });






        return convertView;
    }
}

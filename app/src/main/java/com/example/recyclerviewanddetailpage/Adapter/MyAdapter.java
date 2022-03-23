package com.example.recyclerviewanddetailpage.Adapter;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recyclerviewanddetailpage.InfoActivity;
import com.example.recyclerviewanddetailpage.R;
import java.util.List;
import com.example.recyclerviewanddetailpage.Model.Listitem;
// MyAdapter class, define context and list
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Context context;
    private  List<Listitem> listitems;
// MyAdapter Constructor, where get values of instance variables defined
    public MyAdapter(Context context , List listitem) {
        this.context = context;
        this.listitems = listitem;
    }//end constructor
//onCreateViewHolder method, define view object as layoutIflator
    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row,parent,false);
        return new ViewHolder(view);
    }//end of onCreateViewHolder()
// onBindViewHolder method,  defins what does single row contains of variables and in which position
    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        Listitem item = listitems.get(position);
        holder.name.setText(item.getName());
        holder.l_description.setText(item.get_l_Description());
        holder.s_description.setText(item.get_s_Description());
        holder.price.setText(item.getPrice());
    }//end of onBindViewHolder()
// getItemCount() function, if you are interested of how many items in the list
    @Override
    public int getItemCount() {
         return listitems.size();
    } //end of getItemCount()
//ViewHolder class, where you:
//   define the variables in the view holder
//   contains the constructor
//   implements View,onClickListener if you want to click and move to new activity
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView name;
        private TextView l_description;
        private TextView s_description;
        private TextView price;
// ViewHolder constructor were you find the variables by id
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            name = itemView.findViewById(R.id.title);
            l_description = itemView.findViewById(R.id.l_info);
            s_description = itemView.findViewById(R.id.s_info);
            price = itemView.findViewById(R.id.price);
        }//end constructor
// onClick() method, where you
//     getadapter position int the list
//     define your intent
//     putExtra key and Value to be sent
//     start the activity
        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Listitem item = listitems.get(position);
            Intent intent = new Intent(context, InfoActivity.class);
            intent.putExtra("name",item.getName());
            intent.putExtra("l_description",item.get_l_Description());
            intent.putExtra("s_description",item.get_s_Description());
            intent.putExtra("price",item.getPrice());
            context.startActivity(intent);
        }//end onClick()
    }//ene class viewHolder
}//end class myAdapter
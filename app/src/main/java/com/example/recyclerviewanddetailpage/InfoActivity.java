package com.example.recyclerviewanddetailpage;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
// class InfoActivity, define UI items, define extras as bundle
public class InfoActivity extends AppCompatActivity {
    TextView name , l_description , s_description, price ;
    ImageView imageView;
    Bundle extras;
//onCreate method,
//     setContentView
//     find UI by id
// if extras not null fill in the UI with the values of these extra keys
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        extras = getIntent().getExtras();
        imageView = findViewById(R.id.imageViewId);
        name = findViewById(R.id.name);
        l_description = findViewById(R.id.l_Desc);
        s_description = findViewById(R.id.s_Desc);
        price = findViewById(R.id.price);

        if(extras != null){
            imageView.setImageResource(extras.getInt("intImage"));
            name.setText(extras.getString("name"));
            l_description.setText(extras.getString("l_description"));
            s_description.setText(extras.getString("s_description"));
            price .setText(extras.getString("price"));
        }//end if
    }//end of onCreate()
}//end class InfoActivity

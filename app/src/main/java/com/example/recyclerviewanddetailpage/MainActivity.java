package com.example.recyclerviewanddetailpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import com.example.recyclerviewanddetailpage.Adapter.MyAdapter;
import com.example.recyclerviewanddetailpage.Model.Listitem;
// MainActivity Class
//      Defile recyclerView   object
//      Define list<ListItem> object
//      Define adapter        object
public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Listitem> listitems;
    RecyclerView.Adapter adapter;
// onCreate method()
//       set the contentView
//       find Recycler view by id
//       set recyclerView size
//       set layoutManager
//       create an object of the Array of list (ArrayList)
//       create number of objects of class Listitem as many as your data to be displayed
//       for each item created fill the key and value separated by comma)
//       add each item to the list
//       create an object from MyAdapter and pass ArrayList object created earlier
//       connect the recyclerView with this adapter object
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerviewID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        listitems = new ArrayList<>();
        Listitem  item = new Listitem(R.drawable.how_image,"Hoe" ,
                "This tool is used to digging and to place concrete, cement mortar in head pan",
                "A general agricultural tool, for beneficiary distributions.\n" +
                        "\n" +
                        "Forged iron tool, of appropriate strength and durability.\n" +
                        "\n" +
                        "Local customs and basic tool shapes vary worldwide. Check the appropriateness of the tool’s shape prior to purchasing. The way in which the tool head is secured to the handle also varies (e.g., sunken eye, raised eye, spike\n" +
                        "\n" +
                        "Generally, cast iron tools are more fragile than forged tools. Some manufacturers produce very low-quality tools. Test several samples to their breaking point prior to purchasing. Refer to strength testing section in Specifications."
                , "U$ 15 ");
        listitems.add(item);
                item = new Listitem(R.drawable.masonry_trowel,"Masonry trowel"
                ,"This tool is used to place cement mortar"
                ,"Package Dimensions: 30.73 cms (L) x 23.88 cms (W) x 12.19 cms (H)"
                , "U$ 10");
        listitems.add(item);
                item = new Listitem(R.drawable.measurement_tape,"Measurement Tape"
                ,"This is used to measure"
                , "Up to 20% more compact, military-grade housing\n" +
                "MIL-X™ coated, 1 1/4-in blade for up to 2x blade durability\n" +
                "High-visibility, white blade with double-sided markings for clear and precise measurements"
                , "US 10");
        listitems.add(item);
                item = new Listitem(R.drawable.wheelbarrow,"Wheel Barrow"
                ,"This tool is used to transport cement mortar or any materials. Sometimes it also be used to measure the quantites of materials for site level concrete mixing"
                , "Capacity: 50 Litres \n" + "Wheels: Brand new scooter pneumatic tyre – 1 no.\n"
                +"Dimensions: L 1200 x W 630 x H 625 mm \n" +"Weight: 30 kg"
                , "U$ 250");
        listitems.add(item);
                item = new Listitem(R.drawable.concrete_mixer,"Concrete Mixer"
                ,"This tool is used to thoroughly mix the concrete at site."
                , "The specifications of the concrete mixers are as follows. The mix drum capacity of the concrete mixer are 1200 liter,560 liters, 480 liters, 200 liter,s etc. The production capacity of the concrete mixer is about 5 cubics/hr. Drum Speed of the concrete mixer is 20-22 rpm. The weight of the concrete mixer machine is about 130 kg."
                , "U$ 930");
        listitems.add(item);
                item = new Listitem(R.drawable.rubber_boots,"Rubber Boots"
                ,"This one is used to prevent skin from chemical contact"
                , "BOOTS, heavy duty plastic rubber, pair, size 06"
                , "U$ 25");
        listitems.add(item);
                item = new Listitem(R.drawable.gloves,"Gloves"
                ,"This is used to avoid direct contact with dangerous tools, machines or to avoid any direct chemical material contact"
                , "\tRed PVC gloves for a wide range of applications. Interlock liner and knit wrist for secure and comfortable fit. Tough hardwearing glove in both wet and dry situations. Open back version available for breathability. Gauntlet styles also available in 27cm or 35cm lengths to suit specific requirements. EN388 4111"
                , "U$ 15");
        listitems.add(item);
                item = new Listitem(R.drawable.wooden_rendering_float,"Wooden Float/wooden rendering float"
                ,"This tool is used to give a smooth finish to the plastered area"
                , "Plastering Rendering Cement Float\n" +
                "Wooden float with lightweight polyurethane moulded handle.\n" +
                "Ideal for plastering and decorating.\n" +
                "\n" +
                "Available in the following sizes: 140mm x 280mm 180mm x 320mm"
                , "U$ 25");
        listitems.add(item);
                item = new Listitem(R.drawable.torpedo_level,"Torpedo Level"
                ,"Combination of line level and framing square"
                , "Depth: 0.75 in\n" +
                "Laser Feature: No\n" +
                "Type: Torpedo\n" +
                "Width: 1.25 in"
                , "U$ 50");
        listitems.add(item);

        adapter = new MyAdapter(this,listitems);
        recyclerView.setAdapter(adapter);
    }//end of onCreate()
}//end class MainActivity


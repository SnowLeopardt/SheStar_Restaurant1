package com.ugb.shestarrestaurant.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.ugb.shestarrestaurant.R;
import com.ugb.shestarrestaurant.adapters.DetailedDailyAdapter;
import com.ugb.shestarrestaurant.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView =findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);


        recyclerView.setLayoutManager(new LinearLayoutManager( this));
        detailedDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);

        if (type != null && type.equalsIgnoreCase("breakfast")){

            imageView.setImageResource(R.drawable.breakfast);
          detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav1, "Desayuno", "Frutas Con Avena", "4.4","5", "6am to 11am"));
          detailedDailyModelList.add(new DetailedDailyModel(R.drawable.ver2, "Desayuno", "Huevo Con Pan Integral", "4.4","3.50", "6am to 11am"));
          detailedDailyModelList.add(new DetailedDailyModel(R.drawable.ver3, "Desayuno", "Tostada Con Jalea Y Fruta", "4.4","3", "6am to 11am"));
          dailyAdapter.notifyDataSetChanged();

        }


        if (type != null && type.equalsIgnoreCase("sweets")){

            imageView.setImageResource(R.drawable.sweets);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s1, "Postre", "Dulces", "4.4","1", "10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2, "Postre", "Donas Con Chocolate", "4.4","2", "10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s3, "Postre", "Helado", "4.4","1.25", "10am to 9pm"));
            dailyAdapter.notifyDataSetChanged();

        }

        if (type != null && type.equalsIgnoreCase("Dinner")){

            imageView.setImageResource(R.drawable.dinner);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.burger4, "Cena", "Hamburguesa XXL", "4.4","8", "7pm to 10pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav2, "Cena", "Hamburguesa BQQ", "4.4","6", "7pm to 10pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav3, "Cena", "Spaguetti", "4.4","5", "7pm to 10pm"));
            dailyAdapter.notifyDataSetChanged();

        }

        if (type != null && type.equalsIgnoreCase("Lunch")){

            imageView.setImageResource(R.drawable.lunch);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.pizza3, "Almuerzo", "Pizza Con Vegetales", "4.4","6", "12pm to 5pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.burger4, "Almuerzo", "Hamburguesa XXL", "4.4","8", "12pm to 5pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.pizza4, "Almuerzo", "Pizza Suprema", "4.4","10", "12pm to 5pm"));
            dailyAdapter.notifyDataSetChanged();

        }

        if (type != null && type.equalsIgnoreCase("Coffee")){

            imageView.setImageResource(R.drawable.coffee);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.latte, "Cafe", "Cafe Negro", "4.4","1", "6am to 10pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coffe, "Cafe", "Cafe Mocca", "4.4","2.50", "6am to 10pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.mocca, "Cafe", "Cafe Latte", "4.4","3.50", "6am to 10pm"));
            dailyAdapter.notifyDataSetChanged();

        }


    }
}
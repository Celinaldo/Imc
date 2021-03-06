package co.tiagoaguiar.codelab.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMain.findViewById(R.id.mai_rv);

        List<MainItem> mainItems = new ArrayList<>();
        mainItems.add(new MainItem(1, R.drawable.ic_baseline_wb_sunny_24, R.string.label_imc, Color.GREEN));
        mainItems.add(new MainItem(2, R.drawable.ic_baseline_visibility_24, R.string.label_tmb, Color.YELLOW));


        // 1-> Definir o comportamento de exibição do layout da recyclerview
        //mosaic
        //grid
        //liner (horizontal | vertical)
        rvMain.setLayoutManager(new GridLayoutManager(this,2));
        MainAdapter adapter = new MainAdapter(mainItems);
        rvMain.setAdapter(adapter);

    }

    private class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

        private List<MainItem> mainItems;

        public MainAdapter(List<MainItem> mainItems) {
            this.mainItems = mainItems;
        }


        @NonNull
        @Override
        public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new MainViewHolder(getLayoutInflater().inflate(R.layout.main_item, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
            MainItem mainItemCuurent = mainItems.get(position);
            holder.bingo(mainItemCuurent);


        }

        @Override
        public int getItemCount() {
            return mainItems.size();
        }
    }

    private class MainViewHolder extends RecyclerView.ViewHolder {

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
        }


        public void bingo(MainItem item) {
            TextView txtName = itemView.findViewById(R.id.item_txt_name);
            ImageView imgIcon = itemView.findViewById(R.id.item_img_icon);
            LinearLayout container = (LinearLayout) itemView;

            txtName.setText(item.getTextStringId());
            imgIcon.setImageResource(item.getDrawabled());
            container.setBackgroundColor(item.getColor());


        }
    }
}
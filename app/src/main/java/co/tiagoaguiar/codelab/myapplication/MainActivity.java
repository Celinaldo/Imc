package co.tiagoaguiar.codelab.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

	private RecyclerView rvMain;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		rvMain.findViewById(R.id.mai_rv);


		// 1-> Definir o comportamento de exibição do layout da recyclerview
		//mosaic
		//grid
		//liner (horizontal | vertical)
		rvMain.setLayoutManager(new LinearLayoutManager(this));
		MainAdapter adapter = new MainAdapter();
		rvMain.setAdapter(adapter);

	}

	private class MainAdapter extends RecyclerView.Adapter<MainViewHolder>{


		@NonNull
		@Override
		public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
			return null;
		}

		@Override
		public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {

		}

		@Override
		public int getItemCount() {
			return 0;
		}
	}

	private class MainViewHolder extends RecyclerView.ViewHolder{

		public MainViewHolder(@NonNull View itemView) {
			super(itemView);
		}
	}
}
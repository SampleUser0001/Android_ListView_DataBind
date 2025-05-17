package ittimfn.android.databind;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.SwitchCompat;
import java.util.List;

import ittimfn.android.databind.DataRecode;

import ittimfn.android.databind.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<DataRecode> dataList;

    public MyAdapter(List<DataRecode> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        DataRecode data = dataList.get(position);
        holder.bind(data);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mainTextView;
        TextView subTextView;
        SwitchCompat switchCompat;

        MyViewHolder(View itemView) {
            super(itemView);
            mainTextView = itemView.findViewById(R.id.main_text_view);
            subTextView = itemView.findViewById(R.id.sub_text_view);
            switchCompat = itemView.findViewById(R.id.switchCompat);
        }

        void bind(DataRecode data) {
            mainTextView.setText(data.main());
            subTextView.setText(data.sub());
            switchCompat.setChecked(data.isChecked());

            // トグルスイッチを操作したときの挙動を定義する。
            switchCompat.setOnCheckedChangeListener(null);
        }
    }
    
}

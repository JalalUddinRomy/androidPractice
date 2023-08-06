package customAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recylerview.R;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] Country_names;
    int[] Flags;
    LayoutInflater inflater;


    public CustomAdapter(Context context, String[] country_names, int[] flags) {
        this.Flags = flags;
        this.Country_names = country_names;
        this.context = context;
    }

    @Override
    public int getCount() {
        return Country_names.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView= inflater.inflate(R.layout.sample,parent,false);

        }
        ImageView imageView=convertView.findViewById(R.id.rowViewImage);
        TextView textView=convertView.findViewById(R.id.rowViewName);
        imageView.setImageResource(Flags[position]);
        textView.setText(Country_names[position]);
        return convertView;
    }
}

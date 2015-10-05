package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.kwhu.helloworld.R;

import java.util.List;

import model.News;

/**
 * Created by kwhu on 9/28/15.
 */
public class NewsAdapter extends ArrayAdapter<News> {
    private int resourceId;

    public NewsAdapter(Context context, int resource, List<News> objects) {
        super(context, resource, objects);
        resourceId =resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        News news = getItem(position);

        View view;
        if (convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent);
        }else {
            view = convertView;
        }
        TextView textView = (TextView) view.findViewById(R.id.news_title);
        textView.setText(news.getTitle());
        return view;
    }
}

package fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.kwhu.helloworld.R;

/**
 * Created by kwhu on 10/5/15.
 */
public class NewsContentFragment extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.news_content_frag,container,false);
        return view;
    }

    public void refresh(String title,String content){
        LinearLayout layout = (LinearLayout) view.findViewById(R.id.visibility_layout);
        layout.setVisibility(View.VISIBLE);
        TextView titleTextView = (TextView) view.findViewById(R.id.news_title);
        TextView contentTextView = (TextView) view.findViewById(R.id.news_content);

        titleTextView.setText(title);
        contentTextView.setText(content);
    }


}

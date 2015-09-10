package widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.kwhu.helloworld.R;

/**
 * Created by kwhu on 9/10/15.
 */
public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.title, this);

        Button button1 = (Button) findViewById(R.id.b1);

    }
}

package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.kwhu.helloworld.R;

import java.util.List;

import model.Msg;

/**
 * Created by kwhu on 9/27/15.
 */
public class MsgAdapter extends ArrayAdapter<Msg> {
    private int resourceId;
    private List<Msg> msgList;

    public MsgAdapter(Context context, int resource, List<Msg> objects) {
        super(context, resource, objects);
        resourceId = resource;
        msgList = objects;
    }

    @Override
    public int getCount() {
        return msgList.size();
    }

    @Override
    public Msg getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Msg msg = msgList.get(position);

        View view;
        ViewHolder viewHolder;
        if (convertView == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.msg_item,null);
            viewHolder = new ViewHolder();

            viewHolder.leftLayout = (LinearLayout) view.findViewById(R.id.layout_left);
            viewHolder.rightLayout = (LinearLayout) view.findViewById(R.id.layout_right);
            viewHolder.leftView = (TextView) view.findViewById(R.id.left_msg);
            viewHolder.rightView = (TextView) view.findViewById(R.id.right_msg);

            view.setTag(viewHolder);
        }else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }

        if (msg.getType() == Msg.TYPE_RECEIVED){
            viewHolder.leftLayout.setVisibility(View.VISIBLE);
            viewHolder.rightLayout.setVisibility(View.GONE);
            viewHolder.leftView.setText(msg.getContent());
        }else if (msg.getType() == Msg.TYPE_SENT){
            viewHolder.rightLayout.setVisibility(View.VISIBLE);
            viewHolder.leftLayout.setVisibility(View.GONE);
            viewHolder.rightView.setText(msg.getContent());
        }

        return view;
    }

    class ViewHolder{
        LinearLayout leftLayout;
        LinearLayout rightLayout;

        TextView leftView;
        TextView rightView;
    }
}

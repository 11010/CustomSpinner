package bodor.com.customspinner;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/9/2 0002.
 */

public class SpinnerAdapter extends BaseAdapter {

    private Activity mActivity;
    private LayoutInflater mLayoutInflater;
    private List<String> stringList;

    public SpinnerAdapter(Activity mActivity, List<String> stringList) {
        this.mActivity = mActivity;
        this.mLayoutInflater = (LayoutInflater) mActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.stringList = stringList;
    }


    private Context mContext;
    @Override
    public int getCount() {
        return stringList.size();
    }

    @Override
    public Object getItem(int i) {
        return stringList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view ==null){
            view = mLayoutInflater.inflate(R.layout.spinner_layout,null);
            TextView textView = view.findViewById(R.id.textView);
            textView.setText(stringList.get(i));
        }
        return view;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View view = super.getDropDownView(position,convertView,parent);
        LinearLayout ll = (LinearLayout) view;
        TextView  textView = ll.findViewById(R.id.textView);
        textView.setGravity(Gravity.LEFT);
        textView.setTextColor(Color.parseColor("#EA5429"));
        textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        return view;
    }
}

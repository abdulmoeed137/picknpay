package pay.pick.com.picknpay.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import pay.pick.com.picknpay.CustomView.ExpandablePanel;
import pay.pick.com.picknpay.MenuDetailActivity;
import pay.pick.com.picknpay.R;
import pay.pick.com.picknpay.RestaurantDetailActivity;


/**
 * Created by lenovo on 7/15/2017.
 */

public class MenuAdapter extends BaseAdapter {
    LayoutInflater inflater;
    Context context;
public MenuAdapter(Context c)
    {
        inflater = LayoutInflater.from(c);
        this.context = c;


    }
    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null)
        {


            convertView  = inflater.inflate(R.layout.menu_category,null,false);

            ExpandablePanel panel = (ExpandablePanel)convertView.findViewById(R.id.expandableLayout);
            panel.setOnExpandListener(
                    new ExpandablePanel.OnExpandListener() {
                        @Override
                        public void onExpand(View handle, View content) {

                            ListView
                                     l = (ListView)content.findViewById(R.id.menu_listView);
                            l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                @Override
                                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                    context.startActivity(new Intent(context, MenuDetailActivity.class));
                                }
                            });
                            l.setAdapter(new MenuItemAdapter(context));
                        }

                        @Override
                        public void onCollapse(View handle, View content) {

                        }
                    }
            );

        }

        return convertView;
    }
}

package pay.pick.com.picknpay;

import android.os.Bundle;
import android.widget.ListView;

import pay.pick.com.picknpay.Adapter.CommentAdapter;
import pay.pick.com.picknpay.Adapter.ReviewAdapterUserProfile;

/**
 * Created by lenovo on 1/3/2018.
 */

public class CommentActivity extends BaseActivity {

    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);
        initialize();
        setUpComponents();

    }

    private void setUpComponents() {

        mListView.setAdapter(new CommentAdapter(CommentActivity.this));

    }

    private void initialize() {
        mListView = (ListView) this.findViewById(R.id.mListView);

    }
}

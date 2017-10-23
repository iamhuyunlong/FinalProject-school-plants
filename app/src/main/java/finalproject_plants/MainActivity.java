package finalproject_plants;


import android.app.FragmentTransaction;
import android.os.Bundle;


import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.MapFragment;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tabnote;
    private TextView tabmap;
    private TextView tabmore;
    private TextView tabfind;

    private FrameLayout ly_content;

    private noteclass f1;
    private MapFragment f2;
    private findclass f3;
    private moreclass f4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SDKInitializer.initialize(getApplicationContext());
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        bindView();

    }

    //UI组件初始化与事件绑定
    private void bindView() {
        tabnote = (TextView)this.findViewById(R.id.txt_note);
        tabmap = (TextView)this.findViewById(R.id.txt_map);
        tabfind = (TextView)this.findViewById(R.id.txt_find);
        tabmore = (TextView)this.findViewById(R.id.txt_more);
        ly_content = (FrameLayout) findViewById(R.id.fragment_container);

        tabnote.setOnClickListener(this);
        tabmore.setOnClickListener(this);
        tabfind.setOnClickListener(this);
        tabmap.setOnClickListener(this);

    }

    //重置所有文本的选中状态
    public void selected(){
        tabnote.setSelected(false);
        tabmore.setSelected(false);
        tabmap.setSelected(false);
        tabfind.setSelected(false);
    }

    //隐藏所有Fragment
    public void hideAllFragment(FragmentTransaction transaction){
        if(f1!=null){
            transaction.hide(f1);
        }
        if(f2!=null){
            transaction.hide(f2);
        }
        if(f3!=null){
            transaction.hide(f3);
        }
        if(f4!=null){
            transaction.hide(f4);
        }
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        hideAllFragment(transaction);
        switch(v.getId()){
            case R.id.txt_note:
                selected();
                tabnote.setSelected(true);
                    f1 =  new noteclass();
                    transaction.add(R.id.fragment_container,f1);
                break;

            case R.id.txt_map:
                selected();
                tabmap.setSelected(true);
                    f2 = new MapFragment();
                    transaction.add(R.id.fragment_container,f2);
                break;

            case R.id.txt_find:
                selected();
                tabfind.setSelected(true);
                    f3 = new findclass();
                    transaction.add(R.id.fragment_container,f3);
                break;

            case R.id.txt_more:
                selected();
                tabmore.setSelected(true);
                    f4 = new moreclass();
                    transaction.add(R.id.fragment_container,f4);
                break;
        }

        transaction.commit();
    }
}
package cn.supra.supralayer_i.ui.clients;

import cn.supra.supralayer_i.R;
import cn.supra.supralayer_i.define.EventDef;
import cn.supra.supralayer_i.model.LauncherPagerAdapter;
import android.content.Context;
import android.os.Message;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class LauncherClient extends BaseClient{
	private LauncherPagerAdapter mPagerAdapter;
	private Context mContext;
	private OnClickListener mOnClickListener;

	public LauncherClient(Context context) {
		super(context);
		mContext = context;
		View.inflate(context, R.layout.launcher, this);
		initDock();
		initPager();
	}
	
	private void initPager(){
		ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
		viewPager.setAdapter(mPagerAdapter);
	}
	
	private void initDock(){
		LinearLayout appDock = (LinearLayout)findViewById(R.id.app_dock);
		
//		ImageButton callBtn = getAppView("");
		
	}
	
	private ImageButton getAppView(int event){
		LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 1);
		ImageButton btn = new ImageButton(mContext);
		btn.setLayoutParams(lp);
		btn.setOnClickListener(mOnClickListener);
		return btn;
	}
	
	private void initOnClickListener() {
		mOnClickListener = new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		};

	}
	
	
	

}

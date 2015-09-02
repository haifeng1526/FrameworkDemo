package com.example.mainframework03;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity
{

	private ViewPager mViewPager;
	private FragmentPagerAdapter mAdapter;
	private List<Fragment> mFragments = new ArrayList<Fragment>();


	/**
	 * 底部四个按钮
	 */
	private LinearLayout mTabBtnWeixin;
	private LinearLayout mTabBtnFrd;
	private LinearLayout mTabBtnAddress;
	private LinearLayout mTabBtnSettings;
	private MainTab01 tab01;
	private MainTab02 tab02;
	private MainTab03 tab03;
	private MainTab04 tab04;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mViewPager = (ViewPager) findViewById(R.id.id_viewpager);
		initView();



		mAdapter = new FragmentPagerAdapter(getSupportFragmentManager())
		{

			@Override
			public int getItemPosition(Object object) {
				// TODO Auto-generated method stub
				return POSITION_NONE;
			}

			@Override
			public int getCount()
			{
				return mFragments.size();
			}

			@Override
			public Fragment getItem(int arg0)
			{
				return mFragments.get(arg0);
			}
		};

		mViewPager.setAdapter(mAdapter);


		mViewPager.setOnPageChangeListener(new OnPageChangeListener()
		{

			private int currentIndex;

			@Override
			public void onPageSelected(int position)
			{
				Toast.makeText(MainActivity.this, "onPageSelected", Toast.LENGTH_SHORT).show();
				resetTabBtn();
				switch (position)
				{
					case 0:
						((ImageButton) mTabBtnWeixin.findViewById(R.id.btn_tab_bottom_weixin))
								.setImageResource(R.drawable.tab_weixin_pressed);
						break;
					case 1:
						((ImageButton) mTabBtnFrd.findViewById(R.id.btn_tab_bottom_friend))
								.setImageResource(R.drawable.tab_find_frd_pressed);
						break;
					case 2:
						((ImageButton) mTabBtnAddress.findViewById(R.id.btn_tab_bottom_contact))
								.setImageResource(R.drawable.tab_address_pressed);
						break;
					case 3:
						((ImageButton) mTabBtnSettings.findViewById(R.id.btn_tab_bottom_setting))
								.setImageResource(R.drawable.tab_settings_pressed);
						break;
				}

				currentIndex = position;
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2)
			{

			}

			@Override
			public void onPageScrollStateChanged(int arg0)
			{
			}
		});

		mTabBtnWeixin.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, R.string.selected_weixin, Toast.LENGTH_SHORT).show();
				mViewPager.setCurrentItem(0);
//				FragmentManager fm = getSupportFragmentManager();
//				FragmentTransaction transaction = fm.beginTransaction();
//				if (tab01 == null)
//				{
//					tab01 = new MainTab01();
//				}
//				transaction.replace(R.id.id_viewpager, tab01);
//				transaction.commit();
//				Handler handler = new Handler();
//				handler.post(new Runnable() {
//					@Override
//					public void run() {
//						mAdapter.notifyDataSetChanged();
//					}
//				});
			}
		});
		mTabBtnFrd.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, R.string.selected_friend, Toast.LENGTH_SHORT).show();
				mViewPager.setCurrentItem(1);
			}
		});
		mTabBtnAddress.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, R.string.selected_address, Toast.LENGTH_SHORT).show();
				mViewPager.setCurrentItem(2);
			}
		});
		mTabBtnSettings.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, R.string.selected_setting, Toast.LENGTH_SHORT).show();
				mViewPager.setCurrentItem(3);
			}
		});

	}

	protected void resetTabBtn()
	{
		((ImageButton) mTabBtnWeixin.findViewById(R.id.btn_tab_bottom_weixin))
				.setImageResource(R.drawable.tab_weixin_normal);
		((ImageButton) mTabBtnFrd.findViewById(R.id.btn_tab_bottom_friend))
				.setImageResource(R.drawable.tab_find_frd_normal);
		((ImageButton) mTabBtnAddress.findViewById(R.id.btn_tab_bottom_contact))
				.setImageResource(R.drawable.tab_address_normal);
		((ImageButton) mTabBtnSettings.findViewById(R.id.btn_tab_bottom_setting))
				.setImageResource(R.drawable.tab_settings_normal);
	}

	private void initView()
	{

		mTabBtnWeixin = (LinearLayout) findViewById(R.id.id_tab_bottom_weixin);
		mTabBtnFrd = (LinearLayout) findViewById(R.id.id_tab_bottom_friend);
		mTabBtnAddress = (LinearLayout) findViewById(R.id.id_tab_bottom_contact);
		mTabBtnSettings = (LinearLayout) findViewById(R.id.id_tab_bottom_setting);

		tab01 = new MainTab01();
		tab02 = new MainTab02();
		tab03 = new MainTab03();
		tab04 = new MainTab04();
		mFragments.add(tab01);
		mFragments.add(tab02);
		mFragments.add(tab03);
		mFragments.add(tab04);

	}
}
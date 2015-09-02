package com.example.mainframework03;


import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class MainTab01 extends Fragment
{
	private View mview;
	private GridView gridview;
	FileListAdapter adapter;
	private Context context;
	private List<MyFile> fileList = new ArrayList<MyFile>();

	
	
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		 context = activity;
	}



	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setData();
	}



	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		mview = inflater.inflate(R.layout.main_tab_01, container, false);
		gridview = (GridView) mview.findViewById(R.id.gridview);
		adapter = new FileListAdapter(context,fileList);

		// 设置Gv的adapter
		gridview.setAdapter(adapter);
		return  mview;
	
	}
	
	
	private void setData() {
		// TODO Auto-generated method stub
		//构�?�模拟数�?
		fileList.add(new MyFile("test.txt",R.drawable.doc));
		fileList.add(new MyFile("test.jpg",R.drawable.img));
		fileList.add(new MyFile("test.avi",R.drawable.video));
		fileList.add(new MyFile("dir1",R.drawable.dir));
		fileList.add(new MyFile("test.doc",R.drawable.doc));
		fileList.add(new MyFile("test.rmvb",R.drawable.video));
		fileList.add(new MyFile("test.mp4",R.drawable.video));
		fileList.add(new MyFile("test.rm",R.drawable.video));
		fileList.add(new MyFile("test.png",R.drawable.img));
		fileList.add(new MyFile("dir2",R.drawable.dir));
	}





}

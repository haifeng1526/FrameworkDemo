package com.example.mainframework03;

import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

//自定义adapter
public class FileListAdapter extends BaseAdapter {

	// 定义Context
	private Context mContext;
	// 定义要显示的MyFile列表
	private List<MyFile> fileList;

	//FileListAdapter的构造方�?
	public FileListAdapter(Context c,List<MyFile> fl) {
		mContext = c;
		fileList = fl;
	}

	// 获取显示的条目数�?
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return fileList.size();
	}

	// 获取列表中的单个对象
	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return fileList.get(position);
	}

	// 获取列表中对象的id
	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	//构�?�每�?个item的View视图
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		//定义位置占位符类的对�?
		ViewHolder viewholder =new ViewHolder();
		if (convertView == null) {
			//初始化当前view的布�?视图
			convertView = LayoutInflater.from(mContext).inflate(
					R.layout.activity_filelist_item, null);
		}
		//获取到对应的控件对象
		viewholder.fileImage = (ImageView) convertView
				.findViewById(R.id.Iv);
		viewholder.fileName = (TextView) convertView
				.findViewById(R.id.Tv);
		//给控件对象设置相应的内容
		viewholder.fileImage.setBackgroundResource(fileList.get(position).ImgId);
		viewholder.fileName.setText(fileList.get(position).FileName);

		return convertView;
	}

	//定义内部类作为占位符组合
	class ViewHolder {
		ImageView fileImage;
		TextView fileName;
	}
}

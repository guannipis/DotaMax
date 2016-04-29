package com.example.viewdemo.module.home.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.viewdemo.R;
import com.example.viewdemo.common.base.BaseFragment;

/**
 * Created by llbt on 2016/4/22.
 */
public class DataFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener{

	private TextView tv_title;
	private View contentView;
	private SwipeRefreshLayout swipeLayout;

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		contentView = inflater.inflate(R.layout.fragment_data, null);
		initView();
		setLinerent();
		return contentView;
	}

	private void initView(){
//		tv_title = (TextView)contentView.findViewById(R.id.tv_band_title);
//		tv_title.setText(getString(R.string.game_finish));
		swipeLayout = (SwipeRefreshLayout)contentView.findViewById(R.id.swipeLayout);
	}

	private void setLinerent(){
		swipeLayout.setOnRefreshListener(this);
	}

	@Override
	public void onRefresh() {

	}
}

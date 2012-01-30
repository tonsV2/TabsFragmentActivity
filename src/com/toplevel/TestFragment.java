package com.toplevel;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TestFragment extends Fragment
{
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		LinearLayout ll = new LinearLayout(getActivity());
		TextView tv = new TextView(getActivity());
		tv.setText("hello world");
		ll.addView(tv);
		return ll;
    }
}

package com.xargsgrep.portknocker.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.actionbarsherlock.app.SherlockFragment;
import com.xargsgrep.portknocker.R;

public class HostFragment extends SherlockFragment {
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    	super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.host_fragment, container, false);
    }

    public EditText getHostLabelEditTextView() {
    	return (EditText) getView().findViewById(R.id.host_label_edit);
    }
    
    public EditText getHostnameEditTextView() {
    	return (EditText) getView().findViewById(R.id.host_name_edit);
    }
    
}

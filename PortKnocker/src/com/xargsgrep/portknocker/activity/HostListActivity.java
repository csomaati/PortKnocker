package com.xargsgrep.portknocker.activity;

import java.util.List;

import android.content.Intent;
import android.os.Bundle;

import com.actionbarsherlock.app.SherlockListActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.xargsgrep.portknocker.R;
import com.xargsgrep.portknocker.adapter.HostArrayAdapter;
import com.xargsgrep.portknocker.manager.HostDataManager;
import com.xargsgrep.portknocker.model.Host;

public class HostListActivity extends SherlockListActivity {
	
    HostDataManager hostDataManager;
    
	private static final int MENU_ADD_ITEM_ID = 1;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        hostDataManager = new HostDataManager(getApplicationContext());
        
        getSupportActionBar().setHomeButtonEnabled(false);
        setContentView(R.layout.host_list);
        getListView().setItemsCanFocus(true);
        
        List<Host> hosts = hostDataManager.getAllHosts();
		HostArrayAdapter hostAdapter = new HostArrayAdapter(this, hosts);
		setListAdapter(hostAdapter);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(Menu.NONE, MENU_ADD_ITEM_ID, 0, null).setIcon(R.drawable.ic_action_add).setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        return true;
	}
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch (item.getItemId()) {
	    	case MENU_ADD_ITEM_ID: 
				Intent editHostIntent = new Intent(this, EditHostActivity.class);
		        startActivity(editHostIntent);
		        return true;
		    default:
		    	return super.onOptionsItemSelected(item);
    	}
    }
    
}
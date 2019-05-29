package testdevapp;

public class testdevapp1 {

	<?xml version="1.0" encoding="utf-8"?>
	<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
	xmlns:app="http://schemas.android.com/apk/res-auto" 
	android:layout_width="match_parent" 
	android:layout_height="match_parent">
	<RelativeLayout
	android:id="@+id/map_view" 
	android:layout_width="match_parent" 
	android:layout_height="match_parent"/>
	<android.support.design.widget.FloatingActionButton android:id="@+id/fab_current_point" 
	android:layout_width="wrap_content" 
	android:layout_height="wrap_content" 
	android:layout_above="@+id/fab_gps" 
	android:layout_alignParentRight="true" 
	android:layout_marginRight="20dp" 
	android:src="@drawable/ic_check_white_24dp" 
	app:fabSize="mini" 
	app:backgroundTint="@color/colorPrimary" 
	app:rippleColor="@color/colorPrimaryDark" /> 
	<android.support.design.widget.FloatingActionButton
	android:id="@+id/fab_gps" 
	android:layout_width="wrap_content" 
	android:layout_height="wrap_content" 
	android:layout_alignParentBottom="true" 
	android:layout_alignParentRight="true" 
	android:layout_margin="20dp" 
	android:src="@drawable/ic_gps_fixed_white_24dp" 
	app:fabSize="mini" 
	app:backgroundTint="@color/colorPrimary" 
	app:rippleColor="@color/colorPrimaryDark" />
</RelativeLayout>

}
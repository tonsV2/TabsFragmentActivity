package com.toplevel;

import android.os.Bundle;

public class MainActivity extends TabsFragmentActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.addTab("test1", "Test1", TestFragment.class);
        this.addTab("test2", "Test2", TestFragment.class);
        this.addTab("test3", "Test3", TestFragment.class);

        restoreFromSavedInstanceState(savedInstanceState);
    }
}

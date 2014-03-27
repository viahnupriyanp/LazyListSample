package com.vishnu.lazylist.sample;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity {
    
    ListView list;
    LazyAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        list=(ListView)findViewById(R.id.list);
        adapter=new LazyAdapter(this, mStrings);
        list.setAdapter(adapter);
        
        Button b=(Button)findViewById(R.id.button1);
        b.setOnClickListener(listener);
    }
    
    @Override
    public void onDestroy()
    {
        list.setAdapter(null);
        super.onDestroy();
    }
    
    public OnClickListener listener=new OnClickListener(){
        @Override
        public void onClick(View arg0) {
            adapter.imageLoader.clearCache();
            adapter.notifyDataSetChanged();
        }
    };
    
    private String[] mStrings={
            "http://t2.gstatic.com/images?q=tbn:ANd9GcT93cXiArswhJ2h9pS-tNR0UrX28PRqehsBNLAc51FkP2WLizI-",
            "http://wonderfulengineering.com/wp-content/uploads/2013/12/hd-wallpaper-desktop-1.jpeg",
            "http://3.bp.blogspot.com/_XF_J0xP6x-w/TTS0mWqEdCI/AAAAAAAAApI/WXep_jByWUg/s1600/wallpaper-firefox-hd-4.jpg",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcSxoflrnUNmbDlXAR5yGAMBLhdJ1uVt71pXPp2FRvqzqo7BGzgf2A",
            "http://i1.sndcdn.com/artworks-000036560566-df44v5-original.jpg?435a760",
            "http://mgv.nu/wp-content/uploads/2013/12/road.jpg",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcT93cXiArswhJ2h9pS-tNR0UrX28PRqehsBNLAc51FkP2WLizI-",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcSxoflrnUNmbDlXAR5yGAMBLhdJ1uVt71pXPp2FRvqzqo7BGzgf2A",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcT93cXiArswhJ2h9pS-tNR0UrX28PRqehsBNLAc51FkP2WLizI-",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcT93cXiArswhJ2h9pS-tNR0UrX28PRqehsBNLAc51FkP2WLizI-",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcSxoflrnUNmbDlXAR5yGAMBLhdJ1uVt71pXPp2FRvqzqo7BGzgf2A",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcT93cXiArswhJ2h9pS-tNR0UrX28PRqehsBNLAc51FkP2WLizI-",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcSxoflrnUNmbDlXAR5yGAMBLhdJ1uVt71pXPp2FRvqzqo7BGzgf2A",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcT93cXiArswhJ2h9pS-tNR0UrX28PRqehsBNLAc51FkP2WLizI-",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcSxoflrnUNmbDlXAR5yGAMBLhdJ1uVt71pXPp2FRvqzqo7BGzgf2A",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcT93cXiArswhJ2h9pS-tNR0UrX28PRqehsBNLAc51FkP2WLizI-",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcSxoflrnUNmbDlXAR5yGAMBLhdJ1uVt71pXPp2FRvqzqo7BGzgf2A",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcT93cXiArswhJ2h9pS-tNR0UrX28PRqehsBNLAc51FkP2WLizI-",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcSxoflrnUNmbDlXAR5yGAMBLhdJ1uVt71pXPp2FRvqzqo7BGzgf2A",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcT93cXiArswhJ2h9pS-tNR0UrX28PRqehsBNLAc51FkP2WLizI-",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcSxoflrnUNmbDlXAR5yGAMBLhdJ1uVt71pXPp2FRvqzqo7BGzgf2A",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcT93cXiArswhJ2h9pS-tNR0UrX28PRqehsBNLAc51FkP2WLizI-",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcSxoflrnUNmbDlXAR5yGAMBLhdJ1uVt71pXPp2FRvqzqo7BGzgf2A",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcT93cXiArswhJ2h9pS-tNR0UrX28PRqehsBNLAc51FkP2WLizI-",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcSxoflrnUNmbDlXAR5yGAMBLhdJ1uVt71pXPp2FRvqzqo7BGzgf2A",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcT93cXiArswhJ2h9pS-tNR0UrX28PRqehsBNLAc51FkP2WLizI-",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcSxoflrnUNmbDlXAR5yGAMBLhdJ1uVt71pXPp2FRvqzqo7BGzgf2A",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcT93cXiArswhJ2h9pS-tNR0UrX28PRqehsBNLAc51FkP2WLizI-",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcSxoflrnUNmbDlXAR5yGAMBLhdJ1uVt71pXPp2FRvqzqo7BGzgf2A",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcT93cXiArswhJ2h9pS-tNR0UrX28PRqehsBNLAc51FkP2WLizI-",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcSxoflrnUNmbDlXAR5yGAMBLhdJ1uVt71pXPp2FRvqzqo7BGzgf2A",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcT93cXiArswhJ2h9pS-tNR0UrX28PRqehsBNLAc51FkP2WLizI-"
    };
}
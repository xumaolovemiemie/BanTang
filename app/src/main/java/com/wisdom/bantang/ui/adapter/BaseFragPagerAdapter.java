package com.wisdom.bantang.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by juan on 2016/3/10.
 */
public class BaseFragPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> list_fragments;
    private String[] tabTitle;
    private FragmentManager fm;
    public BaseFragPagerAdapter(FragmentManager fm,ArrayList<Fragment> list_fragments,String[]tabTitle) {
        super(fm);
        this.list_fragments = list_fragments;
        this.tabTitle = tabTitle;
        this.fm = fm;
    }

    @Override
    public Fragment getItem(int position) {
        return list_fragments.get(position);
    }

    @Override
    public int getCount() {
        return list_fragments.size();
    }

//    @Override     PagerAdapter:
//    public Object instantiateItem(ViewGroup container, int position) {
//      Fragment fragment = list_fragments.get(position);
//        if (!fragment.isAdded()){
//            fm.beginTransaction().add(fragment,fragment.getClass().getName()).commit();
//    //        fm.executePendingTransactions();
//        }
//        View view = fragment.getView();
//        if (view.getParent() == null){
//            container.addView(view);
//        }
//    //    return view;
//        return view;
//    }
//
//    @Override
//    public void destroyItem(ViewGroup container, int position, Object object) {
//
//          //   list_fragments.remove(position);
//        container.removeView(list_fragments.get(position).getView());
//
//    }
//
////    @Override
////    public boolean isViewFromObject(View view, Object object) {
////        return view == object;
////    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle[position];
    }
}

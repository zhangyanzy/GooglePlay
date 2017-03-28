package com.tarenwang.googleplay;

import android.databinding.DataBindingUtil;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tarenwang.googleplay.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private String[] mMainTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        initData();
    }

    private void initData() {
        mMainTitle = new String[]{"首页","应用","游戏","专题","推荐","分类","排行"};
        binding.mainViewpager.setAdapter(new ViewPagerAdapter());
        binding.mainTab.setViewPager(binding.mainViewpager);
        binding.mainTab.setIndicatorColorResource(R.color.colorAccent);
        binding.mainTab.setIndicatorHeight(2);
    }

    class ViewPagerAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            if (mMainTitle != null) {
                return mMainTitle.length;
            }
            return 0;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            TextView tv = new TextView(UIUtils.getContext());
            tv.setText(mMainTitle[position]);
            container.addView(tv);
            return tv;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mMainTitle[position];
        }
    }
}


package com.example.wellerson.crossystem;

import android.app.ListActivity;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import fragments.FragmentOne;
import fragments.FragmentThree;
import fragments.FragmentTwo;

public class DetalhesActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);

        TabsAdapter adapter = new TabsAdapter(getSupportFragmentManager());//tirar duvida com silas
        adapter.addFragment(new FragmentOne(), "Parceiros");
        adapter.addFragment(new FragmentTwo(), "Pedidos");
        adapter.addFragment(new FragmentThree(), "Orçamentos");
        adapter.addFragment(new FragmentThree(), "Orçamentos");

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        viewPager.setAdapter(adapter);





        FloatingActionButton fab1 = (FloatingActionButton) findViewById(R.id.fab);
        fab1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(DetalhesActivity.this, ParceirosActivity.class);
                startActivity(intent);
            }
        });




    }


    public class TabsAdapter extends FragmentPagerAdapter{

        private ArrayList<Fragment> listFragments = new ArrayList<>();
        private final ArrayList<String> fragmentTitleList = new ArrayList<>();

        public TabsAdapter(FragmentManager manager){//tirar a duvida com o silas
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {//Tirar a duvida com o silas
            return listFragments.get(position);
        }

        @Override
        public int getCount() {//tirar duvida com silas
            return listFragments.size();
        }

        public void addFragment(Fragment fragment, String title){ //tirar duvida com silas
            listFragments.add(fragment);
            fragmentTitleList.add(title);

        }

        @Override
        public CharSequence getPageTitle(int position){
            return fragmentTitleList.get(position);
        }
    }


}

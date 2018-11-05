package com.omelchenkoaleks.remindme;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    // Выносим layout в константу, что было сразу видно вначале, какой макет мы используем.
    private static final int LAYOUT = R.layout.activity_main;

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Указываем какую тему и стили мы используем.
        setTheme(R.style.AppDefault);
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);

        // Выносим логику в отдельные методы (логичиские части), чтобы не засорять метод onCreate().
        initToolbar();
        initNavigationView();
    }

    private void initToolbar() {
        // получаем Toolbar
        toolbar = findViewById(R.id.toolbar);
        // задаем заголовок
        toolbar.setTitle(R.string.app_name);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                return false;
            }
        });

        // ToolBar будет использовать меню
        toolbar.inflateMenu(R.menu.menu);
    }

    // Инициализация NavigationView().
    private void initNavigationView() {
        drawerLayout = findViewById(R.id.drawer_layout);
    }
}

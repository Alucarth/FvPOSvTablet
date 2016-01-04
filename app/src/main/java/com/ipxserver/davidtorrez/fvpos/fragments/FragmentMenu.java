package com.ipxserver.davidtorrez.fvpos.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.ipxserver.davidtorrez.fvpos.R;
import com.ipxserver.davidtorrez.fvpos.adapter.NavAdapter;
import com.ipxserver.davidtorrez.fvpos.models.NavItem;

import java.util.ArrayList;

/**
 * Created by David on 04/01/16.
 */
public class FragmentMenu extends Fragment {

    private ListView menuList;
    private ArrayList<NavItem> menu_tableta;
    private NavAdapter navAdapter;
    private void IniciarMenu()
    {

        this.menu_tableta = new ArrayList<>();

        NavItem navItem = new NavItem("Todos los Articulos",R.drawable.ic_action_report);
        menu_tableta.add(navItem);

        navItem = new NavItem("Categorias",R.drawable.ic_action_new_black);
        menu_tableta.add(navItem);

        navItem = new NavItem("Descuentos",R.drawable.ic_action_empresa_black);
        menu_tableta.add(navItem);

        navAdapter = new NavAdapter(menuList.getContext(),menu_tableta);
        menuList.setAdapter(navAdapter);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_menu,container,false);
        this.menuList = (ListView) rootView.findViewById(R.id.list_menu_tablet);
        IniciarMenu();
        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}

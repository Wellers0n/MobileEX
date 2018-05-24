package fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.wellerson.crossystem.R;

public class FragmentTwo extends Fragment{

    public FragmentTwo(){
        //tirar duvida com silas
    }

    @Override
    public void onCreate(Bundle savedInstaceState){
        super.onCreate(savedInstaceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        String[] listaDeItens = {"PEDIDOS", "PEDIDOS", "PEDIDOS", "PEDIDOS", "PEDIDOS", "PEDIDOS", "PEDIDOS", "PEDIDOS", "PEDIDOS", "PEDIDOS", "PEDIDOS", "PEDIDOS", "PEDIDOS", };

        ListView listView = (ListView) view.findViewById(R.id.lista2);


        ArrayAdapter<String> adaptarString = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, listaDeItens);

        listView.setAdapter(adaptarString);

        return view;


    }
}

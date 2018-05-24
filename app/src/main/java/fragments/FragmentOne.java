package fragments;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.wellerson.crossystem.R;

public class FragmentOne extends Fragment {

    public FragmentOne(){
        //Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.fragment_one, container, false);

        String[] listaDeItens = { "PARCEIRO", "PARCEIRA", "PARCERIA", "LISTA DE PARCEIROS","LISTA DE PARCEIROS", "LISTA DE PARCEIROS", "LISTA DE PARCEIROS", "LISTA DE PARCEIROS", "LISTA DE PARCEIROS", "LISTA DE PARCEIROS", "LISTA DE PARCEIROS", "LISTA DE PARCEIROS"};

        ListView listView = (ListView) view.findViewById(R.id.lista);

        ArrayAdapter<String> adaptarString = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, listaDeItens);


        listView.setAdapter(adaptarString);

        return view;
    }}

package fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.wellerson.crossystem.R;

public class FragmentThree extends Fragment{


    public FragmentThree(){
        //tirar duvida com silas
    }

    @Override
    public void onCreate(Bundle savedInstanceState){ super.onCreate(savedInstanceState); }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){ //TIRAR DUVIDA COM SILASSSSSS

        View view  = inflater.inflate(R.layout.fragment_three, container, false);

        String[] listaDeItens = {"ORÇAMENTOS", "ORÇAMENTOS", "ORÇAMENTOS", "ORÇAMENTOS", "ORÇAMENTOS", "ORÇAMENTOS", "ORÇAMENTOS", "ORÇAMENTOS","ORÇAMENTOS","ORÇAMENTOS","ORÇAMENTOS","ORÇAMENTOS","ORÇAMENTOS","ORÇAMENTOS", "ORÇAMENTOS" };

        ListView listView = (ListView) view.findViewById(R.id.lista3);

        ArrayAdapter<String> adaptarString = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, listaDeItens);

        listView.setAdapter(adaptarString);


        return view;
    }
}

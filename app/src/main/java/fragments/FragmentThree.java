package fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wellerson.crossystem.R;

public class FragmentThree extends Fragment{


    public FragmentThree(){
        //tirar duvida com silas
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){ //TIRAR DUVIDA COM SILASSSSSS

        return inflater.inflate(R.layout.fragment_three, container, false);
    }
}

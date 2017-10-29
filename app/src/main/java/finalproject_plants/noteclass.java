package finalproject_plants;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class noteclass extends Fragment {
    private ImageButton phobtn;
    private ImageButton plabtn;
    private ImageButton jacbtn;
    private ImageButton hanbtn;
    private ImageButton linbtn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.note, container, false);
        phobtn = view.findViewById(R.id.photinia);
        plabtn = view.findViewById(R.id.planch);
        jacbtn = view.findViewById(R.id.jacq);
        hanbtn = view.findViewById(R.id.hance);
        linbtn = view.findViewById(R.id.linn);
        phobtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(noteclass.this.getActivity(),plants.class);
                intent.setFlags(1);
                startActivity(intent);
            }
        });
        plabtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(noteclass.this.getActivity(),plants.class);
                intent.setFlags(2);
                startActivity(intent);
            }
        });
        jacbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(noteclass.this.getActivity(),plants.class);
                intent.setFlags(3);
                startActivity(intent);
            }
        });
        hanbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(noteclass.this.getActivity(),plants.class);
                intent.setFlags(4);
                startActivity(intent);
            }
        });
        linbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(noteclass.this.getActivity(),plants.class);
                intent.setFlags(5);
                startActivity(intent);
            }
        });
        return view;
    }
}

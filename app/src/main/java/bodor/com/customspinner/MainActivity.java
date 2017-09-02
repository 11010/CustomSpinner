package bodor.com.customspinner;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private List<String> lstSource = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateData();

        spinner = (Spinner) findViewById(R.id.spinner);
        SpinnerAdapter sp =  new SpinnerAdapter(this,lstSource);
        spinner.setDropDownVerticalOffset(200);
        spinner.setDropDownHorizontalOffset(500);
        spinner.setAdapter(sp);




    }

    private void generateData() {
        for (int i=0;i<10;i++){
            lstSource.add("item"+ i);
        }
    }
}

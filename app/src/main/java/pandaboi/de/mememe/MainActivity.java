package pandaboi.de.mememe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements TopFragment.TopFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(pandaboi.de.mememe.R.layout.activity_main);
    }

    @Override
    public void updateMeme(final String top, final String bottom) {
        BottomFragment bottomFragment = (BottomFragment) getFragmentManager().findFragmentById(pandaboi.de.mememe.R.id.fragmentBottom);
        bottomFragment.setMemeText(top, bottom);
    }
}

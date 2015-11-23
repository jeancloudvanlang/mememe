package pandaboi.de.mememe;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class BottomFragment extends Fragment {

    @Bind(pandaboi.de.mememe.R.id.memeTopText)
    TextView topText;

    @Bind(pandaboi.de.mememe.R.id.memeBottomText)
    TextView bottomText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(pandaboi.de.mememe.R.layout.fragment_bottom, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    public void setMemeText(final String top, final String bottom) {
        topText.setText(top);
        bottomText.setText(bottom);
    }
}

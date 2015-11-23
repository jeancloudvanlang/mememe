package pandaboi.de.mememe;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class TopFragment extends Fragment {

    @Bind(pandaboi.de.mememe.R.id.topText)
    EditText topText;

    @Bind(pandaboi.de.mememe.R.id.bottomText)
    EditText bottomText;

    TopFragmentListener top;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(pandaboi.de.mememe.R.layout.fragment_top, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(pandaboi.de.mememe.R.id.updateMemeButton)
    void setMemeText(View view) {
        top.updateMeme(topText.getText().toString(), bottomText.getText().toString());
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof TopFragmentListener) {
            top = (TopFragmentListener) context;
        }
    }

    public interface TopFragmentListener {
        void updateMeme(final String top, final String bottom);
    }
}

package ec.edu.uce.trabajo_grupo05.ejercicios.c2;

import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import ec.edu.uce.trabajo_grupo05.R;

public class E5ContextListItem extends LinearLayout implements
        PopupMenu.OnMenuItemClickListener,
        View.OnClickListener {

    private PopupMenu mPopupMenu;
    private TextView mTextView;

    public E5ContextListItem(Context context) {
        super(context);
    }

    public E5ContextListItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public E5ContextListItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mTextView = (TextView) findViewById(R.id.text);

        //Attach click handlers
        View contextButton = findViewById(R.id.context);
        contextButton.setOnClickListener(this);

        //Create the context menu
        mPopupMenu = new PopupMenu(getContext(), contextButton);
        mPopupMenu.setOnMenuItemClickListener(this);
        mPopupMenu.inflate(R.menu.c2e5contextmenu);
    }

    @Override
    public void onClick(View v) {
        //Handle context button click to show the menu
        mPopupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        String itemText = mTextView.getText().toString();

        switch (item.getItemId()) {
            case R.id.menu_edit:
                Toast.makeText(getContext(), "Edit "+itemText, Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_delete:
                Toast.makeText(getContext(), "Delete "+itemText, Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}

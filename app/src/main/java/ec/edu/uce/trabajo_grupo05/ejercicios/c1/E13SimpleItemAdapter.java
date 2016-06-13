package ec.edu.uce.trabajo_grupo05.ejercicios.c1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ec.edu.uce.trabajo_grupo05.R;

public class E13SimpleItemAdapter extends RecyclerView.Adapter<E13SimpleItemAdapter.ItemHolder> {

    /*
     * Click handler interface. RecyclerView does not have
     * its own built in like AdapterViews do.
     */
    public interface OnItemClickListener {
        public void onItemClick(ItemHolder item, int position);
    }

    private static final String[] ITEMS = {
            "Apples", "Oranges", "Bananas", "Mangos",
            "Carrots", "Peas", "Broccoli",
            "Pork", "Chicken", "Beef", "Lamb"
    };
    private List<String> mItems;

    private OnItemClickListener mOnItemClickListener;
    private LayoutInflater mLayoutInflater;

    public E13SimpleItemAdapter(Context context) {
        mLayoutInflater = LayoutInflater.from(context);
        //Create static list of dummy items
        mItems = new ArrayList<String>();
        mItems.addAll(Arrays.asList(ITEMS));
        mItems.addAll(Arrays.asList(ITEMS));
    }

    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mLayoutInflater.inflate(R.layout.collection_itemc1e13, parent, false);

        return new ItemHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, int position) {
        holder.setTitle("Item #"+(position+1));
        holder.setSummary(mItems.get(position));
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public OnItemClickListener getOnItemClickListener() {
        return mOnItemClickListener;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mOnItemClickListener = listener;
    }

    /* Methods to manage modifying the data set */
    public void insertItemAtIndex(String item, int position) {
        mItems.add(position, item);
        //Notify the view to trigger a change animation
        notifyItemInserted(position);
    }

    public void removeItemAtIndex(int position) {
        if (position >= mItems.size()) return;

        mItems.remove(position);
        //Notify the view to trigger a change animation
        notifyItemRemoved(position);
    }

    /* Required implementation of ViewHolder to wrap item view */
    public static class ItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private E13SimpleItemAdapter mParent;
        private TextView mTitleView, mSummaryView;

        public ItemHolder(View itemView, E13SimpleItemAdapter parent) {
            super(itemView);
            itemView.setOnClickListener(this);
            mParent = parent;

            mTitleView = (TextView) itemView.findViewById(R.id.text_title);
            mSummaryView = (TextView) itemView.findViewById(R.id.text_summary);
        }

        public void setTitle(CharSequence title) {
            mTitleView.setText(title);
        }

        public void setSummary(CharSequence summary) {
            mSummaryView.setText(summary);
        }

        public CharSequence getSummary() {
            return mSummaryView.getText();
        }

        @Override
        public void onClick(View v) {
            final OnItemClickListener listener = mParent.getOnItemClickListener();
            if (listener != null) {
                listener.onItemClick(this, getPosition());
            }
        }
    }
}

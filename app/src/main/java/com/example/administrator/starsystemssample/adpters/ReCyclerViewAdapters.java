package com.example.administrator.starsystemssample.adpters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.starsystemssample.R;
import com.example.administrator.starsystemssample.datamodel.Field_;
import com.example.administrator.starsystemssample.datamodel.Section;

import java.util.List;

/**
 * Created by Administrator on 3/22/2018.
 */

public class ReCyclerViewAdapters extends RecyclerView.Adapter<ReCyclerViewAdapters.OrderHistoryViewHolder> {
    private ReCyclerViewItemClickListener mreCyclerViewItemClickListener;
    private Context mContext;
    List<Section> deviceList;

    /**
     * Initialize the values
     *
     * @param context                       : context reference
     * @param reCyclerViewItemClickListener : callBack Of ClickListener
     * @param devices                       : data
     */

    public ReCyclerViewAdapters(Context context, ReCyclerViewItemClickListener reCyclerViewItemClickListener, List<Section> devices) {
        this.mContext = context;
        this.mreCyclerViewItemClickListener = reCyclerViewItemClickListener;
        this.deviceList = devices;
    }


    /**
     * @param parent   : parent ViewPgroup
     * @param viewType : viewType
     * @return ViewHolder
     * <p>
     * Inflate the Views
     * Create the each views and Hold for Reuse
     */
    @Override
    public ReCyclerViewAdapters.OrderHistoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.test, parent, false);
        OrderHistoryViewHolder myViewHolder = new OrderHistoryViewHolder(view);
        return myViewHolder;
    }

    /**
     * @param holder   :view Holder
     * @param position : position of each Row
     *                 set the values to the views
     */
    @Override
    public void onBindViewHolder(ReCyclerViewAdapters.OrderHistoryViewHolder holder, int position) {
        holder.textView.setText(deviceList.get(position).getSectionName());
        List<Field_> fields = deviceList.get(position).getFields();
        for (int i = 0; i < fields.size(); i++) {
            String fieldLabel = fields.get(i).getFieldLabel();
            String fieldAnswerType = fields.get(i).getFieldAnswerType();

            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.the_child_view, holder.linearLayout, false);
            TextView textView = (TextView) view.findViewById(R.id.text_input);
            EditText editText = (EditText) view.findViewById(R.id.ed_input);


            textView.setText(fieldLabel);
            if ("Number".equalsIgnoreCase(fieldAnswerType)) {
                editText.setInputType(InputType.TYPE_CLASS_NUMBER);
            } else
                editText.setInputType(InputType.TYPE_CLASS_TEXT);

            holder.linearLayout.addView(view);

        }


    }

    @Override
    public int getItemCount() {
        return deviceList.size();
    }


    /**
     * Create The view First Time and hold for reuse
     * View Holder for Create and Hold the view for ReUse the views instead of create again
     * Initialize the views
     */

    public class OrderHistoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        LinearLayout linearLayout, parent;
        TextView textView;

        public OrderHistoryViewHolder(View itemView) {
            super(itemView);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.root);
            parent = (LinearLayout) itemView.findViewById(R.id.parent);

            textView = (TextView) itemView.findViewById(R.id.header);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            mreCyclerViewItemClickListener.onItemClickListener(view, this.getAdapterPosition());
        }
    }
}

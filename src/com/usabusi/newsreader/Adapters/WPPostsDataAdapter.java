package com.usabusi.newsreader;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import com.usabusi.newsreader.WPPostsData;
/**
 * Created by vip on 11/24/14.
 */




public class WPPostsDataAdapter extends ArrayAdapter<WPPostsData> {
    private LayoutInflater mInflater;

    public WPPostsDataAdapter(Context context, int textViewResourceId, List<WPPostsData> objects) {
        super(context, textViewResourceId, objects);
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        Holder holder;

        if (view == null) {
            // View doesn't exist so create it and create the holder
            view = mInflater.inflate(R.layout.headline_item, parent, false);

            holder = new Holder();
//            holder.screenCapThumbnailImage = (ImageView) view.findViewById(R.id.imgScreencapThumbnail);
//            holder.lblTitleText = (TextView) view.findViewById(R.id.lblTitle);
//            holder.lblGame = (TextView) view.findViewById(R.id.lblGame);
//            holder.lblUser = (TextView) view.findViewById(R.id.lblUser);
//            holder.lblViewers = (TextView) view.findViewById(R.id.lblViewers);
//            holder.channelThumbnailImage = (ImageView) view.findViewById(R.id.imgChannelThumbnail);

            view.setTag(holder);
        } else {
            // Just get our existing holder
            holder = (Holder) view.getTag();
        }

        // Populate via the holder for speed
        WPPostsData article = getItem(position);

//        // Populate the item contents
//        holder.lblTitleText.setText(stream.getChannel().getName());
//        holder.lblGame.setText(stream.getGame());
//        //holder.lblUser.setText(stream.getChannel().getLogin());
//        int totalViewers = stream.getViewers();
//        holder.lblViewers.setText(getContext().getResources().getQuantityString(R.plurals.viewers, totalViewers, totalViewers));
//
//        // Load the screen cap image on a background thread
//        Picasso.with(getContext())
//                .load(stream.getPreview().getLarge()) // .load(stream.getChannel().getScreen_cap_url_medium())
//                .placeholder(R.drawable.white)
//                .into(holder.screenCapThumbnailImage);
//
//        // Load the channel thumbnail image on a background thread
//        Picasso.with(getContext())
//                .load(stream.getPreview().getMedium())//.load(stream.getChannel().getImage_url_medium())
//                .placeholder(R.drawable.transparent)
//                .into(holder.channelThumbnailImage);

        return view;
    }

    // Holder class used to efficiently recycle view positions
    private static final class Holder {
        public ImageView screenCapThumbnailImage;
        public ImageView channelThumbnailImage;
        public TextView lblTitleText;
        public TextView lblGame;
        public TextView lblUser;
        public TextView lblViewers;
    }
}

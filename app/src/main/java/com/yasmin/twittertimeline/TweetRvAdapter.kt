package com.yasmin.twittertimeline

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class TweetRvAdapter(var tweetsList: List<Tweets>): RecyclerView.Adapter<TweetRvAdapter.tweetsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetRvAdapter.tweetsViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.timeline_list_twee, parent, false)
        return tweetsViewHolder((itemView))
    }

    override fun onBindViewHolder(holder: tweetsViewHolder, position: Int) {
        var currentTweet = tweetsList.get(position)
        holder.tvHandles.text = currentTweet.Handles
        holder.tvRetweets.text = currentTweet.Retweets
        holder.tvcomments.text = currentTweet.comments
        holder.tvTweet.text = currentTweet.Tweet
        holder.tvLike.text = currentTweet.like


    }

    override fun getItemCount(): Int {
        return tweetsList.size
    }
    class tweetsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvHandles = itemView.findViewById<TextView>(R.id.tvHandles)
        var tvTweets = itemView.findViewById<TextView>(R.id.tvtweet)
        var tvTweet = itemView.findViewById<TextView>(R.id.tvtweet)
        var tvcomments = itemView.findViewById<TextView>(R.id.tvcomments)
        var tvRetweets = itemView.findViewById<TextView>(R.id.tvRetweet)
        var tvLike = itemView.findViewById<TextView>(R.id.tvLike)
        var imgAvatar = itemView.findViewById<ImageView>(R.id.imgAvatar)
        var imgComment = itemView.findViewById<ImageView>(R.id.imgComment)
        var imgRetweet = itemView.findViewById<ImageView>(R.id.imgRetweet)
        var imgShare = itemView.findViewById<ImageView>(R.id.imgShare)
    }
}
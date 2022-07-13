package com.yasmin.twittertimeline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.yasmin.twittertimeline.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweets()
    }
    fun displayTweets(){
        var tweet = Tweets("Yasmin @Yasmin Jul 10,2022","Ux researcher","88","8","34","75","67")
        var tweet1 = Tweets("Jane  @jane Jul 10,2022","UI/UX designer","92","89","12","65","75")
        var tweet2 = Tweets("Lulu @lulu Jul 10,2022","GREAT Day","","","48","476","75")
        var tweet3 = Tweets("Fardosa @Fardosa Jul 8,2022","#Hope","","","34","76","89")
        var tweet4 = Tweets("Rose @Rose Jul 10,2022","#Techie","","","40","75","89")
        var tweet5 = Tweets("Speria @Speria Jul 10,2022","#Techie","","","28","74","34")


        var tweetsList = listOf(tweet,tweet1,tweet2,tweet3,tweet4,tweet5)

        var twitterAdapter = TweetRvAdapter(tweetsList)
        binding.rvTweet.layoutManager = LinearLayoutManager(this)
        binding.rvTweet.adapter = twitterAdapter
    }
}
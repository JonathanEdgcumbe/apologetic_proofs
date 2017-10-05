package com.example.jono.apologeticproofs.Apologetics;

import android.os.Bundle;

import com.example.jono.apologeticproofs.DivineAttributesPackage.BaseActivity;


public class WhatIsApologetics extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("What is Apologetics?");
        addHeading("Description");
        addNormalText("The word “apologetics” originates from the Greek word <i>apologia</i>, " +
                "which literally means to make a formal defence of one’s belief. The noun " +
                "<i>apologia</i> and its verb <i>apologeomai</i> are used several times in " +
                "the Bible<font color='#289CD5'>[1]</font>. <i>Mounce’s Complete Expository" +
                " Dictionary of Old & New Testament Words</i> defines the word as follows:");
        addBlockQuote("<i>Apologeomai</i> means “to defend something or someone, including" +
                " oneself, through speech.” The word bears the sense of advocacy and defense," +
                " which our word “apologetics” still retains; [<i>apologeomai</i>] often" +
                " occurs in a legal context<font color='#289CD5'>[2]</font>.<br>");
        addNormalText("Therefore, Christian apologetics is defined today as the branch of " +
                "theology that offers a reasoned defence and justification in favour " +
                "of Christianity.");
        addHeading("References");
        addNormalText("<h5><font color='#289CD5'>[1]</font> Luke 12:11</h5>" +
                "11 And when they bring you before the synagogues and the rulers and the " +
                "authorities, do not be anxious about how you should defend yourself or " +
                "what you should say,<br><br>" +
                "<h5>Luke 21:14</h5>" +
                "14 Settle it therefore in your minds not to meditate beforehand how to " +
                "answer,<br><br>" +
                "<h5>Acts 24:10</h5>" +
                "10 And when the governor had nodded to him to speak, Paul replied: " +
                "“Knowing that for many years you have been a judge over this nation, I " +
                "cheerfully make my defense. <br><br>" +
                "<h5>Acts 25:8</h5>" +
                "8 Paul argued in his defense, “Neither against the law of the Jews, nor " +
                "against the temple, nor against Caesar have I committed any offense.”<br><br>" +
                "<h5>Acts 26:1-2</h5>" +
                "1 So Agrippa said to Paul, “You have permission to speak for yourself.” " +
                "Then Paul stretched out his hand and made his defense:<br><br>" +
                "2 “I consider myself fortunate that it is before you, King Agrippa, I am " +
                "going to make my defense today against all the accusations of the Jews, <br><br>" +
                "<h5>Acts 26:24</h5>" +
                "24 And as he was saying these things in his defense, Festus said with " +
                "a loud voice, “Paul, you are out of your mind; your great learning is driving" +
                " you out of your mind.”<br><br>" +
                "<h5>1 Corinthians 12:19</h5>" +
                "19 If all were a single member, where would the body be?<br><br>" +
                "<h5>1 Peter 3:15</h5>" +
                "15 but in your hearts honor Christ the Lord as holy, always being prepared" +
                " to make a defense to anyone who asks you for a reason for the hope that is " +
                "in you; yet do it with gentleness and respect,<br><br>" +
                "<font color='#289CD5'>[2]</font> William D. Mounce, ed., Mounce’s Complete" +
                " Expository Dictionary of Old & New Testament Words (Grand Rapids," +
                " Michigan: Zondervan, 2006), 164");
    }
}


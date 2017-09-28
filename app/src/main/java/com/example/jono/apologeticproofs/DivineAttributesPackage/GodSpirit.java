package com.example.jono.apologeticproofs.DivineAttributesPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jono.apologeticproofs.R;

public class GodSpirit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shared_layout);
        setupBackButton();
        setupTextViews();
        setupReferenceTextViews();
        setTitle("Spirit");
    }

    private void setupBackButton() {
        Button button = (Button) findViewById(R.id.BackButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void setupTextViews() {
        TextView textView = (TextView) findViewById(R.id.headingTextView);
        textView.setText(Html.fromHtml("Another attribute of God is that He is spirit. In John 4:24 (ESV), " +
                "Jesus says: “God is spirit, and those who worship him must worship in spirit " +
                "and truth”. So God is not a material being or a physical object (like the sun)," +
                " but He is a spiritual being.\n" +
                "\n" +
                "This has three interesting implications. Firstly, no picture or physical object" +
                " can accurately represent God. In fact, the very first commandment prohibits us" +
                " from making any images in an attempt to represent God. \n" +
                "\n" +
                "Exodus 20:4 (ESV) says:\n" +
                "\n" +
                "You shall not make for yourself a carved image, or any likeness of anything" +
                " that is in heaven above, or that is in the earth beneath, or that is in the" +
                " water under the earth.\n" +
                "\n" +
                "I take this verse to imply that, because God is not a physical object, if you " +
                "try to represent Him through physical objects, then you would simply" +
                " misrepresent who He is.\n" +
                "\n" +
                "Secondly, when Scripture describes God in physical terms, these" +
                " descriptions are to be taken metaphorically, not literally. For example," +
                " Scripture often speaks about the “eyes of the Lord”. But this phrase does" +
                " not teach that God literally has physical eyes like you and I have but, " +
                "rather, it refers to God’s awareness of everything that is happening.\n" +
                "\n" +
                "Finally, that God is spirit implies that God has no gender: He is neither" +
                " male nor female. But because God reveals Himself in masculine terms, such " +
                "as referring to Himself as “He” and “Father,” we also refer to God in these" +
                " terms. And I think that these masculine terms are nice because they emphasizes" +
                " God’s concern for our welfare (Romans 8:28) and our discipline " +
                "(Hebrews 12:5ff.), His compassion and love for us, His strength, and" +
                " that He is the source of life."));
    }

    private void setupReferenceTextViews() {
        TextView textView = (TextView) findViewById(R.id.referenceTextView);
        textView.setText("Romans 8:28 (ESV)\n" +
                "\n" +
                "²⁸ And we know that for those who love God all things work together for good," +
                " for those who are called according to his purpose.\n" +
                "\n" +
                "Hebrews 12: 5-11\n" +
                "\n" +
                "5 And have you forgotten the exhortation that addresses you as sons?\n" +
                "“My son, do not regard lightly the discipline of the Lord,\n" +
                "    nor be weary when reproved by him.\n" +
                "6 For the Lord disciplines the one he loves,\n" +
                "    and chastises every son whom he receives.”\n" +
                "7 It is for discipline that you have to endure. God is treating you as sons." +
                " For what son is there whom his father does not discipline? \n" +
                "8 If you are left without discipline, in which all have participated, then " +
                "you are illegitimate" +
                " children and not sons. \n" +
                "9 Besides this, we have had earthly fathers who" +
                " disciplined us and we respected them. Shall we not much more be subject to" +
                " the Father of spirits and live? \n" +
                "10 For they disciplined us for a short time " +
                "as it seemed best to them, but he disciplines us for our good, that we may " +
                "share his holiness. \n" +
                "11 For the moment all discipline seems painful rather" +
                " than pleasant, but later it yields the peaceful fruit of righteousness " +
                "to those who have been trained by it.")
        ;
    }
}

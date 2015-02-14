package pw.moter8.interactivestory.model;

import android.content.res.Resources;

import pw.moter8.interactivestory.R;

public class Story {

    private Page[] mPages;

    public Story(Resources resources) {

        String[] mPageText = resources.getStringArray(R.array.myPageBook);
        String[] mChoice1 = resources.getStringArray(R.array.myChoice1);
        String[] mChoice2 = resources.getStringArray(R.array.myChoice2);

        mPages = new Page[7];

        mPages[0] = new Page(
                R.drawable.page0,
                mPageText[0],
                new Choice(mChoice1[0], 1),
                new Choice(mChoice2[0], 2));

        mPages[1] = new Page(
                R.drawable.page1,
                mPageText[1],
                new Choice(mChoice1[1], 3),
                new Choice(mChoice2[1], 4));

        mPages[2] = new Page(
                R.drawable.page2,
                mPageText[2],
                new Choice(mChoice1[2], 4),
                new Choice(mChoice2[2], 6));

        mPages[3] = new Page(
                R.drawable.page3,
                mPageText[3],
                new Choice(mChoice1[3], 4),
                new Choice(mChoice2[3], 5));

        mPages[4] = new Page(
                R.drawable.page4,
                mPageText[4],
                new Choice(mChoice1[4], 5),
                new Choice(mChoice2[4], 6));

        mPages[5] = new Page(
                R.drawable.page5,
                mPageText[5]);

        mPages[6] = new Page(
                R.drawable.page6,
                mPageText[6]);
    }

    public Page getPage(int pageNumber) {

        return mPages[pageNumber];
    }
}

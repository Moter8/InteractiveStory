package pw.moter8.interactivestory.model;


public class Page {

    private int mImageId;
    String mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsAtEnd = false;

    public Page(int imageId, String storyText, Choice choice1, Choice choice2) {
        mImageId = imageId;
        mText = storyText;
        mChoice1 = choice1;
        mChoice2 = choice2;

    }

    public boolean isAtEnd() {
        return mIsAtEnd;
    }

    public void setAtEnd(boolean isAtEnd) {
        mIsAtEnd = isAtEnd;
    }

    public Page(int imageId, String storyText) {
        mImageId = imageId;

        mText = storyText;
        mChoice1 = null;
        mChoice2 = null;
        mIsAtEnd = true;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }
}

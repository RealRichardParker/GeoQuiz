package studio.realrichardparker.geoquiz;

/**
 * Created by Tiger on 9/18/2017.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mUserHasCheated;

    public Question(int mTextResId, boolean mAnswerTrue) {

        this.mTextResId = mTextResId;
        this.mAnswerTrue = mAnswerTrue;
        mUserHasCheated = false;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isUserHasCheated() {
        return mUserHasCheated;
    }

    public void setUserHasCheated(boolean userHasCheated) {
        mUserHasCheated = userHasCheated;
    }
}

package com.sreeram.org;

/**
 * Created by sreeram.srini on 4/12/18.
 */
public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String name) {
        this.title = name;
    }

    public String getName() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
    public void onClick() {
        this.onClickListener.onClick(this.title);
    }



    public interface OnClickListener {
        public void onClick(String title);
    }
}

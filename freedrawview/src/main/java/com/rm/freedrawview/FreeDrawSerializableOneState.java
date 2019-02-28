package com.rm.freedrawview;

import java.io.Serializable;

/**
 * Created by Saman aslani
 */

public class FreeDrawSerializableOneState implements Serializable {

    static final long serialVersionUID = 40L;

    private HistoryPath mPath;


    public FreeDrawSerializableOneState(HistoryPath historyPath) {
        setPath(historyPath);
    }


    public HistoryPath getPath() {
        return mPath;
    }

    public void setPath(HistoryPath path) {
        if (path != null)
            this.mPath = path;
    }

}

package com.sreeram.org;

import java.util.List;

/**
 * Created by sreeram.srini on 4/9/18.
 */
public interface ISavable {
    List<String> write();
    void read(List<String> savedValues);
}

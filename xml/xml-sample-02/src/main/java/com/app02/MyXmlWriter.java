package com.app02;

import com.app01.MyGroup;
import com.app01.Students;

import java.util.List;

public interface MyXmlWriter {

    public String createXml(List<Students> studentsList);
}

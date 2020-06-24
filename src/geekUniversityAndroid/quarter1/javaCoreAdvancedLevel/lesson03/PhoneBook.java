package geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.lesson03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List> base = new HashMap();

    public void add(String lastNames, String numberPhone) {
        if (base.containsKey(lastNames)) {
            List numberPhoneList = base.get(lastNames);
            numberPhoneList.add(numberPhone);
        } else {
            List numberPhoneList = new ArrayList();
            numberPhoneList.add(numberPhone);
            base.put(lastNames, numberPhoneList);
        }
    }

    public List get(String lastNames) {
        return base.get(lastNames);
    }
}

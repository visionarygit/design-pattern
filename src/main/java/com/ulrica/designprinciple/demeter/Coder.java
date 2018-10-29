package com.ulrica.designprinciple.demeter;

import java.util.ArrayList;
import java.util.List;

public class Coder {

//    public int countMachines (List<Machine> list) {
//        return list.size();
//    }

    public int countMachines () {
        List<Machine> list = new ArrayList<Machine>();
        for (int i = 0; i < 20; i++) {
            list.add(new Machine());
        }
        return list.size();
    }
}

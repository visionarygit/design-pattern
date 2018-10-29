package com.ulrica.designprinciple.demeter;

public class Boss {

    //朋友类为Coder Machine不属于朋友类，故不应该在此类中引入Machine类,machine类是Coder的朋友类。故应该将此内容放入到Coder类中
//    public void getMachines(Coder coder) {
//        List<Machine> list = new ArrayList<Machine>();
//        for (int i = 0; i < 20; i++) {
//            list.add(new Machine());
//        }
//        System.out.println(coder.countMachines(list));
//    }

    public void getMachines(Coder coder) {
        System.out.println(coder.countMachines());
    }
}

package com.inter.lam;

public class Coursemain {
    public static void main(String[] args) {

        Icourse icourse=()->{
            String[] web={"html","css","javasctipt"};
            return web;
        };
        String[] web=icourse.showcourse();

        icourse=()->{
            String[] cloud={"aws","googlecloud","azure"};  // using lamda
            return cloud;
        };
        String[] cloud=icourse.showcourse();

        icourse=()->new String[] {"java","spring","junit"}; //shortest way in one line
        String[] fullstack=icourse.showcourse();

        for (String array:web)
            System.out.println(array);

        for (String array:cloud)
            System.out.println(array);

        for (String array:fullstack)
            System.out.println(array);

    }
}
